package kohdeluokat;

public class Jarrut {

	private int jarrut_id;
	private String tyyppi;
	private String merkki;
	private double hinta;
	
	public Jarrut(){
		jarrut_id = 0;
		tyyppi = null;
		merkki = null;
		hinta = 0;
	}
	
	public Jarrut(String merkki, double hinta){
		jarrut_id = 0;
		tyyppi = null;
		setMerkki(merkki);
		setHinta(hinta);
	}
	public Jarrut (int jarrut_id,String tyyppi,
			String merkki,double hinta)
	{
		setJarrut_id(jarrut_id);
		setTyyppi(tyyppi);
		setMerkki(merkki);
		setHinta(hinta);
		
	}

	public int getJarrut_id() {
		return jarrut_id;
	}

	public void setJarrut_id(int jarrut_id) {
		this.jarrut_id = jarrut_id;
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
