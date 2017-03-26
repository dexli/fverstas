package kohdeluokat;

public class PyoraSuunnitelma {

	private int pyorasuunnitelma_id;
	private double kokonaishinta;
	private Pvm lahetyspvm;
	private Asiakas asiakas;
	private Runko runko;
	private Tanko tanko;
	private Haarukka haarukka;
	private Vaihteet vaihteet;
	private Polkimet polkimet;
	private Vanteet vanteet;
	private Renkaat renkaat;
	private Satula satula;
	private Jarrut jarrut;
	private Ketjut ketjut;
	
	

	public PyoraSuunnitelma(){
		pyorasuunnitelma_id = 0;
		kokonaishinta = 0;
		lahetyspvm = null;
		asiakas = null;
		runko = null;
		tanko = null;
		haarukka = null;
		vaihteet = null;
		polkimet = null;
		vanteet = null;
		renkaat = null;
		satula = null;
		jarrut = null;
		ketjut = null;
		
	}



	public PyoraSuunnitelma(int pyorasuunnitelma_id, double kokonaishinta,
			Pvm lahetyspvm, Asiakas asiakas, Runko runko, Tanko tanko,
			Haarukka haarukka, Vaihteet vaihteet, Polkimet polkimet,
			Vanteet vanteet, Renkaat renkaat, Satula satula, Jarrut jarrut,
			Ketjut ketjut) {
		super();
		this.pyorasuunnitelma_id = pyorasuunnitelma_id;
		this.kokonaishinta = kokonaishinta;
		setLahetyspvm ( lahetyspvm );
		this.asiakas = asiakas;
		this.runko = runko;
		this.tanko = tanko;
		this.haarukka = haarukka;
		this.vaihteet = vaihteet;
		this.polkimet = polkimet;
		this.vanteet = vanteet;
		this.renkaat = renkaat;
		this.satula = satula;
		this.jarrut = jarrut;
		this.ketjut = ketjut;
	}



	public int getPyorasuunnitelma_id() {
		return pyorasuunnitelma_id;
	}



	public void setPyorasuunnitelma_id(int pyorasuunnitelma_id) {
		this.pyorasuunnitelma_id = pyorasuunnitelma_id;
	}



	public double getKokonaishinta() {
		return kokonaishinta;
	}



	public void setKokonaishinta(double kokonaishinta) {
		this.kokonaishinta = kokonaishinta;
	}



	public Pvm getLahetyspvm() {
		Pvm apu = null;
		if(lahetyspvm != null)
			apu = new Pvm(lahetyspvm);
		return apu;
	}



	public void setLahetyspvm(Pvm lahetyspvm) {
		this.lahetyspvm = null;
		if(lahetyspvm != null)
			this.lahetyspvm = new Pvm(lahetyspvm);
	}



	public Asiakas getAsiakas() {
		return asiakas;
	}



	public void setAsiakas(Asiakas asiakas) {
		this.asiakas = asiakas;
	}



	public Runko getRunko() {
		return runko;
	}



	public void setRunko(Runko runko) {
		this.runko = runko;
	}



	public Tanko getTanko() {
		return tanko;
	}



	public void setTanko(Tanko tanko) {
		this.tanko = tanko;
	}



	public Haarukka getHaarukka() {
		return haarukka;
	}



	public void setHaarukka(Haarukka haarukka) {
		this.haarukka = haarukka;
	}



	public Vaihteet getVaihteet() {
		return vaihteet;
	}



	public void setVaihteet(Vaihteet vaihteet) {
		this.vaihteet = vaihteet;
	}



	public Polkimet getPolkimet() {
		return polkimet;
	}



	public void setPolkimet(Polkimet polkimet) {
		this.polkimet = polkimet;
	}



	public Vanteet getVanteet() {
		return vanteet;
	}



	public void setVanteet(Vanteet vanteet) {
		this.vanteet = vanteet;
	}



	public Renkaat getRenkaat() {
		return renkaat;
	}



	public void setRenkaat(Renkaat renkaat) {
		this.renkaat = renkaat;
	}



	public Satula getSatula() {
		return satula;
	}



	public void setSatula(Satula satula) {
		this.satula = satula;
	}



	public Jarrut getJarrut() {
		return jarrut;
	}



	public void setJarrut(Jarrut jarrut) {
		this.jarrut = jarrut;
	}



	public Ketjut getKetjut() {
		return ketjut;
	}



	public void setKetjut(Ketjut ketjut) {
		this.ketjut = ketjut;
	}
	
	
	
}
