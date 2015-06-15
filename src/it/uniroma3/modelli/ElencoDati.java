//classe da eliminare. Bisogna scompattarla in facade per ogni operazione

package it.uniroma3.modelli;

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

	

	private Set<Ordine> ordini=new HashSet<Ordine>();//la lista deve essere oridnata in base alla data di inserimento

	private Map<String,Fornitore> fornitori= new HashMap<String,Fornitore>();

	private Ordine ordineCorrente;

	private Dipendente dipendenteCorrente;

	//metodi autogenerati
	
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
	//metodi di visualizzazione delegati a pagine jsp
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{

		
		ServletContext application=getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("");
		rd.forward(request, response);
		return;
	}
	
}
