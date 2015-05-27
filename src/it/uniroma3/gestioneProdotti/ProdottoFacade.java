package it.uniroma3.gestioneProdotti;

//import it.uniroma3.model.Product;

import it.uniroma3.modelli.Prodotto;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless(name="pFacade")
public class ProdottoFacade {


	@PersistenceContext(unitName = "unit-progettoSiw2015")  //gestire database
	private EntityManager em;

	public Prodotto creaProdotto(String nome, String codice, Float costo) {
		Prodotto p = new Prodotto(nome, codice, costo);
		em.persist(p);
		return p;
	}
	public Prodotto getProdotto(Long id) {
		Prodotto p = em.find(Prodotto.class, id);
		return p;
	}

	public List<Prodotto> getAllProdotti() {
		CriteriaQuery<Prodotto> cq = em.getCriteriaBuilder().createQuery(Prodotto.class);
		cq.select(cq.from(Prodotto.class));
		List<Prodotto> p = em.createQuery(cq).getResultList();
		return p;
	}

	public void updateProdotto(Prodotto p) {
		em.merge(p);
	}

	private void deleteProdotto(Prodotto p) {
		em.remove(p);
	}

	public void deleteProdotto(Long id) {
		Prodotto p = em.find(Prodotto.class, id);
		deleteProdotto(p);
	}




}

