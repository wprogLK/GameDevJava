
public class Zeit {

	private int tage;
	private int wochen;
	private int monate;
	private int jahre;
	private ZeitGeschwindigkeit zeitGeschwindigkeitNormal;
	private ZeitGeschwindigkeit zeitGeschwindigkeitSchnell;
	private ZeitGeschwindigkeit zeitGeschwindigkeitSehrSchnell;
	private ZeitGeschwindigkeit aktuelleZeitGeschwindigkeit;
	
	public Zeit()
	{
		this.tage=0;
		this.wochen=0;
		this.monate=0;
		this.jahre=0;
		
		zeitGeschwindigkeitNormal=new ZeitGeschwindigkeit("Normal",1);
		zeitGeschwindigkeitSchnell=new ZeitGeschwindigkeit("Schnell", 2);
		zeitGeschwindigkeitSehrSchnell=new ZeitGeschwindigkeit("Sehr Schnell",3);
	}
	

	
	
	public void setTime(int tage, int wochen, int monate, int jahre)
	{
		this.tage=tage;
		this.wochen=wochen;
		this.monate=monate;
		this.jahre=jahre;
	}
	
	public void setZeitGeschwindigkeit(ZeitGeschwindigkeit zeitGeschwindigkeit)
	{
		this.aktuelleZeitGeschwindigkeit=zeitGeschwindigkeit;
	}
	
	public String toString()
	{
		return (Integer.toString(tage)+ " Tage, "+ Integer.toString(wochen) +" Wochen, " +Integer.toString(monate) + " Monate, " +Integer.toString(jahre) +" Jahre");
	}
	

}
