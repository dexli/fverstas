package kohdeluokat;

public class Vanteet {

	private int vanteet_id;
	private String tyyppi;
	private int koko;
	private String merkki;
	private double hinta;
	
	public Vanteet(){
		vanteet_id = 0;
		tyyppi = null;
		koko = 0;
		merkki = null;
		hinta = 0;
	}
	
	public Vanteet(String merkki, double hinta){
		vanteet_id = 0;
		tyyppi = null;
		koko = 0;
		setMerkki(merkki);
		setHinta(hinta);
	}
	
	public Vanteet (int vanteet_id,String tyyppi,int koko, 
			String merkki,double hinta)
	{
		setVanteet_id(vanteet_id);
		setTyyppi(tyyppi);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		
	}
	
	
	public int getVanteet_id() {
		return vanteet_id;
	}

	public void setVanteet_id(int vanteet_id) {
		this.vanteet_id = vanteet_id;
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
