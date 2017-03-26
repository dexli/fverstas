package kohdeluokat;

public class Tanko {

	private int tanko_id;
	private String vari;
	private String tyyppi;
	private int koko;
	private String merkki;
	private double hinta;
//	private int liitos_id;
	private Liitos liitos;
	
	public Tanko(){
		tanko_id = 0;
		vari = null;
		tyyppi = null;
		koko = 0;
		merkki = null;
		hinta = 0;
//		liitos_id = 0;
	}
	
	public Tanko(String merkki, double hinta){
		tanko_id = 0;
		vari = null;
		tyyppi = null;
		koko = 0;
		setMerkki(merkki);
		setHinta(hinta);
		liitos= null;
	}
	
	public Tanko (int runko_id,String vari,String tyyppi,int koko, 
			String merkki,double hinta)
	{
		setTanko_id(runko_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		liitos = null;
		
	}
	
	public Tanko (int tanko_id,String vari,String tyyppi, int koko,
			String merkki,double hinta, Liitos lii)
	{
		setTanko_id(tanko_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		liitos = lii;
		
	}

	public int getTanko_id() {
		return tanko_id;
	}

	public void setTanko_id(int tanko_id) {
		this.tanko_id = tanko_id;
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

	public int getKoko() {
		return koko;
	}

	public void setKoko(int koko) {
		this.koko = koko;
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

//	public int getLiitos_id() {
//		return liitos_id;
//	}
//
//	public void setLiitos_id(int liitos_id) {
//		this.liitos_id = liitos_id;
//	}
}
