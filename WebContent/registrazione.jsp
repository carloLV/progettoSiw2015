<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap -->
<!--<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">  -->
<title>Registrazione</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				<label>Nome</label>
				<h:inputText value="#{controllerDipendente.nome}" required="true"
					id="nome" requiredMessage="Parametro obbligatorio" />
				<h:message for="nome" />
			</div>
			<div>
				<label>Cognome</label>
				<h:inputText value="#{controllerDipendente.cognome}" required="true"
					id="cognome" requiredMessage="Parametro obbligatorio" />
				<h:message for="cognome" />
			</div>
			<div>
				<label>Email</label>
				<h:inputText value="#{controllerDipendente.email}" required="true"
					id="email" requiredMessage="Parametro obbligatorio" />
				<h:message for="email" />
			</div>
			<div>
				<label>Password</label>
				<h:inputText value="#{controllerDipendente.pwd1}" required="true"
					id="pwd1" requiredMessage="Parametro obbligatorio" />
				<h:message for="pwd1" />
			</div>
			<div>
				<label>Password</label>
				<h:inputText value="#{controllerDipendente.pwd2}" required="true"
					id="pwd2" requiredMessage="Parametro obbligatorio" />
				<h:message for="pwd2" />
			</div>
			<div>
				<h:commandButton value="Conferma"
					action="#{controllerDipendente.creaDipendente}" />
				<a href="index.html"><button class="btn">Annulla</button></a>
			</div>
		</h:form>
	</f:view>
</body>
</html>