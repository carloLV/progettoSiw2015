package it.uniroma3.modelli;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless(name="facadeD")
public class FacadeDipendente {
	
	@PersistenceContext(unitName="unit-dbProgetto")
	private EntityManager em;
	
	public Dipendente creaDipendente(String nome, String cognome, String email, String pwd) {
		Dipendente d = new Dipendente(email,pwd);
		d.setNome(nome);
		d.setCognome(cognome);
		em.persist(d);
		return d;
	}

	public Dipendente getDipendente(String email){
		Dipendente d=em.find(Dipendente.class,email);
		return d;
	}
	
	public List<Dipendente> getTuttiDipendenti(){
		CriteriaQuery<Dipendente> cq = em.getCriteriaBuilder().createQuery(Dipendente.class);
		cq.select(cq.from(Dipendente.class));
		List<Dipendente> dipendenti = em.createQuery(cq).getResultList();
		return dipendenti;
	}
	
	public void cancellaDipendente(String email){
		Dipendente d=em.find(Dipendente.class,email);
		em.remove(d);
	}
	
	//metodi di aggiunta, cancellazione e ricerca nelle liste da implementare

}
