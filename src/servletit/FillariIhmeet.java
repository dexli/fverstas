package servletit;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kohdeluokat.*;

public class FillariIhmeet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FillariIhmeet() {
		super();
	}
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		RequestDispatcher dispatcher;

		if (action == null
				|| (action != null && action.equalsIgnoreCase("paluu"))) {
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);

		} else if (action != null && action.equalsIgnoreCase("Kirjaudu")) {
			kirjaudu(request, response);

		} else if (action != null && action.equalsIgnoreCase("Kirjaudu ulos")) {
			kirjauduUlos(request, response);

		} else if (action != null && action.equalsIgnoreCase("poistu")) {
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);

		} else if (action != null && action.equalsIgnoreCase("Hae")) {

			tyyppiValittu(request, response);
		} else if (action != null
				&& action.equalsIgnoreCase("haeValitutRungot")) {

			merkkiValittu(request, response);
		} else if (action != null && action.equalsIgnoreCase("haeValittuRunko")) {

			runkoValittu(request, response);
		} else if (action != null
				&& action.equalsIgnoreCase("haeValitutHaarukat")) {

			haarukkaMerkkiValittu(request, response);

		} else if (action != null
				&& action.equalsIgnoreCase("haeValittuHaarukka")) {

			haarukkaValittu(request, response);
			
		} else if (action != null
				&& action.equalsIgnoreCase("haeValitutTangot")) {

			tankoMerkkiValittu(request, response);
			
		} else if (action != null && action.equalsIgnoreCase("haeValittuTanko")) {

			tankoValittu(request, response);
			
		} else if (action != null && action.equalsIgnoreCase("haeVanneTyypit")){
			
			vanneTyyppiValittu(request, response);
		
		} else if (action != null && action.equalsIgnoreCase("haeValitutVanteet")){
		
		vanneMerkkiValittu(request, response);
		
		}else if (action != null
				&& action.equalsIgnoreCase("haeValittuVanne")) {

			vanneValittu(request, response);
			
		} else if (action != null
				&& action.equalsIgnoreCase("haeValitutRenkaat")) {

			rengasMerkkiValittu(request, response);

		} else if (action != null
				&& action.equalsIgnoreCase("haeValittuRengas")) {

			RenkaatValittu(request, response);
			
		} else if (action != null && action.equalsIgnoreCase("haeJarruTyypit")) {
			
			JarruTyyppiValittu(request, response);
		
		} else if (action != null && action.equalsIgnoreCase("haeValitutJarrut")) {
		
		JarrutMerkkiValittu(request, response);
		
		}else if (action != null
				&& action.equalsIgnoreCase("haeValittuJarru")) {

			JarrutValittu(request, response);
			
		} else if (action != null && action.equalsIgnoreCase("haeKetjuTyypit")) {
			
			KetjutTyyppiValittu(request, response);
		
		} else if (action != null && action.equalsIgnoreCase("haeValitutKetjut")) {
		
		ketjuMerkkiValittu(request, response);
		
		}else if (action != null
				&& action.equalsIgnoreCase("haeValittuKetju")) {

			KetjutValittu(request, response);
			
		} else if (action != null && action.equalsIgnoreCase("haePoljinTyypit")) {
			
			PolkimetTyyppiValittu(request, response);
		
		} else if (action != null && action.equalsIgnoreCase("haeValitutPolkimet")) {
		
			polkimetMerkkiValittu(request, response);
		
		}else if (action != null
				&& action.equalsIgnoreCase("haeValittuPoljin")) {

			PolkimetValittu(request, response);
			
		}else if (action != null
				&& action.equalsIgnoreCase("haeSatulaTyypit")) {

			satulaTyyppiValittu(request, response);
		} 
			
		else if (action != null
				&& action.equalsIgnoreCase("haeValitutSatulat")) {

			satulaMerkkiValittu(request, response);
		}
		
		else if (action != null
				&& action.equalsIgnoreCase("haeValittuSatula")) {

			satulaValittu(request, response);
			
		}else if (action != null
				&& action.equalsIgnoreCase("haeVaihdeTyypit")) {

			vaihdeTyyppiValittu(request, response);
		} 
			
		else if (action != null
				&& action.equalsIgnoreCase("haeValitutVaihteet")) {

			vaihdeMerkkiValittu(request, response);
		}
		
		else if (action != null
				&& action.equalsIgnoreCase("haeValittuVaihde")) {

			vaihdeValittu(request, response);
		}
		else if (action != null
				&& action.equalsIgnoreCase("Lähetä tarjouspyyntö")) {

			lahetaPyorasuunnitelma(request, response);
		}
		else if (action != null
				&& action.equalsIgnoreCase("Peruuta")) {

			peruutaPyorasuunnitelma(request, response);
		}
		
		else if (action != null
				&& action.equalsIgnoreCase("Suunnittele uusi pyörä")) {

			peruutaPyorasuunnitelma(request, response);
		}
		else if (action != null
				&& action.equalsIgnoreCase("Tyhjennä pyöräsuunnitelma")) {

			peruutaPyorasuunnitelma(request, response);
		}
		
}


	protected void merkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		request.setAttribute("tyypinValinta", true);

		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Runko> rungot = ro.haeValitutRungot(merkki);
			if (rungot != null) {
				session.setAttribute("valitturunkolista", rungot);
				request.setAttribute("valittuMerkki", merkki);
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void tyyppiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");
		System.out.println("tyyppiValittu");
		request.setAttribute("tyypinValinta", true);

		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Runko> rungot = ro.haeRungot(tyyppi);
			if (rungot != null) {
				session.setAttribute("runkolista", rungot);
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void runkoValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		request.setAttribute("tyypinValinta", false);

		System.out.println("runkoValittu");
		try {
			int runkoId = Integer.parseInt(request.getParameter("runkoId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Runko runko = ro.haeValittuRunko(runkoId);

			if (runko != null) {
				session.setAttribute("pyoranRunko", runko);
				request.setAttribute("valittuRunko", runkoId);
				request.setAttribute("haarukka", true);
				
				haarukkaTyyppiValittu(request, response, runko);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void haarukkaTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response, Runko runko) throws ServletException,
			IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		Liitos liitos = runko.getLiitos();
		System.out.println("haarukkaTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Haarukka> haarukat = ro.haeHaarukat(liitos);
			if (haarukat != null) {
				session.setAttribute("haarukkalista", haarukat);
				session.setAttribute("runkolista", null);
				request.setAttribute("haarukka", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void haarukkaMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Haarukka> haarukat = ro.haeValitutHaarukat(merkki);
			if (haarukat != null) {
				session.setAttribute("valittuhaarukkalista", haarukat);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("haarukka", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void haarukkaValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("haarukkaValittu");
		try {
			int haarukkaId = Integer.parseInt(request
					.getParameter("haarukkaId").trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Haarukka haarukka = ro.haeValittuHaarukka(haarukkaId);

			if (haarukka != null) {
				session.setAttribute("pyoranHaarukka", haarukka);
				request.setAttribute("valittuHaarukka", haarukkaId);
				request.setAttribute("tanko", true);
				
				tankoTyyppiValittu(request, response, haarukka);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void tankoTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response, Haarukka haarukka)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		Liitos liitos = haarukka.getLiitos();
		System.out.println("tankoTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Tanko> tangot = ro.haeTangot(liitos);
			if (tangot != null) {
				session.setAttribute("tankolista", tangot);
				session.setAttribute("haarukkalista", null);
				request.setAttribute("tanko", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void tankoMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Tanko> tangot = ro.haeValitutTangot(merkki);
			if (tangot != null) {
				session.setAttribute("valittutankolista", tangot);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("tanko", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void tankoValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("tankoValittu");
		try {
			int tankoId = Integer.parseInt(request.getParameter("tankoId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Tanko tanko = ro.haeValittuTanko(tankoId);

			if (tanko != null) {
				session.setAttribute("pyoranTanko", tanko);
				request.setAttribute("valittuTanko", tankoId);
				session.setAttribute("tankolista", null);
				request.setAttribute("vanneTyypinValinta", true);
				
				ArrayList<String> tyypit = ro.haeVanneTyypit();
				session.setAttribute("vannetyyppilista", tyypit);
				
				 dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				 dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void vanneTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");

		System.out.println("vanneTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Vanteet> vanteet = ro.haeVanteet(tyyppi);
			if (vanteet != null) {
				session.setAttribute("vannelista", vanteet);
				request.setAttribute("vanneTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void vanneMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Vanteet> vanteet = ro.haeValitutVanteet(merkki);
			if (vanteet != null) {
				session.setAttribute("valittuvannelista", vanteet);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("vanneTyypinValinta", true);

				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void vanneValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("vanneValittu");
		try {
			int vanteetId = Integer.parseInt(request.getParameter("vanteetId").trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Vanteet vanne = ro.haeValittuVanne(vanteetId);

			if (vanne != null) {
				session.setAttribute("pyoranVanne", vanne);
				request.setAttribute("valittuVanne", vanteetId);
				session.setAttribute("vannelista", null);
				request.setAttribute("renkaat", true);
				
				RengasTyyppiValittu(request, response, vanne);

			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void RengasTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response, Vanteet vanne)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		
		int vannekoko = vanne.getKoko();
		System.out.println("tankoTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Renkaat> renkaat = ro.haeRenkaat(vannekoko);
			if (renkaat != null) {
				session.setAttribute("rengaslista", renkaat);
				session.setAttribute("vannelista", null);
				request.setAttribute("renkaat", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void rengasMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Renkaat> renkaat = ro.haeValitutRenkaat(merkki);
			if (renkaat != null) {
				session.setAttribute("valitturengaslista", renkaat);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("renkaat", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void RenkaatValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("renkaatValittu");
		try {
			int renkaatId = Integer.parseInt(request.getParameter("renkaatId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Renkaat renkaat = ro.haeValittuRengas(renkaatId);

			if (renkaat != null) {
				session.setAttribute("pyoranRengas", renkaat);
				request.setAttribute("valittuRengas", renkaatId);
				session.setAttribute("rengaslista", null);
				
				request.setAttribute("jarruTyypinValinta", true);
				
				ArrayList<String> tyypit = ro.haeJarruTyypit();
				session.setAttribute("jarrutyyppilista", tyypit);
				
				 dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				 dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void JarruTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");
		System.out.println("tyyppiValittu");

		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Jarrut> jarrut = ro.haeJarrut(tyyppi);
			if (jarrut != null) {
				session.setAttribute("jarrulista", jarrut);
				request.setAttribute("jarruTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void JarrutMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Jarrut> jarrut = ro.haeValitutJarrut(merkki);
			if (jarrut != null) {
				session.setAttribute("valittujarrulista", jarrut);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("jarruTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void JarrutValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		request.setAttribute("tyypinValinta", false);

		System.out.println("jarrutValittu");
		try {
			int jarrutId = Integer.parseInt(request.getParameter("jarrutId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Jarrut jarrut = ro.haeValittuJarrut(jarrutId);

			if (jarrut != null) {
				session.setAttribute("pyoranJarrut", jarrut);
				request.setAttribute("valittuJarru", jarrutId);
				session.setAttribute("jarrulista", null);
				
				request.setAttribute("ketjuTyypinValinta", true);
				
				ArrayList<String> tyypit = ro.haeKetjuTyypit();
				session.setAttribute("ketjutyyppilista", tyypit);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void KetjutTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");
		System.out.println("KetjutTyyppiValittu");
		request.setAttribute("haeKetjuTyypit", true);

		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Ketjut> ketjut = ro.haeKetjut(tyyppi);
			if (ketjut != null) {
				session.setAttribute("ketjulista", ketjut);
				request.setAttribute("ketjuTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void ketjuMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Ketjut> ketjut = ro.haeValitutKetjut(merkki);
			if (ketjut != null) {
				session.setAttribute("valittuketjulista", ketjut);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("ketjuTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void KetjutValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("ketjutValittu");
		try {
			int ketjutId = Integer.parseInt(request.getParameter("ketjutId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Ketjut ketjut = ro.haeValittuKetju(ketjutId);

			if (ketjut != null) {
				session.setAttribute("pyoranKetjut", ketjut);
				request.setAttribute("valittuKetju", ketjutId);
				session.setAttribute("ketjulista", null);
				
				request.setAttribute("poljinTyypinValinta", true);
				
				ArrayList<String> tyypit = ro.haePolkimetTyypit();
				session.setAttribute("poljintyyppilista", tyypit);
				
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void PolkimetTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");
		
		System.out.println("PolkimetTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Polkimet> polkimet = ro.haePolkimet(tyyppi);
			if (polkimet != null) {
				session.setAttribute("poljinlista", polkimet);
				request.setAttribute("poljinTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void polkimetMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Polkimet> polkimet = ro.haeValitutPolkimet(merkki);
			if (polkimet != null) {
				session.setAttribute("valittupoljinlista", polkimet);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("poljinTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void PolkimetValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("polkimetValittu");
		try {
			int polkimetId = Integer.parseInt(request.getParameter("polkimetId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Polkimet polkimet = ro.haeValittuPoljin(polkimetId);

			if (polkimet != null) {
				session.setAttribute("pyoranPolkimet", polkimet);
				request.setAttribute("valittuPoljin", polkimetId);
				session.setAttribute("poljinlista", null);
				
				request.setAttribute("satulaTyypinValinta", true);
				
				ArrayList<String> tyypit = ro.haeSatulaTyypit();
				session.setAttribute("satulatyyppilista", tyypit);

				 dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				 dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	protected void satulaTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");
		
		System.out.println("SatulaTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Satula> satulat = ro.haeSatulat(tyyppi);
			if (satulat != null) {
				session.setAttribute("satulalista", satulat);
				request.setAttribute("satulaTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void satulaMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Satula> satulat = ro.haeValitutSatulat(merkki);
			if (satulat != null) {
				session.setAttribute("valittusatulalista", satulat);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("satulaTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void satulaValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("satulaValittu");
		try {
			int satulaId = Integer.parseInt(request.getParameter("satulaId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Satula satula = ro.haeValittuSatula(satulaId);

			if (satula != null) {
				session.setAttribute("pyoranSatula", satula);
				request.setAttribute("valittuSatula", satulaId);
				session.setAttribute("satulalista", null);
				
				request.setAttribute("vaihteetTyypinValinta", true);
				
				ArrayList<String> tyypit = ro.haeVaihteetTyypit();
				session.setAttribute("vaihdetyyppilista", tyypit);

				 dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				 dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	
	protected void vaihdeTyyppiValittu(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String tyyppi = request.getParameter("tyyppi");
		
		System.out.println("VaihteetTyyppiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Vaihteet> vaihteet = ro.haeVaihteet(tyyppi);
			if (vaihteet != null) {
				session.setAttribute("vaihteetlista", vaihteet);
				request.setAttribute("vaihteetTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void vaihdeMerkkiValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String merkki = request.getParameter("merkki");
		System.out.println("merkkiValittu");
		try {
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<Vaihteet> vaihteet = ro.haeValitutVaihteet(merkki);
			if (vaihteet != null) {
				session.setAttribute("valittuvaihdelista", vaihteet);
				request.setAttribute("valittuMerkki", merkki);
				request.setAttribute("vaihteetTyypinValinta", true);
				
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void vaihdeValittu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;

		System.out.println("vaihdeValittu");
		try {
			int vaihteetId = Integer.parseInt(request.getParameter("vaihteetId")
					.trim());
			RunkoOhjaus ro = new RunkoOhjaus();
			Vaihteet vaihde = ro.haeValittuVaihde(vaihteetId);

			if (vaihde != null) {
				session.setAttribute("pyoranVaihteet", vaihde);
				request.setAttribute("valittuVaihde", vaihteetId);
				session.setAttribute("vaihteetlista", null);
				
				double kokonaishinta = vaihde.getHinta();
//				haarukka.getHinta() + vaihteet.getHinta() + polkimet.getHinta() + renkaat.getHinta() + satula.getHinta() + jarrut.getHinta() + ketjut.getHinta();


				 dispatcher = request.getRequestDispatcher("SuunniteltuPyora.jsp");
				 dispatcher.forward(request, response);
			} else
				throw new SQLException();

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	
	
	protected void kirjauduUlos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.invalidate();
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
		dispatcher.forward(request, response);

	}

	protected void kirjaudu(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		String sahkoposti = request.getParameter("sahkoposti");
		String salasana = request.getParameter("salasana");
		AsiakasOhjaus ohjaus = new AsiakasOhjaus();
		Asiakas asiakas = null;

		try {
			asiakas = ohjaus.hae(sahkoposti, salasana);
			if (asiakas != null) {
				RunkoOhjaus ro = new RunkoOhjaus();
				ArrayList<String> tyypit = ro.haeTyypit();
				if (tyypit != null) {
					System.out.println(asiakas);
					System.out.println(tyypit);
					session.setAttribute("asiakas", asiakas);
					session.setAttribute("tyyppilista", tyypit);
					request.setAttribute("tyypinValinta", true);

					dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
					dispatcher.forward(request, response);
				} else
					throw new SQLException();

			} else {
				request.setAttribute("eiTulosta", true);
				dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
				dispatcher.forward(request, response);
			}

		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
			
			
			
		}

	}
	protected void lahetaPyorasuunnitelma(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		
		double kokonaishinta;
		Pvm lahetyspvm = new Pvm();
		Asiakas asiakas = (Asiakas) session.getAttribute("asiakas");
		Runko runko = (Runko) session.getAttribute("pyoranRunko");
		Tanko tanko = (Tanko) session.getAttribute("pyoranTanko");
		Haarukka haarukka = (Haarukka) session.getAttribute("pyoranHaarukka");
		Vaihteet vaihteet = (Vaihteet) session.getAttribute("pyoranVaihteet");
		Polkimet polkimet = (Polkimet) session.getAttribute("pyoranPolkimet");
		Vanteet vanteet = (Vanteet) session.getAttribute("pyoranVanne");
		Renkaat renkaat = (Renkaat) session.getAttribute("pyoranRengas");
		Satula satula = (Satula) session.getAttribute("pyoranSatula");
		Jarrut jarrut = (Jarrut) session.getAttribute("pyoranJarrut");
		Ketjut ketjut = (Ketjut) session.getAttribute("pyoranKetjut");
		
		kokonaishinta = runko.getHinta() + tanko.getHinta() + haarukka.getHinta() + vaihteet.getHinta() + polkimet.getHinta() + renkaat.getHinta() + satula.getHinta() + jarrut.getHinta() + ketjut.getHinta();
		
		
		
		PyoraSuunnitelma ps= new PyoraSuunnitelma(0, kokonaishinta,
				 lahetyspvm,  asiakas,  runko,  tanko,
				 haarukka,  vaihteet,  polkimet,
				 vanteet,  renkaat,  satula,  jarrut,
				 ketjut);
		
		RunkoOhjaus ro = new RunkoOhjaus();
		
		try {
			boolean ok = ro.talletaPyorasuunnitelma(ps);
			
		
			session.setAttribute("pyoranRunko", null);
			session.setAttribute("pyoranTanko", null);
			session.setAttribute("pyoranHaarukka", null);
			session.setAttribute("pyoranVaihteet", null);
			session.setAttribute("pyoranPolkimet", null);
			session.setAttribute("pyoranVanne", null);
			session.setAttribute("pyoranRengas", null);
			session.setAttribute("pyoranSatula", null);
			session.setAttribute("pyoranJarrut", null);
			session.setAttribute("pyoranKetjut", null);
			
			dispatcher = request.getRequestDispatcher("Kiitos.jsp");
			dispatcher.forward(request, response);
		}
		catch (SQLException s){
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	protected void peruutaPyorasuunnitelma(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
			
		session.setAttribute("pyoranRunko", null);
		session.setAttribute("pyoranTanko", null);
		session.setAttribute("pyoranHaarukka", null);
		session.setAttribute("pyoranVaihteet", null);
		session.setAttribute("pyoranPolkimet", null);
		session.setAttribute("pyoranVanne", null);
		session.setAttribute("pyoranRengas", null);
		session.setAttribute("pyoranSatula", null);
		session.setAttribute("pyoranJarrut", null);
		session.setAttribute("pyoranKetjut", null);
		
		session.setAttribute("runkolista", null);
		session.setAttribute("haarukkalista", null);
		session.setAttribute("tankolista", null);
		session.setAttribute("vannelista", null);
		session.setAttribute("rengaslista", null);
		session.setAttribute("jarrulista", null);
		session.setAttribute("ketjulista", null);
		session.setAttribute("poljinlista", null);
		session.setAttribute("satulalista", null);
		session.setAttribute("vaihdelista", null);
		
		try {
			
			request.setAttribute("tyypinValinta", true);
			RunkoOhjaus ro = new RunkoOhjaus();
			ArrayList<String> tyypit = ro.haeTyypit();
			session.setAttribute("tyyppilista", tyypit);
				dispatcher = request.getRequestDispatcher("Suunnittelu.jsp");
				dispatcher.forward(request, response);
			
System.out.println(tyypit);
		}

		catch (SQLException e) {
			request.setAttribute("tietokantaVirhe", true);
			dispatcher = request.getRequestDispatcher("Kirjautuminen.jsp");
			dispatcher.forward(request, response);
			
			
			
		}
		
	}
		
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}
	
	

}
