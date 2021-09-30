package lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_fichero {

	public static void main(String[] args) {
		leer();
		leer2();
	}
	
	private static void leer() {
		FileReader fr = null;
		System.out.println("Test de fichero carácter a carácter");
		try {
			int element = 0;
			fr = new FileReader("test.txt");
			while((element = fr.read()) != -1) {
				System.out.println((char) element);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error in the file");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println("Error closing file");
			}
		}
	}
	
	private static void leer2() {
		BufferedReader br = null;
		System.out.println("Test de fichero línea a línea");		
		try {
			String line = "";
			br = new BufferedReader(new FileReader("test.txt"));
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error in the file");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error closing file");
			}
		}
	}

}
