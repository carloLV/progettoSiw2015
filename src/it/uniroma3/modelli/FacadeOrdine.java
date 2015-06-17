package it.uniroma3.modelli;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpSession;

@Stateless(name="facadeO")
public class FacadeOrdine {
	
	@PersistenceContext(unitName="unit-dbProgetto")
	private EntityManager em;
	
	public Ordine creaOrdine(Dipendente richiedente){
		Ordine o=new Ordine();
		o.setRichiedente(richiedente);
		Calendar calendar = new GregorianCalendar();
		Date dataApertura = calendar.getTime();
		o.setDataApertura(dataApertura);
		em.persist(o);
		return o;
	}
	
	public Ordine getOrdine(Long id){
		Ordine o =em.find(Ordine.class,id);
		return o;
	}
	
	public List<Ordine> getTuttiOrdini(){
		Query q=this.em.createQuery("SELECT p FROM Prodotto p");
		List<Ordine> ordini=q.getResultList();
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
		session.setAttribute("visualizzaTuttiProdotti", ordini);
		return ordini;
	}
	
	public void cancellaOrdine(Long id){
		Ordine o=em.find(Ordine.class,id);
		em.remove(o);
	}
	
	public void updateOrdine(Ordine ordine) {
		em.merge(ordine);
	}

}
