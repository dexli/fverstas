package kohdeluokat;

public class Polkimet {

	private int polkimet_id;
	private String vari;
	private String tyyppi;
	private String merkki;
	private double hinta;
	
	public Polkimet(){
		polkimet_id = 0;
		vari = null;
		tyyppi = null;
		merkki = null;
		hinta = 0;
	}
	
	public Polkimet(String merkki, double hinta){
		polkimet_id = 0;
		tyyppi = null;
		setMerkki(merkki);
		setHinta(hinta);
	}
	public Polkimet (int polkimet_id, String vari,String tyyppi,
			String merkki,double hinta)
	{
		setPolkimet_id(polkimet_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setMerkki(merkki);
		setHinta(hinta);
		
	}

	public int getPolkimet_id() {
		return polkimet_id;
	}

	public void setPolkimet_id(int polkimet_id) {
		this.polkimet_id = polkimet_id;
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
}
