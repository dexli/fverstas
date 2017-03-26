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
	<br/>
	<table>
		<tr>
			<td width=25%>Tilaajan nimi:</td>
			<td><c:out value="${asiakas.etunimi}"/>&nbsp<c:out value="${asiakas.sukunimi}"/></td>
		</tr>
		
		<tr>
			<td>Tilaajan email:</td>
			<td><c:out value="${asiakas.sahkoposti}"/></td>
		</tr>
	
		<tr>
			<td>Tilaajan katuosoite:</td>
			<td><c:out value="${asiakas.katuosoite}"/>, <c:out value="${asiakas.postinro}"/>&nbsp<c:out value="${asiakas.postitmp}"/></td>
		</tr>	
		
		<tr>
			<td>Tilaajan puhelinnumero:</td>
			<td><c:out value="${asiakas.puhelinnumero}"/></td>
		</tr>
		
		<tr>
			<td></td>
			<td></td>
		</tr>
	</table>	
	
	<br/><br/><br/><br/>
	
	<table>
		<tr>
			<td width="15%">Komponentti</td>
			<td width="70%">Merkki</td>
			<td>Hinta</td>
		</tr>	
			
		<tr>
			<td><img src="viiva.jpg" height="1px" width="100%" /></td>
			<td><img src="viiva.jpg" height="1px" width="100%" /></td>
			<td><img src="viiva.jpg" height="1px" width="100%" /></td>
		</tr>
			
		<tr>
			<td>Runko:&nbsp</td>
			<td><c:out value="${pyoranRunko.merkki}, ${pyoranRunko.tyyppi}, ${pyoranRunko.vari}, ${pyoranRunko.koko}"/></td>
			<td><c:out value="${pyoranRunko.hinta}"/></td>
		</tr>
			
		<tr>
			<td>Haarukka:&nbsp</td>
			<td><c:out value="${pyoranHaarukka.merkki}, ${pyoranHaarukka.tyyppi}, ${pyoranHaarukka.vari}"/></td>
			<td><c:out value="${pyoranHaarukka.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Tanko:&nbsp</td>
			<td><c:out value="${pyoranTanko.merkki}, ${pyoranTanko.tyyppi}, ${pyoranTanko.vari}, ${pyoranTanko.koko}"/></td>
			<td><c:out value="${pyoranTanko.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Vanteet:&nbsp</td>
			<td><c:out value="${pyoranVanne.merkki}, ${pyoranVanne.tyyppi}, ${pyoranVanne.koko}"/></td>
			<td><c:out value="${pyoranVanne.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Renkaat:&nbsp</td>
			<td><c:out value="${pyoranRengas.merkki}, ${pyoranRengas.tyyppi}, ${pyoranRengas.koko}"/></td>
			<td><c:out value="${pyoranRengas.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Jarrut:&nbsp</td>
			<td><c:out value="${pyoranJarrut.merkki}, ${pyoranJarrut.tyyppi}"/></td>
			<td><c:out value="${pyoranJarrut.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Ketjut:&nbsp</td>
			<td><c:out value="${pyoranKetjut.merkki}, ${pyoranKetjut.tyyppi}, ${pyoranKetjut.lenkit_lkm}"/></td>
			<td><c:out value="${pyoranKetjut.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Polkimet:&nbsp</td>
			<td><c:out value="${pyoranPolkimet.merkki}, ${pyoranPolkimet.tyyppi}, ${pyoranPolkimet.vari}"/></td>
			<td><c:out value="${pyoranPolkimet.hinta}"/></td>
		</tr>
		
		<tr>
			<td>Satula:&nbsp</td>
			<td><c:out value="${pyoranSatula.merkki}, ${pyoranSatula.tyyppi}, ${pyoranSatula.vari}, ${pyoranSatula.koko}"/></td>
			<td><c:out value="${pyoranSatula.hinta}"/></td>
		</tr>	
		
		<tr>
			<td>Vaihteet:&nbsp</td>
			<td><c:out value="${pyoranVaihteet.merkki}, ${pyoranVaihteet.tyyppi}"/></td>
			<td><c:out value="${pyoranVaihteet.hinta}"/></td>
		</tr>
		
		<tr>
			<td><img src="viiva.jpg" height="1px" width="100%" /></td>
			<td><img src="viiva.jpg" height="1px" width="100%" /></td>
			<td><img src="viiva.jpg" height="1px" width="100%" /></td>
		</tr>
		
		<tr>
			<td><c:out value="Kokonaishinta"/></td>
			<td></td>
			<td><c:out value="${pyoranRunko.hinta+pyoranHaarukka.hinta+pyoranTanko.hinta+pyoranVanne.hinta+pyoranRengas.hinta+pyoranJarrut.hinta+pyoranKetjut.hinta+pyoranPolkimet.hinta+pyoranSatula.hinta+pyoranVaihteet.hinta}"/></td>
		</tr>
		
</table>
	<br/><br/><br/>
		<input type="submit" name="action" value="Peruuta"/>
		<input type="submit" name="action" value="Lähetä tarjouspyyntö"/>

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