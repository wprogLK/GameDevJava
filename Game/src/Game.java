

public class Game 
{

	private Zeit zeit;
	private Firma firma;
	private MitarbeiterVerwaltung mitarbeiterVerwaltung;

	
	public Game(String firmaName, String firmaBoss,int Geld)
	{
		zeit=new Zeit();
		firma=new Firma(firmaName, firmaBoss,Geld);
		mitarbeiterVerwaltung=new MitarbeiterVerwaltung();
		
	}

	//GETTERS & SETTERS:
	
	public Zeit getZeit()
	{
		return this.zeit;
	}
	
	public Firma getFirma()
	{
		return this.firma;
	}
	
	public MitarbeiterVerwaltung getMitarbeiterVerwaltung()
	{
		return mitarbeiterVerwaltung;
	}
	
	
	//Addier(/Subtrahier)-Methoden:

	


	

}
