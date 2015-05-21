package it.uniroma3.modelli;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;

@Stateless(name="rFacade")
public class FacadeRegistrazione {
	
	@PersistenceContext(unitName = "unit-jee-progettoSiw2015")
	private EntityManager em;
	private Map<String,Dipendente> utenti= new HashMap<String,Dipendente>();
	
	public Map<String, Dipendente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Map<String, Dipendente> utenti){  //Map<email,dipendente>
		this.utenti = utenti;
	}


	public Dipendente creaDipendente(String nome, String cognome, String email, String pwd) {
		Dipendente d = new Dipendente(email,pwd);
		d.setNome(nome);
		d.setCognome(cognome);
		this.utenti.put(d.getEmail(), d);
		em.persist(d);
		return d;
	}
	
	
	//metodi di aggiunta, cancellazione e ricerca nelle liste da implementare
	public Dipendente getDipendente(Long id) {
	    Dipendente d = em.find(Dipendente.class, id);
		return d;
	}
	
	public List<Dipendente> getAllDipendenti() {
        CriteriaQuery<Dipendente> cq = em.getCriteriaBuilder().createQuery(Dipendente.class);
        cq.select(cq.from(Dipendente.class));
        List<Dipendente> dipendenti = em.createQuery(cq).getResultList();
		return dipendenti;
	}

	public void updateDipendente(Dipendente dipendente) {
        em.merge(dipendente);
	}
	
    private void deleteDipendente(Dipendente dipendente) {
        em.remove(dipendente);
    }

	public void deleteDipendente(Long id) {
		Dipendente dipendente = em.find(Dipendente.class, id);
        deleteDipendente(dipendente);
	}

}
