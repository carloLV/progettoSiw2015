<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap -->
<!--<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">  -->
<title>Registrazione</title>
</head>
<body>
<f:view>
<h:form>
			<div><label>Nome</label> 
			<h:inputText value="#{controllerDipendente.nome}" id="nome" requiredMessage="This parameter is mandatory"/>
			<h:message for="nome"/> </div> 
			<div><label>Cognome</label> 
			<h:inputText value="#{controllerDipendente.cognome}" id="cognome" requiredMessage="This parameter is mandatory"/>
			<h:message for="cognome"/> </div>
			<div><label>Email</label>
			<h:inputText value="#{controllerDipendente.email}" id="email" requiredMessage="This parameter is mandatory"/>
			<h:message for="email"/>  </div>
			<div><label>Password</label>
			<h:inputText value="#{controllerDipendente.pwd1}" id="pwd1" requiredMessage="This parameter is mandatory"/>
			<h:message for="pwd1"/> </div> 
			<div><label>Password</label>
			<h:inputText value="#{controllerDipendente.pwd2}" id="pwd2" requiredMessage="This parameter is mandatory"/>
			<h:message for="pwd2"/> </div>
			<div><h:commandButton value="Conferma" action="#{controllerDipendente.creaDipendente}"/>
			<a href="index.html"><button class="btn">Annulla</button></a></div>
</h:form>
</f:view>
</body>
</html>