package ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
	public static void main(String[] args) {
	
		try {
			FileReader fichero = new FileReader("nombre del fichero");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
