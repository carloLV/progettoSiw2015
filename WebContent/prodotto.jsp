<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"> -->
<title>Prodotto</title>
</head>
<body>
<f:view>
<h1>${controllerProdotto.prodotto.nome}</h1>
<h2>Dettagli</h2>
<div>Prezzo: ${controllerProdotto.prodotto.prezzo}</div>
<div>Descrizione: ${controllerProdotto.prodotto.descrizione}</div>
</f:view>
</body>
</html>