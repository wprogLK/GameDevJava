/* ÜBERSICHT
 * 
 * Dateiname:
 * 
 * Beschreibung:
 * 
 * 
 * 
 * Erstellt am:
 * Aktuelle Version:
 * 
 * Anmerkungen & Kommentare:
 * 
 * 
 * Probleme:
 * 
 * Versionsgeschichte:
 * |	Version		|		Datum		|		Autor		|							Bemerkung							|
 * |----------------|-------------------|-------------------|---------------------------------------------------------------|
 * 
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import ch.unibe.jexample.JExample;
import ch.unibe.jexample.Given;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JExample.class)
public class GameTest 
{
	
	@Test
	public Game newGame() 
	{
		Game game=new Game("WprogGames","Lukas",1000);

		assertTrue(game.getZeit().toString().matches("0 Tage, 0 Wochen, 0 Monate, 0 Jahre"));
		assertTrue(game.getFirma().getFirmaName().matches("WprogGames"));
		assertTrue(game.getFirma().getBossName().matches("Lukas"));
		assertTrue(game.getFirma().getGeld()==1000);
		assertTrue(game.getMitarbeiterVerwaltung().getAnzahlGenerierterMitarbeiter()==0);
		assertTrue(game.getMitarbeiterVerwaltung().getAnzahlAngestellteMitarbeiter()==0);
		assertTrue(game.getMitarbeiterVerwaltung().getAnzahlAnstellbareMitarbeiter()==0);
		assertTrue(game.getMitarbeiterVerwaltung().getAnzahlFreieMitarbeiter()==0);
	
		return game;

	}

	@Test
	public void zeitTest()
	{
		Zeit zeit=new Zeit();
		
		assertTrue(zeit.toString().matches("0 Tage, 0 Wochen, 0 Monate, 0 Jahre"));
	}
	
	@Test
	public void AussehenVerwaltungTest()
	{
		AussehenVerwaltung verwaltung=new AussehenVerwaltung();
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
		
	}
	
	@Test
	public void JobVerwaltungTest()
	{
		JobVerwaltung verwaltung=new JobVerwaltung();
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
	}
	
	@Test
	public void GeschlechtVerwaltungTest()
	{
		GeschlechtVerwaltung verwaltung=new GeschlechtVerwaltung();
		assertTrue(verwaltung.getGeschlecht(0).toString().matches("Geschlecht: M"));
		assertTrue(verwaltung.getGeschlecht(1).toString().matches("Geschlecht: W"));
		
		//TODO: Noch Test schreiben
	}
	
	@Test
	public void FähigkeitenVerwaltungTest()
	{
		FähigkeitenVerwaltung verwaltung=new FähigkeitenVerwaltung(10,20,30,40);
		System.out.println(verwaltung.toString());
		assertTrue(verwaltung.getFähigkeit(0).toString().matches("Fähigkeit: Code Wert: 10 Bonuswert: 0 zunahmeBeiaufLevelnFaktor: 1"));
		assertTrue(verwaltung.getFähigkeit(1).toString().matches("Fähigkeit: Schreiben Wert: 20 Bonuswert: 0 zunahmeBeiaufLevelnFaktor: 1"));
		assertTrue(verwaltung.getFähigkeit(2).toString().matches("Fähigkeit: Grafik Wert: 30 Bonuswert: 0 zunahmeBeiaufLevelnFaktor: 1"));
		assertTrue(verwaltung.getFähigkeit(3).toString().matches("Fähigkeit: Spezial Wert: 40 Bonuswert: 0 zunahmeBeiaufLevelnFaktor: 1"));
		
		
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
	}
	
	@Test
	public void MitarbeiterEigenschaftenVerwaltungTest()
	{
		MitarbeiterEigenschaftenVerwaltung verwaltung=new MitarbeiterEigenschaftenVerwaltung();
		System.out.println(verwaltung.toString());
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
	}
	
	@Test
	public void MitarbeiterVerwaltungTest()
	{
		MitarbeiterVerwaltung verwaltung=new MitarbeiterVerwaltung();
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
	}
	
	

}



