<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css"
	rel="stylesheet" />
<title>Crea Ordine</title>
</head>
<body>
	<f:view>
		<h:form>
			<table class="table table-striped">
				<tr>
					<th>Prodotto</th>
					<th>Descrizione</th>
					<th>Quantita'</th>
					<th>Ordinare si/no</th>
				</tr>
				<c:forEach var="prodotto" items="${controllerProdotto.prodotti }">
					<tr>
						<td><h:commandLink
								action="#{controllerProdotto.findProdotto}"
								value="#{prodotto.nome}">
								<f:param name="id" value="#{prodotto.id}" />
							</h:commandLink> ${prodotto.nome}</td>
						<td>${prodotto.descrizione}</td>
						<td><select class="form-control">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
						</select></td>
						<td>
						<h:selectBooleanCheckbox value="si/no" id="flag" />
						
						<!--<h:commandButton value="Ordina questo prodotto"
								action="#{controllerOrdine.creaRigaOrdine}" />
								-->
								</td>
					</tr>
				</c:forEach>
			</table>
			</br>
			</br>
			<h:commandButton value="Conferma ordine"
				action="#{controllerOrdine.creaOrdine}" />
		</h:form>
	</f:view>

</body>
</html>