package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sierra {

	public static void main(String[] args) {
		if (args.length==2){
			File file = new File(args[0]);
			long dimension = (int)file.length();
			try (FileInputStream fins = new FileInputStream(file);) {
				if (args[1].matches("[0-9]+")){
					int partes = Integer.parseInt(args[1]);
					long particion = dimension/Integer.parseInt(args[1]);
					int contador = 0;
					for (int i = 0; i < dimension; i++) {
						FileOutputStream fouts = new FileOutputStream("sierra/archivo"+contador+".bin");
						for (int j = 0; j < particion; j++) {
							
						}
						contador++;
					}					
				} else {
					System.out.println("Argumento no numerico");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else {
			System.out.println("Número de argumentos inválido");
		}
	}

}
