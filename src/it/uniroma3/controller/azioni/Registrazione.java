package it.uniroma3.controller.azioni;

import org.apache.openejb.server.httpd.HttpRequest;

import it.uniroma3.controller.helper.HelperAccesso;
import it.uniroma3.modelli.Dipendente;
import it.uniroma3.modelli.FacadeRegistrazione;

public class Registrazione {
	
	HelperAccesso helper = new HelperAccesso();
	
	public String esegui(HttpRequest request){
		if (helper.isValidRegistrazione(request)){

			String nome=(request.getParameter("nome"));
		    String cognome=(request.getParameter("cognome"));
			String email=(request.getParameter("email"));
			String pwd=(request.getParameter("password"));
			
			FacadeRegistrazione facade = new FacadeRegistrazione();
			Dipendente d=facade.creaDipendente(nome,cognome,email,pwd);
			return ("/operazioneEffettuata.html");
		}
		else return ("/pwdError.jsp");

	}

}
