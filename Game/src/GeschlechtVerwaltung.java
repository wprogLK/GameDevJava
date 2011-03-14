import java.util.ArrayList;

/**
 * Die einzelnen Geschlechter werden hier zentral generiert, gesammelt, gespeichert und nötigenfalls geändert
 */
public class GeschlechtVerwaltung {

	private ArrayList<Geschlecht> geschlechtList;
	
	public GeschlechtVerwaltung() {
		this.geschlechtList=new ArrayList<Geschlecht>();
		
		this.erstelleAlleGeschlechter();
	}
	
	private void erstelleAlleGeschlechter()
	{
		//Im Moment werden die Geschlechter noch von Hand erstellt. Später soll dies durch eine vorgefertigte Datei geschehen, welche alle Daten beinhaltet, welche dann eingelesen wird.
		
		Geschlecht männlich=new Geschlecht("M");
		Geschlecht weiblich=new Geschlecht("W");
		addGeschlecht(männlich);
		addGeschlecht(weiblich);
	}
	
	private void addGeschlecht(Geschlecht geschlecht)
	{
		this.geschlechtList.add(geschlecht);
	}
	
	public Geschlecht getGeschlecht(int eintragsnummer)
	{
		assert (eintragsnummer<this.geschlechtList.size() && eintragsnummer>=0);
		
		return this.geschlechtList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "GeschlechtVerwaltung: " +this.geschlechtList.toString();
	}

}
