package kohdeluokat;


public class Asiakas {

	private String sahkoposti;
	private String salasana;	
	private String etunimi;			
	private String sukunimi;		
	private String sukupuoli;		
	private String puhelinnumero;	
	private String katuosoite;		
	private String postitmp;	
	private String postinro;
	
	public Asiakas() {
		sahkoposti = null;
		salasana = null;	
		etunimi = null;			
		sukunimi = null;		
		sukupuoli = null;		
		puhelinnumero = null;	
		katuosoite = null;		
		postitmp = null;	
		postinro = null;
	}
//new Asiakas(sposti,etunimi,sukunimi,sex,puh, katuos,	postitmp,postinro)
	public Asiakas (String sposti,String etunimi,String sukunimi,String sex, 
			String puh,String katuos,String postitmp,String postinro)
	{
		setSahkoposti(sposti);
		setEtunimi(etunimi);
		setSukunimi(sukunimi);
		setSukupuoli(sex);
		setPuhelinnumero(puh);
		setKatuosoite(katuos);
		setPostitmp(postitmp);
		setPostinro(postinro);
		
	}
	public String getSahkoposti() {
		return sahkoposti;
	}

	public void setSahkoposti(String sahkoposti) {
		this.sahkoposti = sahkoposti;
	}

	public String getSalasana() {
		return salasana;
	}

	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getSukupuoli() {
		return sukupuoli;
	}

	public void setSukupuoli(String sukupuoli) {
		this.sukupuoli = sukupuoli;
	}

	public String getPuhelinnumero() {
		return puhelinnumero;
	}

	public void setPuhelinnumero(String puhelinnumero) {
		this.puhelinnumero = puhelinnumero;
	}

	public String getKatuosoite() {
		return katuosoite;
	}

	public void setKatuosoite(String katuosoite) {
		this.katuosoite = katuosoite;
	}

	public String getPostitmp() {
		return postitmp;
	}

	public void setPostitmp(String postitmp) {
		this.postitmp = postitmp;
	}

	public String getPostinro() {
		return postinro;
	}

	public void setPostinro(String postinro) {
		this.postinro = postinro;
	}
	public String toString ()
	{
		return sahkoposti + " " + etunimi + " "+ sukunimi + " " + sukupuoli+" " + puhelinnumero+
		" " + katuosoite + " " + postitmp + " " + postinro;
		
	}
	// sahkoposti voi olla muotoa:
	// aaa@haaa.fi tai sana1.sana2@haag.fi tai sana-sana.sna-nsa@jaja.fi
	// aaa.aaa@hhha-hasj.kkk
	public static boolean tarkastaSahkoposti(String posti)
	{
		boolean ok = false;
		if (posti != null && posti.trim().length() > 0 &&
				posti.trim().matches("\\w{1,}(-\\w{1,})?(.\\w{1,})?\\w{1,}(-\\w{1,})?"
							+"@\\w{1,}(-\\w{1,})?.[a-zA-Z]{2,3}"))
		{
			ok = true;
		}
		return ok;
	}
	public static boolean tarkastaSalasana(String sana)
	{
		boolean ok = false;
		if (sana != null && sana.trim().length() > 0 &&
				sana.trim().matches("\\w{4,20}"))
		{
			ok = true;
		}
		return ok;
	}
}