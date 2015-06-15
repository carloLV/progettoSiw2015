<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Fornitori</title>
</head>
<body>
<f:view>
    <h:form>
    <h1>Lista fornitori</h1>
    <table>
        <tr>
            <th>email</th>
            <th>partita Iva</th>
        </tr>
        <c:forEach var="fornitore" items="#{controllerFornitore.fornitori}">
            <tr>
                <td><h:commandLink action="#{controllerFornitore.findFornitore}" value="#{fornitore.email}">
            <f:param name="id" value="#{fornitore.id}" />
        </h:commandLink></td>
                <td>${fornitore.partitaIva}</td>
            </tr>
        </c:forEach>
    </table>
    </h:form>
    </f:view>
</body>
</html>