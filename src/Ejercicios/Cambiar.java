package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cambiar {

	public static void main(String[] args) {
		File fileIn = new File(args[0]);
		File fileOut = new File(args[1]);
		if(args.length==3&&!(args[2].matches(".*\\d.*"))){
			try (Scanner scanner = new Scanner(fileIn);PrintWriter pWriter = new PrintWriter(fileOut)){
				String palabra;
				int contadorPalabrasSustituidas = 0;
				int contadorPalabrasTotales = 0;
				while(scanner.hasNext()){
					palabra = scanner.next();
					if(palabra.equals(args[2])){
						palabra = palabra.toUpperCase();
						contadorPalabrasSustituidas ++;
					}
					contadorPalabrasTotales ++;
					pWriter.write(palabra+"\n");
				}
				pWriter.write("\nHan sido convertidas a mayúsculas "+contadorPalabrasSustituidas+" palabras de un total de "+contadorPalabrasTotales+".");
			} catch (FileNotFoundException e) {
				System.out.println("Archivo no encontrado");
				e.printStackTrace();
			}
		} else {
			System.out.println("Error al introducir argumentos");
		}
	}
}
