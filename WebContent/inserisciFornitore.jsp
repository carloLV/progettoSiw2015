<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserimento fornitore</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				<label>Email</label>
				<h:inputText value="#{controllerFornitore.email}" required="true"
					id="email" requiredMessage="Parametro obbligatorio" />
				<h:message for="email" />
			</div>
			<div>
				<label>Partita Iva</label>
				<h:inputText value="#{controllerFornitore.partitaIva}"
					required="true" id="partitaIva"
					requiredMessage="Parametro obbligatorio" />
				<h:message for="partitaIva" />
			</div>
			<div>
				<label>Telefono</label>
				<h:inputText value="#{controllerFornitore.telefono}" required="true"
					id="telefono" requiredMessage="Parametro obbligatorio" />
				<h:message for="telefono" />
			</div>
			<div>
				<label>Indirizzo</label>
				<h:inputText value="#{controllerFornitore.indirizzo}"
					required="true" id="indirizzo"
					requiredMessage="Parametro obbligatorio" />
				<h:message for="indirizzo" />
			</div>
			<div>
				<h:commandButton value="Conferma"
					action="#{controllerFornitore.creaFornitore}" />
				<a href="index.html"><button class="btn">Annulla</button></a>
			</div>
		</h:form>
	</f:view>

</body>
</html>