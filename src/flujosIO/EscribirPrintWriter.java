package flujosIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirPrintWriter {

	public static void main(String[] args) {
		String cadena = "Esta es una cadena";
		int numero = 5;
		double decimal = 12.55;
		boolean logico = false;
		System.out.printf("%s %d %.2f %b\n",cadena, numero, decimal,logico);
			try (PrintWriter out = new PrintWriter(new File("datosSalida/fichero.txt"));) {
				out.printf("%s %d %.2f %b\n",cadena, numero, decimal,logico);
				out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
