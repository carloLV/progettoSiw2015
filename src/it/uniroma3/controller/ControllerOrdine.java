package it.uniroma3.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import it.uniroma3.modelli.Dipendente;
import it.uniroma3.modelli.FacadeDipendente;
import it.uniroma3.modelli.FacadeOrdine;
import it.uniroma3.modelli.RigaOrdine;
import it.uniroma3.modelli.Ordine;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Column;

@ManagedBean
public class ControllerOrdine {
	
	@EJB(beanName="facadeO")
	private FacadeOrdine facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	@Column(nullable=false)
	private Dipendente richiedente;
	
//	private List<RigaOrdine> righeOrdine = new ArrayList<RigaOrdine>();
	
	private Date dataApertura;
	
	private Date dataChiusura;
	
	private Date dataEvasione;
	
	private Ordine ordine;
	
	public String creaOrdine(){
		this.ordine=facade.creaOrdine(richiedente);
		return "inserisciProdotti.jsp";
	}
	
	public String evadiOrdine(){
		this.ordine=facade.getOrdine(id);
		Calendar calendar = new GregorianCalendar();
		Date dataEvasione = calendar.getTime();
		ordine.setDataEvasione(dataEvasione);
		facade.updateOrdine(ordine);
		return "operazioneEffettuata.jsp";
	}
}
