import java.util.ArrayList;


public class AnstellbareMitarbeiter extends FreieMitarbeiter implements IMitarbeiterArt
{
	private ArrayList<Mitarbeiter> MitarbeiterList;		
	private ArrayList<Mitarbeiter> generierteMitarbeiter;
	
	public AnstellbareMitarbeiter(ArrayList<Mitarbeiter> generierteMitarbeiter) 
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
			if((!mitarbeiter.getIstFreierMitarbeiter() && !mitarbeiter.getIstAngestellterMitarbeiter()));
			{
				this.MitarbeiterList.add(mitarbeiter);
			}
		}
	}
	
	public String toString()
	{
		return "Anstellbare Mitarbeiter: " + this.MitarbeiterList.toString();
	}

}
