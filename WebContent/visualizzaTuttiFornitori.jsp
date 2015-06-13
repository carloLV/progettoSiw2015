<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Fornitori</title>
</head>
<body>
	<h1>Lista fornitori</h1>
	<table>
		<tr>
			<th>email</th>
			<th>partita Iva</th>
		</tr>
		<c:forEach var="fornitore" items="${fornitori}">
			<tr>
				<td><a
					href="<c:url value="/it.uniroma3.controller/fornitore.get?id=${fornitore.email}" />">${fornitore.email}</a></td>
				<td>${fornitore.partitaIva}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>