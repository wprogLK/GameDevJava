import java.util.ArrayList;

/**
 * Die einzelnen Fähigkeiten werden hier zentral generiert, gesammelt, gespeichert und geändert
 */

/**
 * @author lukas
 *
 */
public class FähigkeitenVerwaltung {
	
	private ArrayList<Fähigkeit> fähigkeitenList;
	
	public FähigkeitenVerwaltung(int wertCode, int wertSchreiben, int wertGrafik, int wertSpezial)
	{
		this.fähigkeitenList=new ArrayList<Fähigkeit>();
		
		this.erstelleAlleFähigkeiten(wertCode, wertSchreiben, wertGrafik, wertSpezial);
	}
	
	private void erstelleAlleFähigkeiten(int wertCode, int wertSchreiben, int wertGrafik, int wertSpezial)
	{															
		Fähigkeit code=new Fähigkeit("Code",wertCode,0,1);
		Fähigkeit schreiben=new Fähigkeit("Schreiben",wertSchreiben,0,1);
		Fähigkeit grafik=new Fähigkeit("Grafik",wertGrafik,0,1);
		Fähigkeit spezial=new Fähigkeit("Spezial",wertSpezial,0,1);
		
		addFähigkeit(code);
		addFähigkeit(schreiben);
		addFähigkeit(grafik);
		addFähigkeit(spezial);
	}
	
	private void addFähigkeit(Fähigkeit fähigkeit)
	{
		assert !this.fähigkeitenList.contains(fähigkeit);
		this.fähigkeitenList.add(fähigkeit);
	}
	
	public Fähigkeit getFähigkeit(int eintragsnummer)
	{
		assert (eintragsnummer<this.fähigkeitenList.size() && eintragsnummer>=0);
		
		return this.fähigkeitenList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "FähigkeitVerwaltung: " +this.fähigkeitenList.toString();
	}

	
}
