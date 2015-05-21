package it.uniroma3.modelli;

import java.util.HashMap;
import java.util.Map;

public class FacadeRegistrazione {
	
	private Map<String,Dipendente> utenti= new HashMap<String,Dipendente>();
	
	public Map<String, Dipendente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Map<String, Dipendente> utenti){  //Map<email,dipendente>
		this.utenti = utenti;
	}


	public Dipendente creaDipendente(String nome, String cognome, String email, String pwd) {
		Dipendente d = new Dipendente(email,pwd);
		d.setNome(nome);
		d.setCognome(cognome);
		this.utenti.put(d.getEmail(), d);
		return d;
	}
	
	//metodi di aggiunta, cancellazione e ricerca nelle liste da implementare

}
