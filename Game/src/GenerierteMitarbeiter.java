import java.util.ArrayList;


public class GenerierteMitarbeiter  
{	
	private ArrayList<Mitarbeiter> MitarbeiterList;
	
	public GenerierteMitarbeiter() 
	{
		//Leer
	}
	
	//GETTERS & SETTERS:
	
	public int getAnzahlMitarbeiter()  //Gibt anzahl der Mitarbeiter der Art X zurück
	{
		return MitarbeiterList.size();
	}
	
	public ArrayList<Mitarbeiter> getMitarbeiter() //Gibt ArrayListe aller Mitarbeiter der Art X zurück
	{	
		return MitarbeiterList;
	}
	
	

	
	//Addier(/Subtrahier)-Methoden:
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
		return "Generierte Mitarbeiter: " + this.MitarbeiterList.toString();
	}

}
