package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.modelli.FacadeFornitore;
import it.uniroma3.modelli.Fornitore;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ControllerFornitore {
	
	@EJB(name="facadeF")
	private FacadeFornitore facade;
	
	@ManagedProperty(value="#{param.email}")
	private String email;
	
	private String partitaIva;
	
	private String telefono;
	
	private String indirizzo;
	
	private Fornitore fornitore;

	private List<Fornitore> fornitori;
	
	public String creaFornitore(){
		fornitore = facade.creaFornitore(partitaIva, indirizzo, telefono, email);
		return ("operazioneEffettuata.jsp");
		
	}
	
	public String findFornitore(){
		this.fornitore=facade.getFornitore(email);
		return "visualizzaFornitore.jsp";
	}
	
	
	public String findFornitore(String email){
		this.fornitore=facade.getFornitore(email);
		return "visualizzaFornitore.jsp";
	}
	
	public String listaFornitori() {
		this.fornitori = facade.getTuttiFornitori();
		return "visualizzaTuttiFornitori.jsp"; 
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}
	
	

}
