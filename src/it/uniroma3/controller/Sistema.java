package it.uniroma3.controller;

import it.uniroma3.modelli.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hsqldb.lib.OrderedHashSet;

@WebServlet("/sistema/*") 
public class Sistema extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@EJB(beanName="rFacade")
	private FacadeRegistrazione FacadeRegistrazione;

	
//	private ElencoDati elencoDati;

public Sistema(){
		
	}
	
	public void aggiungiOrdine (){
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String nextPage=null;
		
		String emailProv=request.getParameter("email");
		String pswProv=request.getParameter("psw");
		
//		Map<String,Dipendente> utenti= ElencoDati.getUtenti();
//		if()
//	}
	}

}
