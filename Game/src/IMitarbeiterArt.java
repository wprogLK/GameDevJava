import java.util.ArrayList;


public interface IMitarbeiterArt 
{
	
	//GETTERS & SETTERS:
	
	public int getAnzahlMitarbeiter();  //Gibt anzahl der Mitarbeiter der Art X zurück

	
	public ArrayList<Mitarbeiter> getMitarbeiter(); //Gibt ArrayListe aller Mitarbeiter der Art X zurück

	
	/**
	 * Diese Methode muss nur einmal am GameAnfang ausgeführt werden!
	 */
	public void setMitarbeiter();


	
	//Addier(/Subtrahier)-Methoden:
	public void addMitarbeiter(Mitarbeiter mitarbeiter);
	
	public void deleteMitarbeiteAusArrayListe(Mitarbeiter mitarbeiter);
	
	
	public String toString();
}
