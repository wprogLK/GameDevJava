import java.util.ArrayList;

/**
 * Die einzelnen Fähigkeiten werden hier zentral generiert, gesammelt, gespeichert und geändert
 */

/**
 * @author lukas
 *
 */
public class FähigkeitenVerwaltung {
	
	private ArrayList<IFähigkeit> fähigkeitenList;
	
	public FähigkeitenVerwaltung(int wertCode, int wertSchreiben, int wertGrafik, int wertSpezial)
	{
		this.fähigkeitenList=new ArrayList<IFähigkeit>();
		
		this.erstelleAlleFähigkeiten(wertCode, wertSchreiben, wertGrafik, wertSpezial); //TODO: AB HIER NOCH DONNERSTAG (ENERGIE UND KREATIVITÄT EINFÜGEN)
	}
	
	private void erstelleAlleFähigkeiten(int wertCode, int wertSchreiben, int wertGrafik, int wertSpezial, int wertEnergie, int energieMAXWert,int energieAbnahmeProZeiFaktor, int energieZunahmeProZeitFaktor,int wertKreativität, int kreativitätMAXWert, int kreativitätAbnahmeProZeiFaktor, int kreativitätZunahmeProZeitFaktor)
	{															
		Fähigkeit code=new Fähigkeit("Code",wertCode,0,1);
		Fähigkeit schreiben=new Fähigkeit("Schreiben",wertSchreiben,0,1);
		Fähigkeit grafik=new Fähigkeit("Grafik",wertGrafik,0,1);
		Fähigkeit spezial=new Fähigkeit("Spezial",wertSpezial,0,1);
		EnergieKreativität energie=new EnergieKreativität("Energie",wertEnergie,energieMAXWert, energieAbnahmeProZeiFaktor, energieZunahmeProZeitFaktor);
		EnergieKreativität kreativität=new EnergieKreativität("Kreativität",wertKreativität,kreativitätMAXWert, kreativitätAbnahmeProZeiFaktor, kreativitätZunahmeProZeitFaktor);
		
		
		addFähigkeit(code);
		addFähigkeit(schreiben);
		addFähigkeit(grafik);
		addFähigkeit(spezial);
		addFähigkeit(energie);
		addFähigkeit(kreativität);
	}
	
	private void addFähigkeit(Fähigkeit fähigkeit)
	{
		assert !this.fähigkeitenList.contains(fähigkeit);
		this.fähigkeitenList.add(fähigkeit);
	}
	
	public IFähigkeit getFähigkeit(int eintragsnummer)
	{
		assert (eintragsnummer<this.fähigkeitenList.size() && eintragsnummer>=0);
		
		return this.fähigkeitenList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "FähigkeitVerwaltung: " +this.fähigkeitenList.toString();
	}

	
}
