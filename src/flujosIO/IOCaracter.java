package flujosIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOCaracter {

	public static void main(String[] args) {
		String mensaje = "Enviado a fichero\nNueva Línea";
		File outFile = new File("datosSalida/mensaje.txt");
		try (BufferedWriter outWriter = new BufferedWriter(new FileWriter(outFile));){
			outWriter.write(mensaje);
			outWriter.flush();
		} catch (IOException e) {
			System.out.println("Error");
		}
		try (BufferedReader inReader = new BufferedReader(new FileReader(outFile));){
			String mensajeTerminal;
			while((mensajeTerminal = inReader.readLine())!=null){
				System.out.println(mensajeTerminal);
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		
	}

}
