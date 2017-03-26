package kohdeluokat;

public class Renkaat {

	private int renkaat_id;
	private String tyyppi;
	private int koko;
	private String merkki;
	private double hinta;
	
	public Renkaat(){
		renkaat_id = 0;
		tyyppi = null;
		koko = 0;
		merkki = null;
		hinta = 0;
	}
	
	public Renkaat(String merkki, double hinta){
		renkaat_id = 0;
		tyyppi = null;
		koko = 0;
		setMerkki(merkki);
		setHinta(hinta);
	}
	public Renkaat (int renkaat_id,String tyyppi,int koko, 
			String merkki,double hinta)
	{
		setRenkaat_id(renkaat_id);
		setTyyppi(tyyppi);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		
	}
	

	public int getRenkaat_id() {
		return renkaat_id;
	}

	public void setRenkaat_id(int renkaat_id) {
		this.renkaat_id = renkaat_id;
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
}
