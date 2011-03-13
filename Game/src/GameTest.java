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
		assertTrue(game.getFirma().getAnzahlAngestellterMitarbeiter()==0);
		assertTrue(game.getAnzahlGenerierterMitarbeiter()==0);
		assertTrue(game.getAnzahlFreieMitarbeiter()==0);
		return game;

	}
	
	@Given("newGame")
	public Game vorbereitungMitarbeiter(Game game)
	{
		
		
		//TODO: Test scheiben
		return game;
	}

	@Given("vorbereitungMitarbeiter")
	public Game MitarbeiterErstellen(Game game)
	{
		
		//TODO: Test schreiben
		assertTrue(game.getAnzahlGenerierterMitarbeiter()==1);
		assertTrue(game.getAnzahlFreieMitarbeiter()==0);
		return game;
	}
	

}



