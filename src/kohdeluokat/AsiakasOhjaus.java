package kohdeluokat;

import java.sql.SQLException;
import java.util.*;

import tietokanta.TietokantaOhjaus;

public class AsiakasOhjaus {

	public Asiakas hae (String ktunnus, String salas) throws SQLException
	{
		Asiakas asiakas=null;
		TietokantaOhjaus tko ;
		ArrayList<HashMap <String,String>> lista;
		
		if (Asiakas.tarkastaSahkoposti(ktunnus) && Asiakas.tarkastaSalasana(salas))
		{
			try
			{
				tko = new TietokantaOhjaus();
				lista = tko.haeAsiakas(ktunnus,salas);
				System.out.println(lista);
				if (lista != null)
				{
					HashMap<String,String>asiakasMap = lista.get(0);
					String sposti =  asiakasMap.get("SAHKOPOSTI");
        			String etunimi = (String) asiakasMap.get("ETUNIMI");
        			String sukunimi = (String) asiakasMap.get("SUKUNIMI");
        			String sex = asiakasMap.get("SUKUPUOLI");
        			String puh = asiakasMap.get("PUHELINNUMERO");
        			String katuos = (String)asiakasMap.get("KATUOSOITE");
        			String postinro= (String)asiakasMap.get("POSTINRO");
        			String postitmp = (String)asiakasMap.get("POSTITMP");
        			// luo asiakas-olio tiedoista 
        			asiakas = new Asiakas(sposti,etunimi,sukunimi,sex,puh, katuos,
        					postitmp,postinro);

				}
			}
			catch (SQLException e)
			{
				throw e;
			}
		}
		return asiakas;
	}
	
	
}
