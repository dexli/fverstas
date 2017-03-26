package kohdeluokat;

public class Ketjut {

	private int ketjut_id;
	private String tyyppi;
	private int lenkit_lkm;
	private String merkki;
	private double hinta;
	
	public Ketjut(){
		ketjut_id = 0;
		tyyppi = null;
		lenkit_lkm = 0;
		merkki = null;
		hinta = 0;
	}

	public Ketjut(String merkki, double hinta){
		ketjut_id = 0;
		tyyppi = null;
		setMerkki(merkki);
		setHinta(hinta);
	}
	public Ketjut (int ketjut_id,String tyyppi, int lenkit_lkm,
			String merkki,double hinta)
	{
		setKetjut_id(ketjut_id);
		setTyyppi(tyyppi);
		setLenkit_lkm(lenkit_lkm);
		setMerkki(merkki);
		setHinta(hinta);
		
	}
	public int getKetjut_id() {
		return ketjut_id;
	}

	public void setKetjut_id(int ketjut_id) {
		this.ketjut_id = ketjut_id;
	}

	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public int getLenkit_lkm() {
		return lenkit_lkm;
	}

	public void setLenkit_lkm(int lenkit_lkm) {
		this.lenkit_lkm = lenkit_lkm;
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
