//package it.uniroma3.controller.azioni;
//
//import javax.ejb.EJB;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.openejb.server.httpd.HttpRequest;
//
//import it.uniroma3.controller.helper.HelperAccesso;
//import it.uniroma3.modelli.Dipendente;
//import it.uniroma3.modelli.FacadeDipendente;
//
//@WebServlet("/registrazione")
//public class Registrazione {
//	@EJB
//	private FacadeDipendente facade;
//	
//	
//	
//	public String esegui(HttpServletRequest request){
//		
//		HelperAccesso helper = new HelperAccesso();
//		
//		if (helper.isValidRegistrazione(request)){
//
//			String nome=(request.getParameter("nome"));
//		    String cognome=(request.getParameter("cognome"));
//			String email=(request.getParameter("email"));
//			String pwd=(request.getParameter("password"));
//			
//			FacadeDipendente facade = new FacadeDipendente();
//			Dipendente d=facade.creaDipendente(nome,cognome,email,pwd);
//			request.setAttribute("dipendente", d);
//			return ("/operazioneEffettuata.jsp");
//		}
//		else return ("/pwdError.jsp");
//
//	}
//
//}