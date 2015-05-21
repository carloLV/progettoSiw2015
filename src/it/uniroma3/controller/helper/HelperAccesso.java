package it.uniroma3.controller.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperAccesso {

	public boolean isValidRegistrazione(HttpServletRequest request){

		boolean error=false;
		if (request.getParameter("password").equals(request.getParameter("password2")))
			request.setAttribute("pwdErr", "Password non valida");
		else error=true;
		
		return !error;
	}

}
