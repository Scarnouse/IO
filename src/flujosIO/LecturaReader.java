package flujosIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaReader {

	public static void main(String[] args) {
		int caracter;
		try (FileReader inFile = new FileReader(new File("datosEntrada/sintitulo.txt"));){
			while((caracter=inFile.read())!=-1){
				System.out.print((char)caracter);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
