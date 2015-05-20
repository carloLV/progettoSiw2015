package dati;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.openejb.server.httpd.HttpRequest;

@WebServlet("/registrazione")
public class ElencoDati extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	private Map<String,Dipendente> utenti= new HashMap<String,Dipendente>();

	private Set<Ordine> ordini=new HashSet<Ordine>();//la lista deve essere oridnata in base alla data di inserimento

	private Map<String,Fornitore> fornitori= new HashMap<String,Fornitore>();

	private Ordine ordineCorrente;

	private Dipendente dipendenteCorrente;

	//metodi autogenerati
	public Map<String, Dipendente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Map<String, Dipendente> utenti) {
		this.utenti = utenti;
	}

	public Set<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(Set<Ordine> ordini) {
		this.ordini = ordini;
	}

	public Map<String, Fornitore> getFornitori() {
		return fornitori;
	}

	public void setFornitori(Map<String, Fornitore> fornitori) {
		this.fornitori = fornitori;
	}

	//fine metodi autogenerati
	//-------------------------------------------------

	public void mostraFornitori(){
		for (Fornitore f: this.fornitori.values()){
			System.out.println("Elenco Fornitori:");
			System.out.println(f.toString() + "/n");
		}
	}

	public void mostraUtenti(){
		for (Dipendente d: this.utenti.values()){
			System.out.println("Elenco Utenti:");
			System.out.println(d.toString() + "/n");
		}		
	}

	public void mostraOrdini(){
		for (Ordine o: this.ordini){
			System.out.println("Elenco Ordini:");
			System.out.println(o.toString() + "/n");
		}
	}
	//forse meglio lasciare la visualizzazione alle pagine html-jsp
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String nextPage=null;
		
		Dipendente u=new Dipendente();
		u.setNome(request.getParameter("nome"));
		u.setCognome(request.getParameter("cognome"));
		u.setEmail(request.getParameter("email"));
		if (request.getParameter("password").equals(request.getParameter("password2"))){
			u.setPwd(request.getParameter("password"));
			nextPage="/operazioneEffettuata.html";
		}
			
		else nextPage="/pwdError.jsp";
		
		ServletContext application=getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}
	
}
