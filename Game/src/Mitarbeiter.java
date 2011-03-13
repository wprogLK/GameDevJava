//String Vorname, String Nachname,Geschlecht Geschlecht,String Beschreibung,Aussehen Aussehen,Boolean istFreierMitarbeiter,Boolean istEingestellt,Job Job, int GrundLohn,Eigenschaft Eigenschaft,Fähigkeiten Fähigkeiten(int Code, int Schreiben,int Grafik,int Spezial),int MaxEnergie, int MaxKreativitaet)
public class Mitarbeiter 
{
	private String vorname;
	private String nachname;
	private Geschlecht geschlecht;
	private String beschreibung;
	private Aussehen aussehen;
	private Boolean istFreierMitarbeiter;
	private Boolean istAngestellterMitarbeiter;
	private Job job;
	private int grundLohn;
	private MitarbeiterEigenschaft mitarbeiterEigenschaft;
	private Fähigkeiten fähigkeiten;
	private int maxEnergie;
	private int maxKreativität;
	
	
	public Mitarbeiter(String vorname, String nachname, Geschlecht geschlecht, String beschreibung, Aussehen aussehen, Boolean istFreierMitarbeiter, Boolean istAngestellterMitarbeiter, Job job, int grundLohn, MitarbeiterEigenschaft mitarbeiterEigenschaft, Fähigkeiten fähigkeiten,int maxEnergie, int maxKreativität)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
		this.beschreibung = beschreibung;
		this.aussehen = aussehen;
		this.istFreierMitarbeiter = istFreierMitarbeiter;
		this.istAngestellterMitarbeiter = istAngestellterMitarbeiter;
		this.job = job;
		this.grundLohn = grundLohn;
		this.mitarbeiterEigenschaft = mitarbeiterEigenschaft;
		this.fähigkeiten = fähigkeiten;
		this.maxEnergie = maxEnergie;
		this.maxKreativität = maxKreativität;
	}
	//GETTERS & SETTERS:
	
	public String getVorname() {
		return vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public Geschlecht getGeschlecht() {
		return geschlecht;
	}


	public String getBeschreibung() {
		return beschreibung;
	}


	public Aussehen getAussehen() {
		return aussehen;
	}


	public Boolean getIstFreierMitarbeiter() {
		return istFreierMitarbeiter;
	}


	public Boolean getIstAngestellterMitarbeiter() {
		return istAngestellterMitarbeiter;
	}


	public Job getJob() {
		return job;
	}


	public int getGrundLohn() {
		return grundLohn;
	}


	public MitarbeiterEigenschaft getMitarbeiterEigenschaft() {
		return mitarbeiterEigenschaft;
	}


	public Fähigkeiten getFähigkeiten() {
		return fähigkeiten;
	}


	public int getMaxEnergie() {
		return maxEnergie;
	}


	public int getMaxKreativität() {
		return maxKreativität;
	}


	public void setIstFreierMitarbeiter(Boolean istFreierMitarbeiter) {
		this.istFreierMitarbeiter = istFreierMitarbeiter;
	}


	public void setIstAngestellterMitarbeiter(Boolean istAngestellterMitarbeiter) {
		this.istAngestellterMitarbeiter = istAngestellterMitarbeiter;
	}


	public void setJob(Job job) {
		this.job = job;
	}


	public void setGrundLohn(int grundLohn) {
		this.grundLohn = grundLohn;
	}


	public void setMitarbeiterEigenschaft(MitarbeiterEigenschaft mitarbeiterEigenschaft) {
		this.mitarbeiterEigenschaft = mitarbeiterEigenschaft;
	}


	public void setFähigkeiten(Fähigkeiten fähigkeiten) {
		this.fähigkeiten = fähigkeiten;
	}


	public void setMaxEnergie(int maxEnergie) {
		this.maxEnergie = maxEnergie;
	}


	public void setMaxKreativität(int maxKreativität) {
		this.maxKreativität = maxKreativität;
	}
	
	
	
	public void mitarbeiterEinstellen()
	{
		//TODO
	}
	
	public void mitarbeiterFeuern()
	{
		//TODO
	}


	

	
	
	
	


	
	


}
