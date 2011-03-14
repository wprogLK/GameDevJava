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
	
	public FähigkeitenVerwaltung(int wertCode, int bonusWertCode,int zunahmeBeiaufLevelnFaktorCode,int wertSchreiben, int bonusWertSchreiben,int zunahmeBeiaufLevelnFaktorSchreiben,int wertGrafik, int bonusWertGrafik,int zunahmeBeiaufLevelnFaktorGrafik,int wertSpezial, int bonusWertSpezial,int zunahmeBeiaufLevelnFaktorSpezial)
	{
		
		//TODO: HIER MORGEN WEITER MACHEN
		ArrayList<Fähigkeit> fähigkeitenList=new ArrayList<Fähigkeit>();
		
		this.erstelleAlleFähigkeiten();
	}
	
	private void erstelleAlleFähigkeiten()
	{															
		Fähigkeit code=new Fähigkeit("Code",0,0,1);
		Fähigkeit schreiben=new Fähigkeit("Schreiben",0,0,1);
		Fähigkeit grafik=new Fähigkeit("Grafik",0,0,1);
		Fähigkeit spezial=new Fähigkeit("Spezial",0,0,1);
		
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
