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
	
	@EJB(beanName="facadeD")
	private FacadeDipendente facade;
	
	@ManagedProperty(value="#{param.email}")
	private String email;
	
	private String pwd1;
	
	private String pwd2;
	
	private String nome;
	
	private String cognome;
	
	private Dipendente dipendente;

	private Object dipendenti;
	
	public String creaDipendente(){
		if (pwd1.equals(pwd2)){
		this.dipendente=facade.creaDipendente(nome, cognome, email, pwd1);
		return("operazioneEffettuata.jsp");
		}
		else return ("Error.jsp");
	}
	
	public String findDipendente(){
		this.dipendente=facade.getDipendente(email);
		return "operazioneEffettuata.jsp";
	}
	
	public String findDipendente(String email){
		this.dipendente=facade.getDipendente(email);
		return "operazioneEffettuata.jsp";
	}

	public String listaDipendenti(){
		this.dipendenti=facade.getTuttiDipendenti();
		return "visualizzaTuttiDipendenti.jsp";
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
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

