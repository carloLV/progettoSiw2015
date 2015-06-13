package it.uniroma3.modelli;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

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
		CriteriaQuery<Ordine> cq = em.getCriteriaBuilder().createQuery(Ordine.class);
		cq.select(cq.from(Ordine.class));
		List<Ordine> dipendenti = em.createQuery(cq).getResultList();
		return dipendenti;
	}
	
	public void cancellaOrdine(Long id){
		Ordine o=em.find(Ordine.class,id);
		em.remove(o);
	}
	
	public void updateOrdine(Ordine ordine) {
		em.merge(ordine);
	}

}
