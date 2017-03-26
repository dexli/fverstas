package kohdeluokat;


public class Liitos {
private int liitos_id;
private String tyyppi;

public Liitos() {
	super();
	
}
public Liitos(int liitos_id, String tyyppi) {
	super();
	this.liitos_id = liitos_id;
	this.tyyppi = tyyppi;
}
public int getLiitos_id() {
	return liitos_id;
}
public void setLiitos_id(int liitos_id) {
	this.liitos_id = liitos_id;
}
public String getTyyppi() {
	return tyyppi;
}
public void setTyyppi(String tyyppi) {
	this.tyyppi = tyyppi;
}

public String toString(){
	return liitos_id+" "+tyyppi;
}

}
