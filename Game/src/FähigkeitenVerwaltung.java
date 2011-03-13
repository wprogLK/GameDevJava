import java.util.ArrayList;

/**
 * Die einzelnen Fähigkeiten werden hier zentral generiert, gesammelt, gespeichert und geändert
 */

/**
 * @author lukas
 *
 */
public class FähigkeitenVerwaltung {

//TODO: HIER WEITER MACHEN
	private ArrayList<Fähigkeit> fähigkeitenList;
	
	public FähigkeitenVerwaltung() 
	{
		ArrayList<Fähigkeit> fähigkeitenList=new ArrayList<Fähigkeit>();
		
		this.erstelleAlleAussehen();
	}
	
	private void erstelleAlleAussehen()
	{
		//TODO: Im Moment werden die AussehenTypen noch von Hand erstellt. Später soll dies durch eine vorgefertigte Datei geschehen, welche alle Daten beinhaltet, welche dann eingelesen wird.
		
		Aussehen aussehenTypEins=new Aussehen(); //TODO: Aussehen(Grafik normal, grafik..., grafik...)
		addAussehen(aussehenTypEins);
	}
	
	private void addFähigkeit(Fähigkeit aussehen)
	{
		assert !this.fähigkeitenList.contains(aussehen);
		this.fähigkeitenList.add(aussehen);
	}
	
	public Aussehen getAussehen(int eintragsnummer)
	{
		assert (eintragsnummer<this.fähigkeitenList.size() && eintragsnummer>=0);
		
		return this.fähigkeitenList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "AussehenVerwaltung: " +this.fähigkeitenList.toString();
	}

	
}
