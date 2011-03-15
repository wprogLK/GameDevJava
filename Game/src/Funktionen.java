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
	public Funktionen() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<ArrayList<String>> leseDatei(String dateiName) throws IOException
	{
			FileReader fr =new FileReader(dateiName);
			BufferedReader br=new BufferedReader(fr);
			
			ArrayList<ArrayList<String>> output=new ArrayList<ArrayList<String>>();
			
			
			while ((br.readLine() != null))
			{
				ArrayList<String> teilArray = new ArrayList<String>();
				String teilString;
				
				teilString=br.readLine();
				String[] tmpString;
				
				tmpString=teilString.split(" "); //TODO: ANDERES TRENNZEICHEN NEHMEN!
				
				for (int i=0; i<tmpString.length;i++)
				{
					teilArray.add(tmpString[i]);
				}
				
				output.add(teilArray);
				
			}
			
			System.out.println("OUTPUT: " +output.toString());
			return output;
	}
	
	

	
}
