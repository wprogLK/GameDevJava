import java.util.ArrayList;

/**
 * Die einzelnen Jobs werden hier zentral generiert, gesammelt, gespeichert und nötigenfalls geändert
 */
public class JobVerwaltung {

	private ArrayList<Job> jobList;
	
	public JobVerwaltung() {
		ArrayList<Job> jobList=new ArrayList<Job>();
		
	}
	
	private void erstelleAlleJobs()
	{
		//Im Moment werden die Jobs noch von Hand erstellt. Später soll dies durch eine vorgefertigte Datei geschehen, welche alle Daten beinhaltet, welche dann eingelesen wird.
		
		Job jobProgrammierer=new Job("Programmierer");
		addJob(jobProgrammierer);
	}
	
	private void addJob(Job job)
	{
		this.jobList.add(job);
	}
	
	public Job getJob(int eintragsnummer)
	{
		assert (eintragsnummer<this.jobList.size() && eintragsnummer>=0);
		
		return this.jobList.get(eintragsnummer);
	}
	
	public String toString()
	{
		return "JobVerwaltung: " +this.jobList.toString();
	}

}
