import java.util.ArrayList;

/**
 * Die einzelnen Aussehen der Figuren werden hier zentral generiert, gesammelt, gespeichert und geändert
 * 
 */
public class AussehenVerwaltung {
	
	private ArrayList<Aussehen> aussehenList;
	
	public AussehenVerwaltung() 
	{
		ArrayList<Aussehen> aussehenList=new ArrayList<Aussehen>();
		
		this.erstelleAlleAussehen();
	}
	
	private void erstelleAlleAussehen()
	{
		//TODO: Im Moment werden die AussehenTypen noch von Hand erstellt. Später soll dies durch eine vorgefertigte Datei geschehen, welche alle Daten beinhaltet, welche dann eingelesen wird.
		
		Aussehen aussehenTypEins=new Aussehen(); //TODO: Aussehen(Grafik normal, grafik..., grafik...)
		addAussehen(aussehenTypEins);
	}
	
	private void addAussehen(Aussehen aussehen)
	{
		assert !this.aussehenList.contains(aussehen);
		this.aussehenList.add(aussehen);
	}
	
	public Aussehen getAussehen(int eintragsnummer)
	{
		assert (eintragsnummer<this.aussehenList.size() && eintragsnummer>=0);
		
		return this.aussehenList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "AussehenVerwaltung: " +this.aussehenList.toString();
	}
	

}
