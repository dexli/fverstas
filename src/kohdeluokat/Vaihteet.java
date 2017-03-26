package kohdeluokat;

public class Vaihteet {

	private int vaihteet_id;
	private String tyyppi;
	private String merkki;
	private double hinta;
	
	public Vaihteet(){
		vaihteet_id = 0;
		tyyppi = null;
		merkki = null;
		hinta = 0;
	}
	public Vaihteet(String merkki, double hinta){
		vaihteet_id = 0;
		tyyppi = null;
		setMerkki(merkki);
		setHinta(hinta);
	}
	public Vaihteet (int vaihteet_id, String tyyppi,
			String merkki,double hinta)
	{
		setVaihteet_id(vaihteet_id);
		setTyyppi(tyyppi);
		setMerkki(merkki);
		setHinta(hinta);
		
	}
	
	public int getVaihteet_id() {
		return vaihteet_id;
	}

	public void setVaihteet_id(int vaihteet_id) {
		this.vaihteet_id = vaihteet_id;
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
