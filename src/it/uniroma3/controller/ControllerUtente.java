package it.uniroma3.controller;

import it.uniroma3.modelli.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ControllerUtente {
	
	@EJB(beanName="facadeD")
	private FacadeDipendente facade;
	
	private String email;
	
	private String pwd;
	
	private Dipendente user;
	
	
	
	
	public String login(){
		Dipendente d=facade.getDipendente(email);
		if (d!=null && d.getPwd().equals(pwd)){
			
			return ("scegliOperazione.jsp");
			
		}
		else return "ripetiLogin.jsp";
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	

}
