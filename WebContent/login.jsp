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
<title>Log In</title>
</head>
<body>
	<basefont size="8" color="yellow" >
	<f:view>
		<h:form>
			<div align="center">
				<h1>Benvenuto!</h1>
				<h2>Effettua il login per cominciare</h2>
				<h4>Oppure <a href="registrazione.jsp">registrati</a> per cominciare!</h4>
				<div class="form-group">
					<label>Email</label>
					<h:inputText value="#{controllerUtente.email}" required="true"
						id="email" requiredMessage="Parametro obbligatorio" />
					<h:message for="email" />
				</div>
				<div class="form-group">
					<label>Password</label>
					<h:inputSecret value="#{controllerUtente.pwd}" required="true"
						id="pwd" requiredMessage="Parametro obbligatorio" />
					<h:message for="pwd" />
				</div>
				<h:commandButton value="Conferma" action="#{controllerUtente.login}" />
			</div>
		</h:form>
	</f:view>
</body>

</html>