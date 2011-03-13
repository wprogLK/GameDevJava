/**
 * Die einzelnen Mitarbeiter werden hier zentral generiert, gesammelt, gespeichert und (geändert ?)
 * Die unterschiedlichen MitarbeiterArten (Freier Mitarbeiter, angestellterMitarbeiter, generierteMitarbeiter (d.h. alle Mitarbeiter) und anstellbareMitarbeiter) werden hier zentral generiert und verwalten
 */
import java.util.*;

public class MitarbeiterVerwaltung {

	private ArrayList<Mitarbeiter> generierteMitarbeiter;
	private ArrayList<Mitarbeiter> freieMitarbeiter;
	private ArrayList<Mitarbeiter> angestellteMitarbeiter;
	private ArrayList<Mitarbeiter> angestellteMitarbeiter;

	
	public MitarbeiterVerwaltung() 
	{
		ArrayList<Mitarbeiter> generierteMitarbeiter=new ArrayList<Mitarbeiter>();

		assert generierteMitarbeiter.size()==0;
		
	}

	//GETTERS & SETTERS:
	public int getAnzahlGenerierterMitarbeiter()
	{
		assert generierteMitarbeiter.
		return generierteMitarbeiter.size();
	}

	public ArrayList<Mitarbeiter> getMitarbeiter() //Gibt ArrayListe aller Mitarbeiter der Art X zurück
	{	
		return MitarbeiterList;
	}


	/**
	 * Diese Methode muss nur einmal am GameAnfang ausgeführt werden!
	 */
	public  void setMitarbeiter()
	{	
		assert MitarbeiterList.isEmpty();
		
		for(Mitarbeiter mitarbeiter:generierteMitarbeiter)
		{
			if(mitarbeiter.getIstFreierMitarbeiter());
			{
				this.MitarbeiterList.add(mitarbeiter);
			}
		}
	}
	
	//Addier(/Subtrahier)-Methoden:
	public void addNeuerMitarbeiter(Mitarbeiter mitarbeiter)
	{
		generierteMitarbeiter.add(mitarbeiter);
	}
	
	private void createAlleMitarbeiter()
	{
	
		
		
		Geschlecht geschlechtMaennlich=new Geschlecht("M");
		Geschlecht geschlechtWeiblich=new Geschlecht("W");
		
		FähigkeitenVerwaltung fähigkeitenVerwaltung=new FähigkeitenVerwaltung();
		MitarbeiterEigenschaften mitarbeiterEigenschaften=new MitarbeiterEigenschaften();
	}
	
	public void addMitarbeiter(Mitarbeiter mitarbeiter)
	{
		assert !this.MitarbeiterList.contains(mitarbeiter);
		this.MitarbeiterList.add(mitarbeiter);
	}

	public void deleteMitarbeiteAusArrayListe(Mitarbeiter mitarbeiter)
	{
		assert this.MitarbeiterList.contains(mitarbeiter);
		
		this.MitarbeiterList.remove(mitarbeiter);
	}
	


	public String toString()
	{
		return "Freie Mitarbeiter: " + this.MitarbeiterList.toString();
	}
}