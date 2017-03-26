package kohdeluokat;

public class Satula {

	private int satula_id;
	private String vari;
	private String tyyppi;
	private String koko;
	private String merkki;
	private double hinta;
	
	public Satula(){
		satula_id = 0;
		vari = null;
		tyyppi = null;
		koko = null;
		merkki = null;
		hinta = 0;
	}
	
	public Satula(String merkki, double hinta){
		satula_id = 0;
		tyyppi = null;
		setMerkki(merkki);
		setHinta(hinta);
	}
	public Satula (int satula_id, String vari, String tyyppi, String koko,
			String merkki,double hinta)
	{
		setSatula_id(satula_id);
		setTyyppi(tyyppi);
		setVari(vari);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		
	}

	public int getSatula_id() {
		return satula_id;
	}

	public void setSatula_id(int satula_id) {
		this.satula_id = satula_id;
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

	public String getKoko() {
		return koko;
	}

	public void setKoko(String koko) {
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
}
