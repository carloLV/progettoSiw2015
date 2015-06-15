package it.uniroma3.gestioneProdotti;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Azione {
	public String perform(HttpServletRequest request, ProdottoFacade prodottoFacade);
}
