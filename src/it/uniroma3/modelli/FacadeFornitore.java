package it.uniroma3.modelli;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless(name="facadeF")
public class FacadeFornitore {
	
	@PersistenceContext(unitName="unit-dbProgetto")
	private EntityManager em;
	
		
	public Fornitore creaFornitore(String partitaIva, String indirizzo,
			String telefono, String email){
		Fornitore f = new Fornitore(partitaIva, email);
		f.setIndirizzo(indirizzo);
		f.setTelefono(telefono);
		em.persist(f);
		return f;
	}
	
	public Fornitore getFornitore(String email){
		Fornitore f=em.find(Fornitore.class,email);
		return f;
	}
	
	public List<Fornitore> getTuttiFornitori(){
		CriteriaQuery<Fornitore> cq = em.getCriteriaBuilder().createQuery(Fornitore.class);
		cq.select(cq.from(Fornitore.class));
		List<Fornitore> fornitori = em.createQuery(cq).getResultList();
		return fornitori;
	}
	
	public void cancellaFornitore(String email){
		Fornitore f=em.find(Fornitore.class,email);
		em.remove(f);
	}


}
