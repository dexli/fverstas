package kohdeluokat;

public class Runko {
	private int runko_id;
	private String vari;
	private String tyyppi;
	private String koko;
	private String merkki;
	private double hinta;
	private Liitos liitos;
	
	public Runko(){
		runko_id = 0;
		vari = null;
		tyyppi = null;
		koko = null;
		merkki = null;
		hinta = 0;
		liitos= null;
	}
	public Runko(String merkki, double hinta){
		runko_id = 0;
		vari = null;
		tyyppi = null;
		koko = null;
		setMerkki(merkki);
		setHinta(hinta);
		liitos= null;
	}
	public Runko (int runko_id,String vari,String tyyppi,String koko, 
			String merkki,double hinta)
	{
		setRunko_id(runko_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		liitos = null;
		
	}
	public Runko (int runko_id,String vari,String tyyppi,String koko, 
			String merkki,double hinta, Liitos lii)
	{
		setRunko_id(runko_id);
		setVari(vari);
		setTyyppi(tyyppi);
		setKoko(koko);
		setMerkki(merkki);
		setHinta(hinta);
		liitos = lii;
		
	}
	public int getRunko_id() {
		return runko_id;
	}

	public void setRunko_id(int runko_id) {
		this.runko_id = runko_id;
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

	public Liitos getLiitos() {
		return liitos;
	}

	public void setLiitos_id(Liitos liitos) {
		this.liitos= liitos;
	}

	public String toString(){
		return runko_id+" "+merkki;
	}
}
