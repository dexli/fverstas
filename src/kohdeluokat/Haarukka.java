package kohdeluokat;

public class Haarukka {

	private int haarukka_id;
	private String vari;
	private String tyyppi;
	private String merkki;
	private double hinta;
//	private int liitos_id;
	private Liitos liitos;
	
	public Haarukka (){
		haarukka_id = 0;
		vari = null;
		tyyppi = null;
		merkki = null;
		hinta = 0;
//		liitos_id = 0;
	}
	
	public Haarukka(String merkki, double hinta){
		haarukka_id = 0;
		vari = null;
		tyyppi = null;
		setMerkki(merkki);
		setHinta(hinta);
//		liitos_id= 0;
	}
	
	public Haarukka (int haarukka_id,String vari,String tyyppi,
			String merkki,double hinta)
	{
		setHaarukka_id(haarukka_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setMerkki(merkki);
		setHinta(hinta);
		
	}
	
	public Haarukka (int haarukka_id,String vari,String tyyppi, 
			String merkki,double hinta, Liitos lii)
	{
		setHaarukka_id(haarukka_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setMerkki(merkki);
		setHinta(hinta);
		liitos = lii;
		
	}
	
	public int getHaarukka_id() {
		return haarukka_id;
	}

	public void setHaarukka_id(int haarukka_id) {
		this.haarukka_id = haarukka_id;
	}

	public String getVari() {
		return vari;
	}

	public void setVari(String vari) {
		this.vari = vari;
	}

	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}


	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public Liitos getLiitos() {
		return liitos;
	}

	public void setLiitos_id(Liitos liitos) {
		this.liitos = liitos;
	}
}
