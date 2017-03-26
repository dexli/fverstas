<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isThreadSafe="true"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Kirjautuminen</title>
<link rel="stylesheet" type="text/css" href="tyyli.css"/>
</head>

<body class="keskitys">

<form action="FillariIhmeet" method="get">

<table class="taulukko">
<tr class="ylak"><td class="ylak"></td></tr>

<tr><td class="tausta">
<h1>Fillariverstas Oy</h1>

<br/>

Sähköposti: <input type="text" name="sahkoposti" value=""/> <br/>
&nbsp&nbsp Salasana: <input type="password" name="salasana" value=""/> <br/><br/>
&nbsp
<input type="submit" name="action" value="Kirjaudu"/>
<br/><br/>

<c:if test="${eiTulosta==true}" >
<p style="color:red">
<c:out value="Väärä käyttäjätunnus tai salasana!"/>
</p>
</c:if>
</td></tr>

<tr><td class="alak"></td></tr>
</table>

</form>



</body>
</html>