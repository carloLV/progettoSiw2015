<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet" />
<title>Fornitore</title>
</head>
<body>

<f:view>
<h1>${controllerFornitore.fornitore.email}</h1>
<h2>Dettagli</h2>
<h4><div>Partita Iva: ${controllerFornitore.fornitore.partitaIva}</div></h4>
<h4><div>Telefono: ${controllerFornitore.fornitore.telefono}</div></h4>
<h4><div>Indirizzo: ${controllerFornitore.fornitore.indirizzo}</div></h4>
</f:view>

</body>
</html>