/**
 * Lies Daten aus einer Datei (TODO MUSS NOCH ERSTELLT WERDEN) je nach Geschlecht beim Erstellen ein und speichert diese ab.
 * Regelt unteranderem die korrekte Wortwahl (sein/ihr, er/sie, Herr/Frau, ... ect.)
 */

/**
 * @author lukas
 */
public class Geschlecht {

	private String bezeichnung;

	public Geschlecht(String bezeichnung) {
		// TODO Auto-generated constructor stub
		this.bezeichnung=bezeichnung;
	}

	public String toString()
	{
		return "Geschlecht: " + this.bezeichnung;
	}

}
