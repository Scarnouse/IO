package flujosIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerNumerosFichero {

	public static void main(String[] args) {
		File inFile = new File("datosSalida/numeros.bin");
		if(!inFile.exists()){
			System.out.println("Archivo no encontrado");
			System.exit(1);
		}
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));){
			int numeros;
			while(in.available()!=0){
				numeros = in.readInt();
				System.out.println(numeros);
			}
		} catch (IOException e) {
			System.out.println("Excepción");
		}
	}

}
