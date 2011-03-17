/*
 * Für Kreativität und Energie jedes Mitarbeiers.
 * Ähnlich zu Klasse Fähigkeit 
 */
public class EnergieKreativität extends Fähigkeit implements IFähigkeit{

	private double abnahmeProZeitFaktor;
	private double zunahmeProZeitFaktor;
	private int MAXWert;
	private static int bonusWert;
	
	public EnergieKreativität(String name,int wert,int MAXWert,double abnahmeProZeitFaktor, double zunahmeProZeitFaktor) {
		// TODO Auto-generated constructor stub
		super(name, wert, MAXWert, zunahmeProZeitFaktor); //TODO: Muss das so sein???
		this.abnahmeProZeitFaktor=abnahmeProZeitFaktor;
		this.abnahmeProZeitFaktor=abnahmeProZeitFaktor;
		this.MAXWert=MAXWert;
	}

	//Getters & Setters:
	
	public double getAbnahmeProZeiFaktor()
	{ 
		return this.abnahmeProZeitFaktor;
	}
	
	public double getZunahmeProZeitFaktor()
	{
		return this.zunahmeProZeitFaktor;
	}
	
	public int getMAXWert()
	{
		return this.MAXWert;
	}
	
	public boolean istWertNull()
	{
		return this.MAXWert<=0;
	}
	
	public void wertAbnahme()
	{
		super.setWert(super.getWert()-this.abnahmeProZeitFaktor); //TODO: Anders berechnen....
	}
	
	public void wertZunahme()
	{
		 super.setWert(super.getWert()+this.zunahmeProZeitFaktor); //TODO: Anders berechnen....
	}
	
	@Override
	public String toString() {
		return "EnergieKreativität [MAXWert=" + MAXWert
				+ ", abnahmeProZeitFaktor=" + abnahmeProZeitFaktor
				+ ", zunahmeProZeitFaktor=" + zunahmeProZeitFaktor
				+ ", getAbnahmeroZeiFaktor()=" + getAbnahmeProZeiFaktor()
				+ ", getMAXWert()=" + getMAXWert()
				+ ", getZunahmeZeitFaktor()=" + getZunahmeProZeitFaktor()
				+ ", istWertNull()=" + istWertNull() + ", getBonusWert()="
				+ getBonusWert() + ", getName()=" + getName() + ", getWert()="
				+ getWert() + ", getZunahmeBeiaufevelnFaktor()="
				+ getZunahmeBeiAuflevelnFaktor() +"]";
	}

}