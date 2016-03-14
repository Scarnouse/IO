package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploNIO {

	public static void main(String[] args) {
		Path ruta = Paths.get("datosEntrada/numeros.txt");
		System.out.println("Fichero : "+ruta.toString());
		System.out.println("Raiz : "+ruta.getRoot());
		System.out.println("Padre : "+ruta.getParent());
		for (int i = 0; i < ruta.getNameCount(); i++) {
			System.out.println(i+1 + " : " +ruta.getName(i));
		}
		// copiamos el archivo
		Path out = Paths.get("datosEntrada/19A.jpg");
		Path target = Paths.get("datosSalida/19A.jpg");
		try {
			Files.copy(out, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}