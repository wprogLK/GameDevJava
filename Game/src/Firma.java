import java.util.*;

public class Firma 
{

	private String name;
	private String bossName;
	private int geld;
	private int anzahlAngestellterMitarbeiter;
	private ArrayList<Mitarbeiter> angestellteMitarbeiter;
	
	public Firma(String firmaName, String firmaBossName,int geld) 
	{
		this.name=firmaName;
		this.bossName=firmaBossName;
		this.geld=geld;
	}

	//Getters & Setters:
	
	public String getFirmaName() 
	{
		return this.name;
	}
	
	public String getBossName()
	{
		return this.bossName;
	}
	
	public int getGeld()
	{
		return this.geld;
	}
	
	public int getAnzahlAngestellterMitarbeiter() 
	{
		return angestellteMitarbeiter.size();
	}
	
	/**
	 * Diese Methode ist als "Cheat" gedacht für TestZecke
	 * @param geld
	 */
	public void setGeld(int geld)
	{
		this.geld=geld;
	}
	
	//Addier(/Subtrahier)-Methoden:
	
	public void addGeld(int geld)
	{
		this.geld=this.geld+geld;
	}
	
	public void mitarbeiterEinstellen(Mitarbeiter mitarbeiter)
	{
		angestellteMitarbeiter.add(mitarbeiter);
	}
	
	

	
	
	
	

}
