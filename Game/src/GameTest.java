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
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
	}
	
	@Test
	public void FähigkeitenVerwaltungTest()
	{
		FähigkeitenVerwaltung verwaltung=new FähigkeitenVerwaltung(10,20,30,40);
		//Noch nichts zu testen
		//TODO: Noch Test schreiben
	}
	
	@Test
	public void MitarbeiterEigenschaftenVerwaltungTest()
	{
		MitarbeiterEigenschaftenVerwaltung verwaltung=new MitarbeiterEigenschaftenVerwaltung();
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



