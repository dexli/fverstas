package kohdeluokat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;

import tietokanta.TietokantaOhjaus;

public class RunkoOhjaus {

	
	public ArrayList<String> haeTyypit() throws SQLException
	{
		TietokantaOhjaus tko ;
		HashMap<String,String>map;
		ArrayList<HashMap <String,String>> lista;
		ArrayList<String>tyypit =null;
		String tyyppi;
		try
		{
			tko = new TietokantaOhjaus();
			lista = tko.haeTyypit();
				
			if (lista != null)
			{
				tyypit = new ArrayList<String>();
				Iterator<HashMap<String,String>> it = lista.iterator();
				while (it.hasNext())
				{
					map = it.next();
					tyyppi = map.get("TYYPPI");
					tyypit.add(tyyppi);
				}
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
	
		return tyypit;
		
	}
	
	public ArrayList<Runko> haeRungot(String tyyppi) throws SQLException
	{
		
		TietokantaOhjaus tko;
		HashMap<String, String>map;
		ArrayList<HashMap <String, String>> runkolista;
		ArrayList<Runko> rungot=null;
		
		
		Runko runko;
		
		
		try
		{
			tko = new TietokantaOhjaus();
			runkolista = tko.haeRungot(tyyppi);
				
			if (runkolista != null)
			{
				rungot = new ArrayList<Runko>();
				Iterator<HashMap<String, String>> it = runkolista.iterator();
				while (it.hasNext())
				{
					map = it.next();
					//int id =Integer.parseInt( map.get("runko_id"));	
					//String vari = map.get("vari");	
					//tyyppi = map.get("tyyppi");
//					String koko = map.get("koko");
					String merkki = map.get("MERKKI");
					double hinta = Double.parseDouble(map.get("HINTA"));
//					String apu = map.get("HINTA");
//					System.out.println("rungon hinta: " + apu);
					runko = new Runko(merkki,hinta);
					rungot.add(runko);
				}
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
		
		
		
		return rungot;
	}
	
	public ArrayList<Runko> haeValitutRungot(String merkki) throws SQLException
	{
		
		TietokantaOhjaus tko;
		HashMap<String, String>map;
		ArrayList<HashMap <String, String>> runkolista;
		ArrayList<Runko> rungot=null;
		
		
		Runko runko;
		
		
		try
		{
			tko = new TietokantaOhjaus();
			runkolista = tko.haeValitutRungot(merkki);
				
			if (runkolista != null)
			{
				rungot = new ArrayList<Runko>();
				Iterator<HashMap<String, String>> it = runkolista.iterator();
				while (it.hasNext())
				{
					map = it.next();
					int id =Integer.parseInt( map.get("RUNKO_ID"));	
					String vari = map.get("VARI");	
					String tyyppi = map.get("TYYPPI");
					String koko = map.get("KOKO");
					merkki = map.get("MERKKI");
					double hinta = Double.parseDouble(map.get("HINTA"));
					runko = new Runko(id, vari, tyyppi, koko, merkki,hinta);
					rungot.add(runko);
				}
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
		
		
		
		return rungot;
	}
	
	public Runko haeValittuRunko(int runkoId) throws SQLException
	{
		
		TietokantaOhjaus tko;
		HashMap<String, String>map;
		ArrayList<HashMap <String, String>> osaRunko;
		ArrayList<Runko> rungot=null;
		
		
		Runko runko=null;
		
		
		try
		{
			tko = new TietokantaOhjaus();
			osaRunko = tko.haeValittuRunko(runkoId);
				
			if (osaRunko != null)
			{
				
				Iterator<HashMap<String, String>> it = osaRunko.iterator();
				if (it.hasNext())
				{
					map = it.next();
					int id = Integer.parseInt( map.get("RUNKO_ID"));	
					String vari = map.get("VARI");	
					String tyyppi = map.get("TYYPPI");
					String koko = map.get("KOKO");
					String merkki = map.get("MERKKI");
					double hinta = Double.parseDouble(map.get("HINTA"));
					int liitos_id = Integer.parseInt(map.get("LIITOS_ID"));
					String liitostyyppi= map.get("LIITOS_TYYPPI");
					Liitos liitos = new Liitos (liitos_id,liitostyyppi);
					runko = new Runko(id, vari, tyyppi, koko, merkki, hinta, liitos);
					
				}
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
		
		
		
		return runko;
	}

	public ArrayList<Haarukka> haeHaarukat(Liitos liitos) throws SQLException
	{
		
		TietokantaOhjaus tko;
		HashMap<String, String>map;
		ArrayList<HashMap <String, String>> haarukkalista;
		ArrayList<Haarukka> haarukat=null;
		
		
		Haarukka haarukka;
		
		
		try
		{
			tko = new TietokantaOhjaus();
			haarukkalista = tko.haeHaarukat(liitos);
				
			if (haarukkalista != null)
			{
				haarukat = new ArrayList<Haarukka>();
				Iterator<HashMap<String, String>> it = haarukkalista.iterator();
				while (it.hasNext())
				{
					map = it.next();
					//int id =Integer.parseInt( map.get("runko_id"));	
					//String vari = map.get("vari");	
					//tyyppi = map.get("tyyppi");
//					String koko = map.get("koko");
					String merkki = map.get("MERKKI");
					double hinta = Double.parseDouble(map.get("HINTA"));
//					String apu = map.get("HINTA");
//					System.out.println("rungon hinta: " + apu);
					haarukka = new Haarukka(merkki,hinta);
					haarukat.add(haarukka);
				}
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
		
		
		
		return haarukat;
	}

public ArrayList<String> haeHaarukkaTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeHaarukkaTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
}

public ArrayList<Haarukka> haeValitutHaarukat(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> haarukkalista;
	ArrayList<Haarukka> haarukat=null;
	
	
	Haarukka haarukka;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		haarukkalista = tko.haeValitutHaarukat(merkki);
			
		if (haarukkalista != null)
		{
			haarukat = new ArrayList<Haarukka>();
			Iterator<HashMap<String, String>> it = haarukkalista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("HAARUKKA_ID"));	
				String vari = map.get("VARI");	
				String tyyppi = map.get("TYYPPI");
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				haarukka = new Haarukka(id, vari, tyyppi, merkki,hinta);
				haarukat.add(haarukka);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return haarukat;
}

public Haarukka haeValittuHaarukka(int haarukkaId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaHaarukka;
	ArrayList<Haarukka> haarukat=null;
	
	
	Haarukka haarukka=null;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		osaHaarukka = tko.haeValittuHaarukka(haarukkaId);
			
		if (osaHaarukka != null)
		{
			
			Iterator<HashMap<String, String>> it = osaHaarukka.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id = Integer.parseInt( map.get("HAARUKKA_ID"));	
				String vari = map.get("VARI");	
				String tyyppi = map.get("TYYPPI");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				int liitos_id = Integer.parseInt(map.get("LIITOS_ID"));
				String liitostyyppi= map.get("LIITOS_TYYPPI");
				Liitos liitos = new Liitos (liitos_id,liitostyyppi);
				haarukka = new Haarukka(id, vari, tyyppi, merkki, hinta, liitos);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return haarukka;
}

public ArrayList<String> haeTankoTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeTankoTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
}

public ArrayList<Tanko> haeTangot(Liitos liitos) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> tankolista;
	ArrayList<Tanko> tangot=null;
	
	
	Tanko tanko;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		tankolista = tko.haeTangot(liitos);
			
		if (tankolista != null)
		{
			tangot = new ArrayList<Tanko>();
			Iterator<HashMap<String, String>> it = tankolista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				tanko = new Tanko(merkki,hinta);
				tangot.add(tanko);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return tangot;
}

public ArrayList<Tanko> haeValitutTangot(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> tankolista;
	ArrayList<Tanko> tangot=null;
	
	
	Tanko tanko;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		tankolista = tko.haeValitutTangot(merkki);
			
		if (tankolista != null)
		{
			tangot = new ArrayList<Tanko>();
			Iterator<HashMap<String, String>> it = tankolista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("TANKO_ID"));	
				String vari = map.get("VARI");	
				String tyyppi = map.get("TYYPPI");
				int koko = Integer.parseInt(map.get("KOKO"));
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				tanko = new Tanko(id, vari, tyyppi,koko, merkki,hinta);
				tangot.add(tanko);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return tangot;
}

public Tanko haeValittuTanko(int tankoId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaTanko;
	ArrayList<Tanko> tangot=null;
	
	
	Tanko tanko=null;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		osaTanko = tko.haeValittuTanko(tankoId);
			
		if (osaTanko != null)
		{
			
			Iterator<HashMap<String, String>> it = osaTanko.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id = Integer.parseInt( map.get("TANKO_ID"));	
				String vari = map.get("VARI");	
				String tyyppi = map.get("TYYPPI");
				int koko = Integer.parseInt(map.get("KOKO"));
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				int liitos_id = Integer.parseInt(map.get("LIITOS_ID"));
				String liitostyyppi= map.get("LIITOS_TYYPPI");
				Liitos liitos = new Liitos (liitos_id,liitostyyppi);
				tanko = new Tanko(id, vari, tyyppi, koko, merkki, hinta, liitos);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return tanko;
}

public ArrayList<String> haeRengasTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeRengasTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Renkaat> haeRenkaat(int vannekoko) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> rengaslista;
	ArrayList<Renkaat> renkaat=null;
	
	
	Renkaat rengas;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		rengaslista = tko.haeRenkaat(vannekoko);
			
		if (rengaslista != null)
		{
			renkaat = new ArrayList<Renkaat>();
			Iterator<HashMap<String, String>> it = rengaslista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				rengas = new Renkaat(merkki,hinta);
				renkaat.add(rengas);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return renkaat;
}

public ArrayList<Renkaat> haeValitutRenkaat(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> rengaslista;
	ArrayList<Renkaat> renkaat=null;
	
	
	Renkaat rengas;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		rengaslista = tko.haeValitutRenkaat(merkki);
			
		if (rengaslista != null)
		{
			renkaat = new ArrayList<Renkaat>();
			Iterator<HashMap<String, String>> it = rengaslista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("RENKAAT_ID"));	
				String tyyppi = map.get("TYYPPI");
				int koko = Integer.parseInt(map.get("KOKO"));
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				rengas = new Renkaat(id, tyyppi, koko, merkki, hinta);
				renkaat.add(rengas);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return renkaat;
}
public Renkaat haeValittuRengas(int rengasId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaRengas;
	Renkaat rengas=null;
	
	
	Vanteet vanne=null;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		osaRengas = tko.haeValittuRengas(rengasId);
			
		if (osaRengas!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaRengas.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id = Integer.parseInt( map.get("RENKAAT_ID"));		
				String tyyppi = map.get("TYYPPI");
				int koko = Integer.parseInt(map.get("KOKO"));
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				rengas = new Renkaat(id, tyyppi, koko, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return rengas;
}
public ArrayList<String> haeJarruTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeJarruTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Jarrut> haeJarrut(String tyyppi) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> jarrulista;
	ArrayList<Jarrut> jarrut=null;
	
	
	Jarrut jarru;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		jarrulista = tko.haeJarrut(tyyppi);
			
		if (jarrulista != null)
		{
			jarrut = new ArrayList<Jarrut>();
			Iterator<HashMap<String, String>> it = jarrulista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				jarru = new Jarrut(merkki,hinta);
				jarrut.add(jarru);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return jarrut;
}

public ArrayList<Jarrut> haeValitutJarrut(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> jarrulista;
	ArrayList<Jarrut> jarrut=null;
	
	
	Jarrut jarru;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		jarrulista = tko.haeValitutJarrut(merkki);
			
		if (jarrulista != null)
		{
			jarrut = new ArrayList<Jarrut>();
			Iterator<HashMap<String, String>> it = jarrulista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("JARRUT_ID"));	
				String tyyppi = map.get("TYYPPI");
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				jarru = new Jarrut(id, tyyppi, merkki, hinta);
				jarrut.add(jarru);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return jarrut;
}
public Jarrut haeValittuJarrut(int jarrutId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaJarru;
	Jarrut jarrut=null;
	
	
	
	try
	{
		tko = new TietokantaOhjaus();
		osaJarru = tko.haeValittuJarru(jarrutId);
			
		if (osaJarru!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaJarru.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id = Integer.parseInt( map.get("JARRUT_ID"));		
				String tyyppi = map.get("TYYPPI");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				jarrut = new Jarrut(id, tyyppi, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return jarrut;
}

public ArrayList<String> haeKetjuTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeKetjuTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Ketjut> haeKetjut(String tyyppi) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> ketjulista;
	ArrayList<Ketjut> ketjut=null;
	
	
	Ketjut ketju;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		ketjulista = tko.haeKetjut(tyyppi);
			
		if (ketjulista != null)
		{
			ketjut = new ArrayList<Ketjut>();
			Iterator<HashMap<String, String>> it = ketjulista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				ketju = new Ketjut(merkki,hinta);
				ketjut.add(ketju);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return ketjut;
}

public ArrayList<Ketjut> haeValitutKetjut(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> ketjulista;
	ArrayList<Ketjut> ketjut=null;
	
	
	Ketjut ketju;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		ketjulista = tko.haeValitutKetjut(merkki);
			
		if (ketjulista != null)
		{
			ketjut = new ArrayList<Ketjut>();
			Iterator<HashMap<String, String>> it = ketjulista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("KETJUT_ID"));	
				String tyyppi = map.get("TYYPPI");
				int lenkit_lkm = Integer.parseInt( map.get("LENKIT_LKM"));
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				ketju = new Ketjut(id, tyyppi, lenkit_lkm, merkki, hinta);
				ketjut.add(ketju);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return ketjut;
}
public Ketjut haeValittuKetju(int ketjuId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaKetju;
	Ketjut ketjut=null;
		
	try
	{
		tko = new TietokantaOhjaus();
		osaKetju = tko.haeValittuKetju(ketjuId);
			
		if (osaKetju!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaKetju.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id = Integer.parseInt( map.get("KETJUT_ID"));		
				String tyyppi = map.get("TYYPPI");
				int lenkitlkm = Integer.parseInt(map.get("LENKIT_LKM"));
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				ketjut = new Ketjut(id, tyyppi, lenkitlkm, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return ketjut;
}

public ArrayList<String> haePolkimetTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haePolkimetTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Polkimet> haePolkimet(String tyyppi) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> poljinlista;
	ArrayList<Polkimet> polkimet=null;
	
	
	Polkimet poljin;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		poljinlista = tko.haePolkimet(tyyppi);
			
		if (poljinlista != null)
		{
			polkimet = new ArrayList<Polkimet>();
			Iterator<HashMap<String, String>> it = poljinlista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				poljin = new Polkimet(merkki,hinta);
				polkimet.add(poljin);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return polkimet;
}

public ArrayList<Polkimet> haeValitutPolkimet(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> poljinlista;
	ArrayList<Polkimet> polkimet=null;
	
	
	Polkimet poljin;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		poljinlista = tko.haeValitutPolkimet(merkki);
			
		if (poljinlista != null)
		{
			polkimet = new ArrayList<Polkimet>();
			Iterator<HashMap<String, String>> it = poljinlista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("POLKIMET_ID"));	
				String tyyppi = map.get("TYYPPI");
				String vari = map.get("VARI");
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				poljin = new Polkimet(id, tyyppi, vari, merkki, hinta);
				polkimet.add(poljin);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return polkimet;
}
public Polkimet haeValittuPoljin(int poljinId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaPoljin;
	Polkimet polkimet=null;
		
	try
	{
		tko = new TietokantaOhjaus();
		osaPoljin = tko.haeValittuPoljin(poljinId);
			
		if (osaPoljin!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaPoljin.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("POLKIMET_ID"));	
				String tyyppi = map.get("TYYPPI");
				String vari = map.get("VARI");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				polkimet = new Polkimet(id, tyyppi, vari, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return polkimet;
}

public ArrayList<String> haeVanneTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeVanneTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Vanteet> haeVanteet(String tyyppi) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> vannelista;
	ArrayList<Vanteet> vanteet=null;
	
	
	Vanteet vanne;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		vannelista = tko.haeVanteet(tyyppi);
			
		if (vannelista != null)
		{
			vanteet = new ArrayList<Vanteet>();
			Iterator<HashMap<String, String>> it = vannelista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				vanne = new Vanteet(merkki,hinta);
				vanteet.add(vanne);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return vanteet;
}

public ArrayList<Vanteet> haeValitutVanteet(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> vannelista;
	ArrayList<Vanteet> vanteet=null;
	
	
	Vanteet vanne;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		vannelista = tko.haeValitutVanteet(merkki);
			
		if (vannelista != null)
		{
			vanteet = new ArrayList<Vanteet>();
			Iterator<HashMap<String, String>> it = vannelista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("VANTEET_ID"));	
				String tyyppi = map.get("TYYPPI");
				int koko = Integer.parseInt(map.get("KOKO"));
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				vanne = new Vanteet(id, tyyppi, koko, merkki, hinta);
				vanteet.add(vanne);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return vanteet;
}
public Vanteet haeValittuVanne(int vanteetId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaVanne;
	Vanteet vanne=null;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		osaVanne = tko.haeValittuVanne(vanteetId);
			
		if (osaVanne!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaVanne.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id = Integer.parseInt( map.get("VANTEET_ID"));		
				String tyyppi = map.get("TYYPPI");
				int koko = Integer.parseInt(map.get("KOKO"));
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				vanne = new Vanteet(id, tyyppi, koko, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return vanne;
}

public ArrayList<String> haeSatulaTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeSatulaTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Satula> haeSatulat(String tyyppi) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> satulalista;
	ArrayList<Satula> satulat=null;
	
	
	Satula satula;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		satulalista = tko.haeSatulat(tyyppi);
			
		if (satulalista != null)
		{
			satulat = new ArrayList<Satula>();
			Iterator<HashMap<String, String>> it = satulalista.iterator();
			while (it.hasNext())
			{
				map = it.next();
//				int id =Integer.parseInt( map.get("runko_id"));	
// 				String vari = map.get("vari");	
//				tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				satula = new Satula(merkki,hinta);
				satulat.add(satula);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return satulat;
}

public ArrayList<Satula> haeValitutSatulat(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> satulalista;
	ArrayList<Satula> satulat=null;
	
	
	Satula satula;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		satulalista = tko.haeValitutSatulat(merkki);
			
		if (satulalista != null)
		{
			satulat = new ArrayList<Satula>();
			Iterator<HashMap<String, String>> it = satulalista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("SATULA_ID"));	
				String vari = map.get("VARI");
				String tyyppi = map.get("TYYPPI");
				merkki = map.get("MERKKI");
				String koko = map.get("KOKO");
				double hinta = Double.parseDouble(map.get("HINTA"));
				satula = new Satula(id, vari, tyyppi, koko, merkki, hinta);
				satulat.add(satula);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return satulat;
}
public Satula haeValittuSatula(int satulaId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaSatula;
	Satula satula=null;
	
	
	
	try
	{
		tko = new TietokantaOhjaus();
		osaSatula = tko.haeValittuSatula(satulaId);
			
		if (osaSatula!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaSatula.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("SATULA_ID"));	
				String vari = map.get("VARI");
				String tyyppi = map.get("TYYPPI");
				String merkki = map.get("MERKKI");
				String koko = map.get("KOKO");
				double hinta = Double.parseDouble(map.get("HINTA"));
				satula = new Satula(id, vari, tyyppi,  koko, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return satula;
}
public ArrayList<String> haeVaihteetTyypit() throws SQLException
{
	TietokantaOhjaus tko ;
	HashMap<String,String>map;
	ArrayList<HashMap <String,String>> lista;
	ArrayList<String>tyypit =null;
	String tyyppi;
	try
	{
		tko = new TietokantaOhjaus();
		lista = tko.haeVaihteetTyypit();
			
		if (lista != null)
		{
			tyypit = new ArrayList<String>();
			Iterator<HashMap<String,String>> it = lista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				tyyppi = map.get("TYYPPI");
				tyypit.add(tyyppi);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}

	return tyypit;
	
}

public ArrayList<Vaihteet> haeVaihteet(String tyyppi) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> vaihdelista;
	ArrayList<Vaihteet> vaihteet=null;
	
	
	Vaihteet vaihde;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		vaihdelista = tko.haeVaihteet(tyyppi);
			
		if (vaihdelista != null)
		{
			vaihteet = new ArrayList<Vaihteet>();
			Iterator<HashMap<String, String>> it = vaihdelista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				//int id =Integer.parseInt( map.get("runko_id"));	
				//String vari = map.get("vari");	
				//tyyppi = map.get("tyyppi");
//				String koko = map.get("koko");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
//				String apu = map.get("HINTA");
//				System.out.println("rungon hinta: " + apu);
				vaihde = new Vaihteet(merkki,hinta);
				vaihteet.add(vaihde);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return vaihteet;
}

public ArrayList<Vaihteet> haeValitutVaihteet(String merkki) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> vaihdelista;
	ArrayList<Vaihteet> vaihteet=null;
	
	
	Vaihteet vaihde;
	
	
	try
	{
		tko = new TietokantaOhjaus();
		vaihdelista = tko.haeValitutVaihteet(merkki);
			
		if (vaihdelista != null)
		{
			vaihteet = new ArrayList<Vaihteet>();
			Iterator<HashMap<String, String>> it = vaihdelista.iterator();
			while (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("VAIHTEET_ID"));	
				String tyyppi = map.get("TYYPPI");
				merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				vaihde = new Vaihteet(id, tyyppi, merkki, hinta);
				vaihteet.add(vaihde);
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return vaihteet;
}
public Vaihteet haeValittuVaihde(int vaihteetId) throws SQLException
{
	
	TietokantaOhjaus tko;
	HashMap<String, String>map;
	ArrayList<HashMap <String, String>> osaVaihde;
	Vaihteet vaihteet=null;
		
	try
	{
		tko = new TietokantaOhjaus();
		osaVaihde= tko.haeValittuVaihde(vaihteetId);
			
		if (osaVaihde!= null)
		{
			
			Iterator<HashMap<String, String>> it = osaVaihde.iterator();
			if (it.hasNext())
			{
				map = it.next();
				int id =Integer.parseInt( map.get("VAIHTEET_ID"));	
				String tyyppi = map.get("TYYPPI");
				String merkki = map.get("MERKKI");
				double hinta = Double.parseDouble(map.get("HINTA"));
				vaihteet = new Vaihteet(id, tyyppi, merkki, hinta);
				
			}
		}
	}
	catch (SQLException e)
	{
		throw e;
	}
	
	
	
	return vaihteet;
}

public boolean talletaPyorasuunnitelma(PyoraSuunnitelma ps) throws SQLException{
	TietokantaOhjaus tko;
	boolean ok;
		
	try
	{
		tko = new TietokantaOhjaus();
		ok = tko.talletaPyorasuunnitelma(ps);
	}
	catch (SQLException e)
	{
		throw e;
	}
	return ok;
}
}
