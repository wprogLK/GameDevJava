
public class Fähigkeit implements IFähigkeit{

	private String name;
	private int wert;
	private int bonusWert;
	private double zunahmeBeiAuflevelnFaktor;
	
	public Fähigkeit(String name,int wert, int bonusWert,double zunahmeBeiAuflevelnFaktor)  {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.wert=wert;
		this.bonusWert=bonusWert;
		this.zunahmeBeiAuflevelnFaktor=zunahmeBeiAuflevelnFaktor;
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

	public double getZunahmeBeiAuflevelnFaktor() {
		return zunahmeBeiAuflevelnFaktor;
	}

	public void setZunahmeBeiAuflevelnFaktor(double zunahmeBeiAuflevelnFaktor) {
		this.zunahmeBeiAuflevelnFaktor = zunahmeBeiAuflevelnFaktor;
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
		return "Fähigkeit: " + this.name + " Wert: " +Integer.toString(this.wert)+" Bonuswert: " + Integer.toString(this.bonusWert) + " zunahmeBeiAuflevelnFaktor: " + Double.toString(this.zunahmeBeiAuflevelnFaktor);
	}

}