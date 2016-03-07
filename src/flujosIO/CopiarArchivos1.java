package flujosIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArchivos1 {

	public static void main(String[] args) {
		// Entrada de un fichero a copiar
		File inFile = new File("datosEntrada/19A.jpg");
		if (!inFile.exists()){
			System.out.println("El fichero "+ inFile +" no existe");
			System.exit(1);
		}
		// Fichero de salida
		File outFile = new File("datosSalida/19Acopia.jpg");
		try (FileInputStream fis = new FileInputStream(inFile);FileOutputStream fos = new FileOutputStream(outFile);){
			int byteLeido;
			int contadorBytes= 0;
			long inicio = System.currentTimeMillis();
			// OJO a la hora del while (¬¬u)
			while ((byteLeido = fis.read())!=-1){
				System.out.println(byteLeido);
				contadorBytes++;
				//if (contadorBytes%10000 == 0 && contadorBytes!=0) fos.write(10); Distorsionador de imágenes
				fos.write(byteLeido);
			}
			long fin = System.currentTimeMillis();
			System.out.println("Fichero de tamaño "+inFile.length()+" bytes");
			System.out.println("Contador de bytes "+contadorBytes);
			System.out.println("Duración: " + (fin-inicio) + " mls");
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
		}
	}

}
