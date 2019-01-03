package Practice;

import java.io.File;

public class UtilityMethod {
	
public static boolean fileExists(String strfilepath) {
		
		File strfile = new File(strfilepath);
		
		boolean blnfileExists = strfile.exists();
		
		return blnfileExists;	
		
	}

}
