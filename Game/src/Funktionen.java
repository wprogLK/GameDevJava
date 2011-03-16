import java.util.*;
import java.io.*;

/*
 * Diese Klasse beinhaltet alle Funktionen, welche das Spiel braucht. Z.B. einlesen von Dateien.
 */

/**
 * @author lukas
 *
 */
public class Funktionen {

	/**
	 * 
	 */
	private String pfad;
	
	public Funktionen(String pfad) {
		// TODO Auto-generated constructor stub
		this.pfad=pfad;
	}
	
	public ArrayList<ArrayList<String>> leseDatei(String dateiName) throws IOException
	{
			FileReader fr =new FileReader(pfad + dateiName);
			BufferedReader br=new BufferedReader(fr);
			
			ArrayList<ArrayList<String>> output=new ArrayList<ArrayList<String>>();
			
			String teilString;
			teilString=br.readLine();
			
			while ((teilString !=null))
			{
				ArrayList<String> teilArray = new ArrayList<String>();
				String[] tmpString;
				System.out.println("TEILSTRING: " + teilString);
				tmpString=teilString.split(" "); //TODO: ANDERES TRENNZEICHEN NEHMEN!
				
				for (int i=0; i<tmpString.length;i++)
				{
					teilArray.add(tmpString[i]);
				}
				
				output.add(teilArray);
				
				teilString=br.readLine();
				
				
			}
			
			System.out.println("OUTPUT: " +output.toString());
			return output;
	}
	
	

	
}
