import java.util.ArrayList;


public class AngestelleMitarbeiter extends FreieMitarbeiter implements IMitarbeiterArt
{
	private ArrayList<Mitarbeiter> MitarbeiterList;		
	private ArrayList<Mitarbeiter> generierteMitarbeiter;
	
	public AngestelleMitarbeiter(ArrayList<Mitarbeiter> generierteMitarbeiter) 
	{
		super(generierteMitarbeiter);
		this.generierteMitarbeiter=generierteMitarbeiter;
		this.setMitarbeiter();
	}
	
	//GETTERS & SETTERS:
	
	/**
	 * Diese Methode muss nur einmal am GameAnfang ausgeführt werden!
	 */
	public void setMitarbeiter()
	{	
		assert MitarbeiterList.isEmpty();
		
		for(Mitarbeiter mitarbeiter:generierteMitarbeiter)
		{
			if(mitarbeiter.getIstAngestellterMitarbeiter());
			{
				this.MitarbeiterList.add(mitarbeiter);
			}
		}
	}
	

	
	//Addier(/Subtrahier)-Methoden:
	
	
	
	public String toString()
	{
		return "Angestellte Mitarbeiter: " + this.MitarbeiterList.toString();
	}

}
