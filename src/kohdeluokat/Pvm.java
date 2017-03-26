package kohdeluokat;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pvm extends GregorianCalendar {

	// muodostimet
	// oletusmuodostin
	public Pvm() {
		super(); // nykypäivä
	}

	// parametrill. muodostin
	public Pvm(int pp, int kk, int vv) {
		super(vv, kk - 1, pp);
	}

	// kopiointimuodostin
	public Pvm(Pvm olio) {
		super();
		if (olio != null)
			super.set(olio.getVuosi(), 
					(olio.getKuukausi() - 1), 
					olio.getPaiva());

	}
	// partametri pvm on muodossa 2010-04-16 00:00:00.0
	public Pvm (String pvm)
	{
		this();
		int i, pp,kk,vv;
		if (pvm != null && pvm.matches(
				"\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.\\d{1}") )
		{
			i = pvm.indexOf('-');
			vv = Integer.parseInt(pvm.substring(0,i));
			pvm = pvm.substring(i+1);
			i = pvm.indexOf('-');
			kk= Integer.parseInt(pvm.substring(0,i));
			pvm=pvm.substring(i+1);
			i = pvm.indexOf(' ');
			pp = Integer.parseInt(pvm.substring(0,i));
			super.set(vv, kk-1, pp);
		}
	}

	public int getPaiva() {
		return super.get(Calendar.DATE);
	}

	public int getKuukausi() {
		return super.get(Calendar.MONTH) + 1;
	}

	public int getVuosi() {
		return super.get(Calendar.YEAR);
	}

	public void setPaiva(int pp) {
		int[] kuut = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (pp > 0 && pp <= kuut[getKuukausi()])
			super.set(Calendar.DATE, pp);
	}

	public void setKuukausi(int kk) {
		if (kk > 0 && kk <= 12)
			super.set(Calendar.MONTH, kk - 1);
	}

	public void setVuosi(int vv) {
		if (vv > 0)
			super.set(Calendar.YEAR, vv);
	}

	public void setPvm(int pp, int kk, int vv) {
		super.set(vv, kk - 1, pp);
	}

	public void lisaaPaiva(int arvo) {
		super.add(Calendar.DATE, arvo);
	}

	public void lisaaKuukausi(int arvo) {
		super.add(Calendar.MONTH, arvo);
	}

	public void lisaaVuosi(int arvo) {
		super.add(Calendar.YEAR, arvo);
	}

	public String toString() {
		return super.get(Calendar.DATE) + "." + (super.get(Calendar.MONTH) + 1)
				+ "." + super.get(Calendar.YEAR);

	}

} // end of class Pvm


