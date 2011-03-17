/**
 * 
 */

/**
 * @author lukas
 *
 */
public interface IFähigkeit {
	public int getWert();

	public void setWert(int wert) ;

	public int getBonusWert();

	public void setBonusWert(int bonusWert);

	public double getZunahmeBeiAuflevelnFaktor();

	public void setZunahmeBeiAuflevelnFaktor(double zunahmeBeiAuflevelnFaktor);

	public String getName();
	
	public void setName(String name); //Für Spezial Fähigkeit
	
	public String toString();

}
