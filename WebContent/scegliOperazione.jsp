<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Operazioni</title>
</head>
<body>
	<f:view>
		<h:form>
			<h1>Scegli un operazione</h1>
			<table background="yellow" align="center">
				<tr>
					<td>
						<div>
							<a href="inserisciFornitore.jsp"><button type="button"
									class="btn btn-primary btn-lg">Nuovo fornitore</button></a>
						</div>
					</td>
					<td>
						<div>
							<a href="registraProdotto.jsp"><button type="button"
									class="btn btn-primary btn-lg">Nuovo prodotto</button></a>
						</div>
					</td>
					<td>
						<div>
							<h:commandButton value="Nuovo ordine"
								action="#{controllerProdotto.catalogoOrdine}"></h:commandButton>
						</div>
					</td>
				</tr>
				<tr>
					<td><br></td>
					<td><br></td>
					<td><br></td>
				</tr>
				<tr>
					<td>
						<div>
							<a href="cercaFornitore.jsp"><button type="button"
									class="btn btn-success btn-lg">Cerca fornitore</button></a>
						</div>
					</td>
					<td>
						<div>
							<a href="cercaProdotto.jsp"><button type="button"
									class="btn btn-success btn-lg">Cerca prodotto</button></a>
						</div>
					</td>
					<td>
						<div>
							<a href="cercaOrdine.jsp"><button type="button"
									class="btn btn-success btn-lg">Cerca ordine</button></a>
						</div>
					</td>

				</tr>
				<tr>
					<td><br></td>
					<td><br></td>
					<td><br></td>
				</tr>
				<tr>
					<td>
						<div>
							<a href="evadiOrdine.jsp"><button type="button"
									class="btn btn-success btn-lg">Evadi ordine</button></a>
						</div>
					</td>
				</tr>
			</table>
		</h:form>
	</f:view>
</body>
</html>