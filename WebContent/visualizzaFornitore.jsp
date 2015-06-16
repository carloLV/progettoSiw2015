<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"> -->
<title>Fornitore</title>
</head>
<body>
<f:view>
<h1>${controllerFornitore.fornitore.email}</h1>
<h2>Dettagli</h2>
<div>Partita iva: ${controllerFornitore.fornitore.partitaIva}</div>
<div>Telefono: ${controllerFornitore.fornitore.telefono}</div>
<div>Indirizzo: ${controllerFornitore.fornitore.indirizzo}</div>
</f:view>
</body>
</html>