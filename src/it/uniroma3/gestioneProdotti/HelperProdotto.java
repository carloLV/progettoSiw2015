package it.uniroma3.gestioneProdotti;

import javax.servlet.http.HttpServletRequest;

public class HelperProdotto {
	public boolean isValid(HttpServletRequest request) {

		String nome = request.getParameter("nome");
		String codice = request.getParameter("codice");
		String costo = request.getParameter("costo");
		boolean errors = false;

		if ( nome == null || nome.equals("")) {
			request.setAttribute("nomeErr","Nome non valido");
			errors = true;
		}

		if ( codice == null || codice.equals("")) {
			request.setAttribute("codiceErr","Codice non valido");
			errors = true;
		}

		if ( costo == null || costo.equals("")) {
			request.setAttribute("codiceErr","Costo non valido");
			errors = true;
		}
		else {
			try{
				Float.parseFloat(costo);
			}
			catch (NumberFormatException e) {
				request.setAttribute("costoErr","Costo deve essere un numero");
				errors = true;
			}
		}
		return !errors;
	}
}
