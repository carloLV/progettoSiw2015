<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Prodotti</title>
</head>
<body>
<f:view>
<h1>Prodotti</h1>
<h:form>
<table>
	<tr>
		<th>Nome</th><th>Prezzo</th>
	</tr>
	<c:forEach var="prodotto" items="#{controllerProdotto.prodotti}">
		<tr><td>
		<h:commandLink action="#{controllerProdotto.findProdotto}" value="#{prodotto.nome}">
			<f:param name="id" value="#{prodotto.id}" />
		</h:commandLink>
		</td><td>${product.prezzo}</td></tr>
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>