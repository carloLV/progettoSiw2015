package it.uniroma3.modelli;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FacadeProdotto {
	
	@PersistenceContext(unitName="unit-dbProgetto")
	private EntityManager em;
	
	

}
