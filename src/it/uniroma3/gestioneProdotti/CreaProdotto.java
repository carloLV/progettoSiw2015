package it.uniroma3.gestioneProdotti;

//import it.uniroma3.controller.helper.HelperProduct;
//import it.uniroma3.model.Product;
//import it.uniroma3.model.ProductFacade;

import it.uniroma3.modelli.Prodotto;

import javax.servlet.http.HttpServletRequest;

public class CreaProdotto implements Azione {
public String perform(HttpServletRequest request, ProdottoFacade prodottoFacade) {
		
		HelperProdotto helper = new HelperProdotto();
		
		if (helper.isValid(request)) {
			String nome = request.getParameter("nome");
			String codice = request.getParameter("codice");
			Float costo = Float.parseFloat(request.getParameter("costo"));
			String descrizione = request.getParameter("descrizione");
			
			Prodotto p = (prodottoFacade).creaProdotto(nome, codice, costo);
			request.setAttribute("prodotto", p);
			
			return "/prodotto.jsp";
		} else
			return "/newProdotto.jsp";
	}
}


