<<<<<<< HEAD
=======

>>>>>>> 00d88e1565206cf71cdeac0a379fed15aece89e0
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css"
	rel="stylesheet" />
<title>Registrazione</title>
</head>
<body background="C:\Users\Carlo\Desktop\Programming\Workspace_Java\progettoSiw2015\immagini\verde_paesaggio.jpg">
	<f:view>
		<h:form>
			<div class="jumbotron">
				<h1>Welcome!</h1><br>
				<h3>Sali a bordo e inizia a lavorare con noi!</h3>
				<p>
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
				<h:inputSecret value="#{controllerDipendente.pwd2}" required="true"
						id="pwd2" requiredMessage="Parametro obbligatorio" />
				<h:message for="pwd2" />
			</div>
			</p>
				
  <p>
					<h:commandButton value="Conferma"
						action="#{controllerDipendente.creaDipendente}" />
				</p>
</div>
			
			
		</h:form>
	</f:view>
</body>
<<<<<<< HEAD
</html>
=======
>>>>>>> 00d88e1565206cf71cdeac0a379fed15aece89e0
