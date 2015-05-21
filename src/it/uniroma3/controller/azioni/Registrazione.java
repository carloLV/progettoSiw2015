package it.uniroma3.controller.azioni;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.apache.openejb.server.httpd.HttpRequest;

import it.uniroma3.controller.helper.HelperAccesso;
import it.uniroma3.modelli.Dipendente;
import it.uniroma3.modelli.FacadeRegistrazione;

public class Registrazione {
	@EJB
	private FacadeRegistrazione facade;
	
	
	
	public String esegui(HttpServletRequest request){
		
		HelperAccesso helper = new HelperAccesso();
		
		if (helper.isValidRegistrazione(request)){

			String nome=(request.getParameter("nome"));
		    String cognome=(request.getParameter("cognome"));
			String email=(request.getParameter("email"));
			String pwd=(request.getParameter("password"));
			
			FacadeRegistrazione facade = new FacadeRegistrazione();
			Dipendente d=facade.creaDipendente(nome,cognome,email,pwd);
			request.setAttribute("dipendente", d);
			return ("/operazioneEffettuata.html");
		}
		else return ("/pwdError.jsp");

	}

}
