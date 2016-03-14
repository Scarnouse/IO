package flujosIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerConCharset {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("datosEntrada/ficheroiso885915.txt"),"UTF-8");){
			while(sc.hasNext()){
				String palabra = sc.next();
				String patron = "palabra leida %s%n";
				String resultado = String.format(patron, palabra);
				System.out.print(resultado);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
