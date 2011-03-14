/**
 * 
 */

/**
 * @author lukas
 *
 */
public class MitarbeiterEigenschaft {

	private String name;
	private String proText;
	private String contraText;
	
	//TODO: Noch auswirkungen einbinden
	/**
	 * 
	 */
	public MitarbeiterEigenschaft(String name, String proText, String contraText) 
	{
		this.name=name;
		this.proText=proText;
		this.contraText=contraText;
	}

	
	//Getters & (Setters):

	public String getName() {
		return name;
	}


	public String getProText() {
		return proText;
	}


	public String getContraText() {
		return contraText;
	}


	@Override
	public String toString() {
		return "MitarbeiterEigenschaft [contraText=" + contraText + ", name=" + name + ", proText=" + proText + "]";
	}


	
	


}
