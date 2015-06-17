<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerca prodotto</title>
</head>
<body>
<label>Digita il nome del prodotto da cercare o cerca tutti i prodotti presenti</label>
<f:view>
		<h:form>
			<div>
				<label>nome</label>
				<h:inputText value="#{controllerProdotto.nome}"
					id="nome" />
			</div>
			<div>
				<h:commandButton value="Cerca"
					action="#{controllerProdotto.findProdotto}" />
				<a href="scegliOperazione.jsp">
				<button class="btn">Annulla</button></a> <br>
			</div>
			<!-- <div><h:commandButton value="Elenco completo"
					action="#{controllerFornitore.listaFornitori}" /></div> -->
					<h:commandLink action="#{controllerProdotto.listProdotti}"
						value="Elenco Prodotti" />
		</h:form>
	</f:view>
</body>
</html>