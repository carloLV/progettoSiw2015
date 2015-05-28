package it.uniroma3.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.servlet.annotation.WebServlet;

import it.uniroma3.modelli.Dipendente;
import it.uniroma3.modelli.FacadeDipendente;

@ManagedBean
public class ControllerDipendente {
	
	@ManagedProperty(value="#{param.email}")
	
	@EJB
	private FacadeDipendente facade;
	
	private String email;
	
	private String pwd1;
	
	private String pwd2;
	
	private String nome;
	
	private String cognome;
	
	private Dipendente dipendente;
	
	public String creaDipendente(){
		this.dipendente=facade.creaDipendente(nome, cognome, email, pwd1);
		return("operazioneEffettuata.jsp");
	}
	
	public String findDipendente(String email){
		this.dipendente=facade.getDipendente(email);
		return "operazioneEffettuata.jsp";
	}

	public FacadeDipendente getFacade() {
		return facade;
	}
	

	public void setFacade(FacadeDipendente facade) {
		this.facade = facade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd1;
	}

	public void setPwd(String pwd) {
		this.pwd1 = pwd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	
	
	

}
