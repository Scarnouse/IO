package introduccion;

import java.io.File;
import java.io.IOException;

public class ClaseFile {
	public static void main(String[] args) {
		File inFile = new File("archivos/contactos.csv");
		System.out.println(inFile.exists());
		System.out.println(inFile.getAbsolutePath());
		System.out.println(inFile.getFreeSpace());
		System.out.println(inFile.compareTo(new File("archivos/password.txt")));
		System.out.println(inFile.lastModified());
		File f2 = new File("archivos/prueba.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f3 = new File("archivos");
		if (f3.isDirectory()){
			System.out.println("Es un directorio");
			String[] archivosContenidos = f3.list();
			System.out.println(archivosContenidos.length);
			for (String string : archivosContenidos) {
				System.out.println(string);
			}
		}
		
	}
}
