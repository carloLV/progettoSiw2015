<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>evadi ordine</title>
</head>
<body>
<label>Digita il codice dell'ordine da cercare</label>
<f:view>
		<h:form>
			<div>
				<label>codice ordine</label>
				<h:inputText value="#{controllerOrdine.id}"
					id="id" />
			</div>
			<div>
				<h:commandButton value="cerca"
					action="#{controllerOrdine.findOrdine}" />
				<a href="scegliOperazione.jsp">
				<button class="btn">Annulla</button></a> <br>
			</div>
		</h:form>
	</f:view>
</body>
</html>
