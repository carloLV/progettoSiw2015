package it.uniroma3.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import it.uniroma3.modelli.Dipendente;
import it.uniroma3.modelli.FacadeDipendente;
import it.uniroma3.modelli.FacadeOrdine;
import it.uniroma3.modelli.Prodotto;
import it.uniroma3.modelli.RigaOrdine;
import it.uniroma3.modelli.Ordine;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.servlet.http.HttpSession;

@ManagedBean
public class ControllerOrdine {
	
	@EJB(beanName="facadeO")
	private FacadeOrdine facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	private Dipendente richiedente;
	
	private List<RigaOrdine> righeOrdine = new ArrayList<RigaOrdine>();
	
	private Date dataApertura;
	
	private Date dataChiusura;
	
	private Date dataEvasione;
	
	private int quantita;
	
	private Prodotto prodotto;
	
	private boolean flag;
	

	private Ordine ordine;
	
	
	public List<RigaOrdine> getRigheOrdine() {
		return righeOrdine;
	}

	public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
		this.righeOrdine = righeOrdine;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	
	public String creaOrdine(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
		this.richiedente=(Dipendente) session.getAttribute("utente");
		
		this.ordine=facade.creaOrdine(this.richiedente);
		Calendar calendar = new GregorianCalendar();
		Date dataApertura = calendar.getTime();
		ordine.setDataApertura(dataApertura);
		if (flag){
			RigaOrdine ro=new RigaOrdine();
			ro.setProd(prodotto);
			ro.setQuantity(quantita);
			this.righeOrdine.add(ro);
			}
		
		this.ordine.setRigheOrdine(righeOrdine);
		facade.updateOrdine(ordine);
		return "inserisciProdotti.jsp";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String evadiOrdine(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
		this.richiedente=(Dipendente) session.getAttribute("utente");
		if (richiedente.isAdmin()){
		this.ordine=facade.getOrdine(id);
		Calendar calendar = new GregorianCalendar();
		Date dataEvasione = calendar.getTime();
		ordine.setDataEvasione(dataEvasione);
		facade.updateOrdine(ordine);
		return "operazioneEffettuata.jsp";}
		else return "Error.jsp";
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Date getDataChiusura() {
		return dataChiusura;
	}

	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public Date getDataEvasione() {
		return dataEvasione;
	}

	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}

	public Dipendente getRichiedente() {
		return richiedente;
	}

	public void setRichiedente(Dipendente richiedente) {
		this.richiedente = richiedente;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
