import java.util.ArrayList;


//Verwaltet alle EingeschaftenTypen in einer ListArray
//Neue EigenschaftTypen können mit addNeueEigenschaft() der ListArray hinzugefügt werden.
//EigenschaftTyp wird über getEigenschaft(NR) aufgerufen
public class MitarbeiterEigenschaftenVerwaltung {

	private ArrayList<MitarbeiterEigenschaft> eingeschaftList;
	
	public MitarbeiterEigenschaftenVerwaltung() {
		this.eingeschaftList=new ArrayList<MitarbeiterEigenschaft>();
		
		this.erstelleAlleEigenschaften();
		
	}
	
	private void erstelleAlleEigenschaften()
	{
		//Im Moment werden die Eigenschaften noch von Hand erstellt. Später soll dies durch eine vorgefertigte Datei geschehen, welche alle Daten beinhaltet, welche dann eingelesen wird.
		
		MitarbeiterEigenschaft eigenschaft1=new MitarbeiterEigenschaft("Ehrgeizig","Ist doppelt so effizient wie normale Mitarbeiter und hat 5 Kreativitätspunkte mehr.", "Ist doppelt so schnell erschöpft."); //TODO: Auswirkungen noch machen...
		addEigenschaft(eigenschaft1);
	}
	
	private void addEigenschaft(MitarbeiterEigenschaft eigenschaft)
	{
		assert !this.eingeschaftList.contains(eigenschaft);
		this.eingeschaftList.add(eigenschaft);
	}
	
	public MitarbeiterEigenschaft getEigenschaft(int eintragsnummer)
	{
		assert (eintragsnummer<this.eingeschaftList.size() && eintragsnummer>=0);
		
		return this.eingeschaftList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "MitarbeiterEigenschaftVerwaltung: " +this.eingeschaftList.toString();
	}

}
