package it.uniroma3.modelli;

import javax.persistence.Entity;

@Entity
public class Amministratore extends Dipendente{

	public Amministratore(String email, String pwd) {
		super(email, pwd);
		// TODO Auto-generated constructor stub
	}
	public Amministratore(){
		
	}
	
	public boolean isAdmin(){
		return true;
	}
}


	