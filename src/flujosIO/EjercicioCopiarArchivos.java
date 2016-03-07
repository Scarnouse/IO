package flujosIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class EjercicioCopiarArchivos {

	public static void main(String[] args) {
		File f = new File("archivos/contactos.csv");
		if(!f.exists()){
			System.out.println("Archivo no encotrado");
			System.exit(1);
		}
		try (FileInputStream fis = new FileInputStream(f);){
			int leer;
			//Random altr = new Random();
			while((leer = fis.read())!=-1){
				//System.out.println(leer);
				/*if (leer%1==0 && leer!=0){
					leer = altr.nextInt(256);
				}*/ // Tonterías de las mías
				char caracter = (char)leer; //parseo del byte (int) como char para poder sacarlo por consola
				System.out.print(caracter);
			}
		} catch (IOException e) {
			System.out.println("Error de lectura");
		}
	}

}
