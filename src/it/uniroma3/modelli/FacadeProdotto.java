package it.uniroma3.modelli;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless(name="facadeP")
public class FacadeProdotto  {

	@PersistenceContext(unitName="unit-dbProgetto" )
	private EntityManager em;

	public Prodotto creaProdotto(String nome,  Float prezzo, String descrizione) {
		Prodotto p = new Prodotto();
		p.setNome(nome);
		p.setPrezzo(prezzo);
		p.setDescrizione(descrizione);
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
		List<Prodotto> prodotti = em.createQuery(cq).getResultList();
		return prodotti;
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

