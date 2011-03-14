
public class Fähigkeit {

	private String name;
	private int wert;
	private int bonusWert;
	private int zunahmeBeiaufLevelnFaktor;
	
	public Fähigkeit(String name,int wert, int bonusWert,int zunahmeBeiaufLevelnFaktor) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.wert=wert;
		this.bonusWert=bonusWert;
		this.zunahmeBeiaufLevelnFaktor=zunahmeBeiaufLevelnFaktor;
	}

	//Getters & Setters:
	
	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

	public int getBonusWert() {
		return bonusWert;
	}

	public void setBonusWert(int bonusWert) {
		this.bonusWert = bonusWert;
	}

	public int getZunahmeBeiaufLevelnFaktor() {
		return zunahmeBeiaufLevelnFaktor;
	}

	public void setZunahmeBeiaufLevelnFaktor(int zunahmeBeiaufLevelnFaktor) {
		this.zunahmeBeiaufLevelnFaktor = zunahmeBeiaufLevelnFaktor;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) //Für Spezial Fähigkeit
	{
		this.name=name;
	}
	
	
	
	public String toString()
	{
		return "Fähigkeit: " + this.name + " Wert: " +Integer.toString(this.wert)+" Bonuswert: " + Integer.toString(this.bonusWert) + " zunahmeBeiaufLevelnFaktor: " + Integer.toString(this.zunahmeBeiaufLevelnFaktor);
	}

}