/**
 * Die einzelnen Mitarbeiter werden hier zentral generiert, gesammelt, gespeichert und (geändert ?)
 * Die unterschiedlichen MitarbeiterArten (Freier Mitarbeiter, angestellterMitarbeiter, generierteMitarbeiter (d.h. alle Mitarbeiter) und anstellbareMitarbeiter) werden hier zentral generiert und verwalten
 */
import java.util.*;

public class MitarbeiterVerwaltung {

	private ArrayList<Mitarbeiter> generierteMitarbeiter;
	private ArrayList<Mitarbeiter> freieMitarbeiter;
	private ArrayList<Mitarbeiter> angestellteMitarbeiter;
	private ArrayList<Mitarbeiter> anstellbareMitarbeiter;
	
	private GeschlechtVerwaltung geschlechterVerwaltung;
	private FähigkeitenVerwaltung fähigkeitenVerwaltung;
	private MitarbeiterEigenschaftenVerwaltung mitarbeiterEigenschaftVerwaltung;
	private AussehenVerwaltung aussehenVerwaltung;
	private JobVerwaltung jobVerwaltung;

	
	public MitarbeiterVerwaltung() 
	{
		//ArrayListen:
		ArrayList<Mitarbeiter> generierteMitarbeiter=new ArrayList<Mitarbeiter>();
		
		//Verwaltungen:
		GeschlechtVerwaltung geschlechterVerwaltung=new GeschlechtVerwaltung();
		FähigkeitenVerwaltung fähigkeitenVerwaltung=new FähigkeitenVerwaltung();
		MitarbeiterEigenschaftenVerwaltung mitarbeiterEigenschaftenVerwaltung=new MitarbeiterEigenschaftenVerwaltung();
		JobVerwaltung jobVerwaltung=new JobVerwaltung();
		
		
		assert generierteMitarbeiter.size()==0;
		
	}


	//GETTERS & SETTERS:
	public int getAnzahlGenerierterMitarbeiter()
	{
		return generierteMitarbeiter.size();
	}
	
	public int getAnzahlFreieMitarbeiter()
	{
		return freieMitarbeiter.size();
	}

	public ArrayList<Mitarbeiter> getGenerierteMitarbeiter()
	{	
		return generierteMitarbeiter;
	}
	
	public ArrayList<Mitarbeiter> getFreieMitarbeiter()
	{
		return freieMitarbeiter;
	}

	public ArrayList<Mitarbeiter> getAngestellteMitarbeiter()
	{
		return angestellteMitarbeiter;
	}
	
	public ArrayList<Mitarbeiter> getAnstellbareMitarbeiter()
	{
		return anstellbareMitarbeiter;
	}

	/*
	 * Diese Methode muss nur einmal ( d.h. im Konstruktor) ausgeführt werden!
	 */
	private  void mitarbeiterEinteilen()
	{	
		assert this.freieMitarbeiter.isEmpty();
		assert this.angestellteMitarbeiter.isEmpty();
		assert this.anstellbareMitarbeiter.isEmpty();
		
		for(Mitarbeiter mitarbeiter:generierteMitarbeiter)
		{
			if(mitarbeiter.getIstFreierMitarbeiter())
			{
				assert !this.freieMitarbeiter.contains(mitarbeiter);
				
				this.freieMitarbeiter.add(mitarbeiter);
			}
			else if(mitarbeiter.getIstAngestellterMitarbeiter())
			{
				assert !this.angestellteMitarbeiter.contains(mitarbeiter);
				
				this.angestellteMitarbeiter.add(mitarbeiter);
			}
			else if(mitarbeiter.getIstAnstellbarerMitarbeit())
			{
				assert !this.anstellbareMitarbeiter.contains(mitarbeiter);
				
				this.anstellbareMitarbeiter.add(mitarbeiter);
			}
			else
			{
				System.out.println("ERROR: Klasse in MitarbeiterVerwaltung!");
				assert false;
			}
			
		}
	}
	
	
	
	
	
	
	//Addier(/Subtrahier)-Methoden:
	public void addFreierMitarbeiter(Mitarbeiter mitarbeiter)
	{
		freieMitarbeiter.add(mitarbeiter);
	}
	
	private void createAlleMitarbeiter()
	{
		//TODO: HIER WEITER MACHEN
		Mitarbeiter mitarbeiter1=new Mitarbeiter("Max","Muster",this.geschlechterVerwaltung.getGeschlecht(0),"Dies ist MaxMuster, ein Programmierneuling.",this.aussehenVerwaltung.getAussehen(0),false,false,this.jobVerwaltung.getJob(0),10,this.mitarbeiterEigenschaftVerwaltung.getMitarbeiterEigenschaft(0),this.fähigkeitenVerwaltung
		("Max", "Muster", this.geschlechterVerwaltung.getGeschlecht(0), "Dies ist Max Muster, ein Programmierneuling",aussehenTypA, false, false, jobProgrammierer,10,mitarbeiterEigenschaften.getEigenschaft(1),fähigkeiten(20,15,10,15), 100,100); 
		// (String Vorname, String Nachname,Geschlecht Geschlecht,String Beschreibung,Aussehen Aussehen,Boolean istFreierMitarbeiter,Boolean istEingestellt,Job Job, int GrundLohn,Eigenschaft Eigenschaft,Fähigkeiten Fähigkeiten(int Code, int Schreiben,int Grafik,int Spezial),int MaxEnergie, int MaxKreativitaet)
		
		
		
		//TODO: Später wird hier eine Methode (vielleicht einer anderen Klasse?) aufgerufen, welche aus einer Datei die Mitarbeiter einliest und mittels addGenerierteMitarbeiter(...) hinzufügt.
	}
	
	public void addMitarbeiter(Mitarbeiter mitarbeiter)
	{
		assert !this.generierteMitarbeiter.contains(mitarbeiter);
		this.generierteMitarbeiter.add(mitarbeiter);
	}

	public void removeAnstellbareMitarbeiter(Mitarbeiter mitarbeiter)
	{
		
		//KOMMENTAR: Vielleicht wäre es besser entweder eine Methode in dieser Klasse zu schreiben, welche das Adden und Remoten steuert oder dies der Mitarbeiterklasse überlassen.
		assert this.anstellbareMitarbeiter.contains(mitarbeiter);
		
		this.anstellbareMitarbeiter.remove(mitarbeiter);
	}
	


	public String toStringFreieMitarbeiter()
	{
		return "Freie Mitarbeiter: " + this.freieMitarbeiter.toString();
	}
}