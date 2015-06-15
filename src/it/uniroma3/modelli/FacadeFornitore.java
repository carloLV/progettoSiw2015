package it.uniroma3.modelli;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpSession;

@Stateless(name="facadeF")
public class FacadeFornitore {
	
	@PersistenceContext(unitName="unit-dbProgetto")
	private EntityManager em;
	
		
	public Fornitore creaFornitore(String partitaIva, String indirizzo, String telefono, String email){
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
//		CriteriaQuery<Fornitore> cq = em.getCriteriaBuilder().createQuery(Fornitore.class);
//		cq.select(cq.from(Fornitore.class));
//		List<Fornitore> fornitori = em.createQuery(cq).getResultList();
//		return fornitori;
		Query q=this.em.createQuery("SELECT f FROM Fornitore f");
		List<Fornitore> fornitori=q.getResultList();
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
	
			session.setAttribute("visualizzaTuttiFornitori", fornitori);
		return fornitori;
	}
	
	public void cancellaFornitore(String email){
		Fornitore f=em.find(Fornitore.class,email);
		em.remove(f);
	}


}
