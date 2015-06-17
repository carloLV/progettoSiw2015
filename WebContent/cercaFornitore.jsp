<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerca fornitore</title>
</head>
<body>
	<label>Digita la mail del fornitore da cercare o cerca tutti i
		fornitori presenti</label>
	<f:view>
		<h:form>
			<div>
				<label>Email</label>
				<h:inputText value="#{controllerFornitore.email}" id="email" />
			</div>
			<div>
				<h:commandButton value="Cerca"
					action="#{controllerFornitore.findFornitore}" />
				<a href="scegliOperazione.jsp">
					<button class="btn">Annulla</button>
				</a> <br>
			</div>
			<h:commandLink action="#{controllerFornitore.listaFornitori}"
				value="Elenco Completo" />
		</h:form>
	</f:view>
</body>
</html>