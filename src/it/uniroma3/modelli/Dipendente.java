package it.uniroma3.modelli;

import javax.persistence.*;

@Entity
public class Dipendente {
		
	@Id
	private String email;
	
	@Column(nullable=false)
	private String pwd;
	
	@Column(nullable=false, length=25)
	private String nome;
	
	@Column(nullable=false, length=25)
	private String cognome;
	
	public Dipendente(String email, String pwd){
		this.email=email;
		this.pwd=pwd;
	}

	public Dipendente() {
		
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

	public void confermaOrdine(Ordine o) {
		System.out.println("Non si dispone delle autorizzazioni per confermare l'ordine. \nContattare l'amministratore.");
		
	}
	
	

}
