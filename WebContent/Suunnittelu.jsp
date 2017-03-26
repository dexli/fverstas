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
	<td class="yla" colspan="3">
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

		<c:if test="${tyypinValinta==true}">
			Valitse rungon tyyppi:&nbsp &nbsp
 
			<c:forEach items="${tyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=Hae&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		
		
		<c:if test="${tyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkinen ja mallinen runko:"/>
			</p>
			<br/><br/>
		</c:if>
		
		 <c:if test="${haarukka==true}">
			<c:out value="Valitse haluamasi haarukka:"/>&nbsp &nbsp
			<img src="viiva.jpg" height="1px" width="100%" />
		</c:if>
		 
		<c:if test="${tanko==true}">
			<c:out value="Valitse haluamasi tanko:"/>&nbsp &nbsp
			<img src="viiva.jpg" height="1px" width="100%" />
		</c:if>
		
		<c:if test="${vanneTyypinValinta==true}">
			Valitse vanteiden tyyppi:&nbsp &nbsp
 
			<c:forEach items="${vannetyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=haeVanneTyypit&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		
		
		<c:if test="${vanneTyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkinen ja mallinen vanne:"/>
			</p>
			<br/><br/>
		</c:if>
		
		
		<c:if test="${renkaat==true}">
			<c:out value="Valitse haluamasi renkaat:"/>&nbsp &nbsp
			<img src="viiva.jpg" height="1px" width="100%" />
		</c:if>
		
		 
		 
		 <c:if test="${jarruTyypinValinta==true}">
			Valitse jarrujen tyyppi:&nbsp &nbsp
 
			<c:forEach items="${jarrutyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=haeJarruTyypit&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		
		
		<c:if test="${jarruTyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkiset ja malliset jarrut:"/>
			</p>
			<br/><br/>
		</c:if>
		
		 
		 
		<c:if test="${ketjuTyypinValinta==true}">
			Valitse ketjujen tyyppi:&nbsp &nbsp
 
			<c:forEach items="${ketjutyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=haeKetjuTyypit&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		
		
		<c:if test="${ketjuTyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkiset ja malliset ketjut:"/>
			</p>
			<br/><br/>
		</c:if>
		
		 
		
		<c:if test="${poljinTyypinValinta==true}">
			Valitse poljinten tyyppi:&nbsp &nbsp
 
			<c:forEach items="${poljintyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=haePoljinTyypit&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		<c:if test="${poljinTyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkiset ja malliset polkimet:"/>
			</p>
			<br/><br/>
		</c:if>
		
		
		<c:if test="${satulaTyypinValinta==true}">
			Valitse satulan tyyppi:&nbsp &nbsp
 
			<c:forEach items="${satulatyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=haeSatulaTyypit&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		<c:if test="${satulaTyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkinen ja mallinen satula:"/>
			</p>
			<br/><br/>
		</c:if>
		
		
		<c:if test="${vaihteetTyypinValinta==true}">
			Valitse vaihteiden tyyppi:&nbsp &nbsp
 
			<c:forEach items="${vaihdetyyppilista}" var="tyyppi">	 
				<a href="FillariIhmeet?action=haeVaihdeTyypit&tyyppi=${tyyppi}"><c:out value="${tyyppi}">&nbsp</c:out></a>
			</c:forEach>

			<img src="viiva.jpg" height="1px" width="100%" />
			<br/>
		</c:if>
		
		
		<c:if test="${vaihdeTyypinValinta==true}" >
			<p>
			<c:out value="Valitse haluamasi merkkiset ja malliset vaihteet:"/>
			</p>
			<br/><br/>
		</c:if>
		
		
	<table class="osataulukko">
		
		<tr><td class="osataulukkovasen">
				<c:if test="${ohjeetTyyppi==true}" >
					<p>
					<c:out value="Merkki / Malli"/>
					</p>
				</c:if>
				  
			</td>
			<td class="osataulukkooikea">
				<c:if test="${ohjeetTyyppi==true}" >
					<p>
					<c:out value="Hinta"/>
					</p>
				</c:if>
			</td>
		</tr>
		
		<tr><td class="tyhja"></td><td></td></tr>
		
		<c:if test="${runkolista!=null}">
			<c:forEach items="${runkolista}" var="runko">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutRungot&merkki=${runko.merkki}">
					<c:out value="${runko.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==runko.merkki}">
					<br/>Koko ja väri<br/>
					<c:forEach items="${valitturunkolista}" var="valrunko">
				
					<!--<c:out value="koko väri"/> 
					-->
					<br/>
						<a href="FillariIhmeet?action=haeValittuRunko&runkoId=${valrunko.runko_id}">
						<c:out value="${valrunko.koko}"/>&nbsp
						<c:out value="${valrunko.vari}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${runko.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${haarukkalista!=null}">
			<c:forEach items="${haarukkalista}" var="haarukka">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutHaarukat&merkki=${haarukka.merkki}">
					<c:out value="${haarukka.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==haarukka.merkki}">
					<br/>Väri<br/>
					<c:forEach items="${valittuhaarukkalista}" var="valhaarukka">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuHaarukka&haarukkaId=${valhaarukka.haarukka_id}">
						<c:out value="${valhaarukka.vari}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${haarukka.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${tankolista!=null}">
			<c:forEach items="${tankolista}" var="tanko">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutTangot&merkki=${tanko.merkki}">
					<c:out value="${tanko.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==tanko.merkki}">
					<br/>Väri<br/>
					<c:forEach items="${valittutankolista}" var="valtanko">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuTanko&tankoId=${valtanko.tanko_id}">
						<c:out value="${valtanko.koko}"/>&nbsp
						<c:out value="${valtanko.vari}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${tanko.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${vannelista!=null}">
			<c:forEach items="${vannelista}" var="vanne">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutVanteet&merkki=${vanne.merkki}">
					<c:out value="${vanne.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==vanne.merkki}">
					<br/>Koko<br/>
					<c:forEach items="${valittuvannelista}" var="valvanne">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuVanne&vanteetId=${valvanne.vanteet_id}">
						<c:out value="${valvanne.koko}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${vanne.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${rengaslista!=null}">
			<c:forEach items="${rengaslista}" var="rengas">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutRenkaat&merkki=${rengas.merkki}">
					<c:out value="${rengas.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==rengas.merkki}">
					<br/>Koko<br/>
					<c:forEach items="${valitturengaslista}" var="valrengas">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuRengas&renkaatId=${valrengas.renkaat_id}">
						<c:out value="${valrengas.koko}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${rengas.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${jarrulista!=null}">
			<c:forEach items="${jarrulista}" var="jarru">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutJarrut&merkki=${jarru.merkki}">
					<c:out value="${jarru.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==jarru.merkki}">
					<c:forEach items="${valittujarrulista}" var="valjarru">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuJarru&jarrutId=${valjarru.jarrut_id}">
						<c:out value="Lisää suunnitelmaan"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${jarru.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${ketjulista!=null}">
			<c:forEach items="${ketjulista}" var="ketju">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutKetjut&merkki=${ketju.merkki}">
					<c:out value="${ketju.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==ketju.merkki}">
					<br/>Ketjun lenkkien lukumäärä<br/>
					<c:forEach items="${valittuketjulista}" var="valketju">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuKetju&ketjutId=${valketju.ketjut_id}">
						<c:out value="${valketju.lenkit_lkm}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${ketju.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${poljinlista!=null}">
			<c:forEach items="${poljinlista}" var="poljin">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutPolkimet&merkki=${poljin.merkki}">
					<c:out value="${poljin.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==poljin.merkki}">
					<br/>Väri<br/>
					<c:forEach items="${valittupoljinlista}" var="valpoljin">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuPoljin&polkimetId=${valpoljin.polkimet_id}">
						<c:out value="${valpoljin.tyyppi}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${poljin.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${satulalista!=null}">
			<c:forEach items="${satulalista}" var="satula">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutSatulat&merkki=${satula.merkki}">
					<c:out value="${satula.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==satula.merkki}">
					<br/>Koko ja väri<br/>
					<c:forEach items="${valittusatulalista}" var="valsatula">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuSatula&satulaId=${valsatula.satula_id}">
						<c:out value="${valsatula.koko}"/>&nbsp
						<c:out value="${valsatula.vari}"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${satula.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
		
		<c:if test="${vaihteetlista!=null}">
			<c:forEach items="${vaihteetlista}" var="vaihde">
			<tr>
				<td>
					<a href="FillariIhmeet?action=haeValitutVaihteet&merkki=${vaihde.merkki}">
					<c:out value="${vaihde.merkki}"/></a>
					<br/>
					<c:if test="${valittuMerkki==vaihde.merkki}">
					<c:forEach items="${valittuvaihdelista}" var="valvaihde">
				
					<br/>
						<a href="FillariIhmeet?action=haeValittuVaihde&vaihteetId=${valvaihde.vaihteet_id}">
						<c:out value="Lisää suunnitelmaan"/>&nbsp</a>
				
					</c:forEach>
					</c:if>					
				</td>
				
				<td valign="top">
					<c:out value="${vaihde.hinta}"/>&nbspeur
				</td>
			</tr>	
			
			<tr><td class="tyhja"></td><td></td></tr>
			
			</c:forEach>
		</c:if>
	</table>
	<br/><br/>
	<div class="keskitys">
	<input type="submit" name="action" value="Tyhjennä pyöräsuunnitelma"/>
	</div>
</td>


<td class="oikea" valign="top">
	<p>Pyöräsuunnitelma:</p>
	
	<c:if test="${pyoranRunko!=null}">
		Runko:
		<br/>
		<br/>
		<c:out value="${pyoranRunko.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranRunko.merkki}"/>&nbsp
		<c:out value="${pyoranRunko.koko}"/>&nbsp
		<c:out value="${pyoranRunko.vari}"/>&nbsp
		<c:out value="${pyoranRunko.tyyppi}"/>
		<br/>
		
	</c:if>			
	
	<c:if test="${pyoranHaarukka!=null}">
		<br/>
		Haarukka:
		<br/>
		<br/>
		<c:out value="${pyoranHaarukka.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranHaarukka.merkki}"/>&nbsp
		<c:out value="${pyoranHaarukka.vari}"/>&nbsp
		<c:out value="${pyoranHaarukka.tyyppi}"/>
		<br/>
		<br/>
	</c:if>					
	
	<c:if test="${pyoranTanko!=null}">
		<br/>
		Tanko:
		<br/>
		<br/>
		<c:out value="${pyoranTanko.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranTanko.merkki}"/>&nbsp
		<c:out value="${pyoranTanko.koko}"/>&nbsp
		<c:out value="${pyoranTanko.vari}"/>&nbsp
		<c:out value="${pyoranTanko.tyyppi}"/>
		<br/>
		<br/>
	</c:if>	
	
	<c:if test="${pyoranVanne!=null}">
		<br/>
		Vanteet:
		<br/>
		<br/>
		<c:out value="${pyoranVanne.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranVanne.merkki}"/>&nbsp
		<c:out value="${pyoranVanne.koko}"/>&nbsp
		<c:out value="${pyoranVanne.tyyppi}"/>
		<br/>
		<br/>
	</c:if>	
	
	<c:if test="${pyoranRengas!=null}">
		<br/>
		Renkaat:
		<br/>
		<br/>
		<c:out value="${pyoranRengas.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranRengas.merkki}"/>&nbsp
		<c:out value="${pyoranRengas.koko}"/>&nbsp
		<c:out value="${pyoranRengas.tyyppi}"/>
		<br/>
		<br/>
	</c:if>	
	
	
	<c:if test="${pyoranJarrut!=null}">
		<br/>
		Jarrut:
		<br/>
		<br/>
		<c:out value="${pyoranJarrut.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranJarrut.merkki}"/>&nbsp
		<c:out value="${pyoranJarrut.tyyppi}"/>
		<br/>
		<br/>
	</c:if>	
	
	<c:if test="${pyoranKetjut!=null}">
		<br/>
		Ketjut:
		<br/>
		<br/>
		<c:out value="${pyoranKetjut.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranKetjut.merkki}"/>&nbsp
		<c:out value="${pyoranKetjut.tyyppi}"/>&nbsp
		<c:out value="${pyoranKetjut.lenkit_lkm}"/>
		<br/>
		<br/>
	</c:if>	
	
	<c:if test="${pyoranPolkimet!=null}">
		<br/>
		Polkimet:
		<br/>
		<br/>
		<c:out value="${pyoranPolkimet.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranPolkimet.merkki}"/>&nbsp
		<c:out value="${pyoranPolkimet.tyyppi}"/>&nbsp
		<c:out value="${pyoranPolkimet.vari}"/>
		<br/>
		<br/>
	</c:if>	
	
	<c:if test="${pyoranSatula!=null}">
		<br/>
		Satula:
		<br/>
		<br/>
		<c:out value="${pyoranSatula.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranSatula.merkki}"/>&nbsp
		<c:out value="${pyoranSatula.vari}"/>&nbsp
		<c:out value="${pyoranSatula.tyyppi}"/>
		<br/>
		<br/>
	</c:if>	
	
	<c:if test="${pyoranVaihteet!=null}">
		<br/>
		Vaihteet:
		<br/>
		<br/>
		<c:out value="${pyoranVaihteet.hinta}"/>&nbsp
		<br/>
		<c:out value="${pyoranVaihteet.merkki}"/>&nbsp
		<c:out value="${pyoranVaihteet.tyyppi}"/>
		<br/>
		<br/>
	</c:if>	
	
	
	
</td>
</tr>

<tr>
	
	<td class="ala" colspan="3">
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