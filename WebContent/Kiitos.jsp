<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isThreadSafe="true"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Suunnittelu</title>
<link rel="stylesheet" type="text/css" href="tyyli.css"/>
</head>

<body class="keskitys">
<form action="FillariIhmeet" method="get">

<table class="taulukko">
	
	<tr>
	<td class="yla" colspan="2">
		<div id='kuva'>
		<h1>Fillariverstas</h1>
		<p align="right" valign="top">Kirjautunut: <c:out value="${asiakas.etunimi}"/>&nbsp<c:out value="${asiakas.sukunimi}"/><br/>
		<input type="submit" name="action" value="Kirjaudu ulos"/></p>
		</div>
	</td>
	</tr>
	
	<tr>
	
	<td class="vasen" valign="top">
		<div style="height:100%; width:160px; background:url('vasentausta.jpg') no-repeat;"> 
		</div>
	</td>
	
	
	
<td class="keski" valign="top">

	<div id='keskitysk'>
	<br/>
	<br/>
	<br/>
	<br/>
	<p>Kiitos että suunnittelitte pyöränne Fillariverstaalla!</p>
	<br/>
	<br/>
	<p>Tarjouspyyntö on lähetetty käsiteltäväksi. Vastaamme tarjouspyyntöön mahdollisimman pian.</p>
	<br/>
	<br/>
	<input type="submit" name="action" value="Suunnittele uusi pyörä"/>
	</div>
	
</td>

</tr>

<tr>
	
	<td class="ala" colspan="2">
		<div id='kuva'>	
			<br/>
			<p>(c) Ihmeidentekijät</p>
			
		</div>
	</td>
		
</tr>

</table>
</form>
</body>
</html>