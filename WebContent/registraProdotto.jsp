<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap -->
<!--<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">  -->
<title>Registra Prodotto</title>
</head>
<body>
<<<<<<< HEAD
	<f:view>
		<h:form>
			<div>
				<label>Nome</label>
				<h:inputText value="#{controllerProdotto.nome}" required="true" id="nome"
					requiredMessage="This parameter is mandatory" />
				<h:message for="nome" />
			</div>
			<div>
				<label>Prezzo</label>
				<h:inputText value="#{controllerProdotto.prezzo}" id="prezzo"
					requiredMessage="This parameter is mandatory" />
				<h:message for="prezzo" />
			</div>
			<div>
				<label>Descrizione</label>
				<h:inputText value="#{controllerProdotto.descrizione}"
					id="descrizione" requiredMessage="This parameter is mandatory" />
				<h:message for="descrizione" />
			</div>
			<div>
				<h:commandButton value="Conferma"
					action="#{controllerProdotto.creaProdotto}" />
				<a href="index.html"><button class="btn">Annulla</button></a>
			</div>
		</h:form>
	</f:view>
</body>
</html>