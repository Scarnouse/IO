package introduccion;

import java.io.File;
import java.util.Scanner;

public class ListadoRecursivoDirectorio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la ruta absulta del directorio");
		String directorio = sc.next();
		File f = new File(directorio);
		if(f.exists()){
			if (!f.isDirectory()){
				System.out.println("No es un directorio");
			} else {
				listarFicheros(f);
			}
		} else {
			 System.out.println("El directorio no existe");
		}
		sc.close();
	}
	//vamos a tener recursividad en caso de que aparezca un nuevo directorio
	//volvemos a llamar al método.
	public static void listarFicheros(File directorio){
		File[] arrayDirectorio = directorio.listFiles();
		for (File file : arrayDirectorio) {
			if(file.isFile()){
				System.out.println(file.getAbsolutePath());
			} else {
				listarFicheros(file);
			}
		}
	}
}
