import java.util.ArrayList;


public class FreieMitarbeiter implements IMitarbeiterArt
{
	private ArrayList<Mitarbeiter> MitarbeiterList;		
	private ArrayList<Mitarbeiter> generierteMitarbeiter;
	
	public FreieMitarbeiter(ArrayList<Mitarbeiter> generierteMitarbeiter) 
	{
		this.generierteMitarbeiter=generierteMitarbeiter;
		this.setMitarbeiter();
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
