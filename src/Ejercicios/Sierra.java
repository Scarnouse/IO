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
			try (FileInputStream fins = new FileInputStream(file);) {
				int partes = 0;
				if (args[1].matches("[0-9]+")){
					partes = Integer.parseInt(args[1]);
				} else {
					System.out.println("Segundo argumento no numérico");
					System.exit(1);
				}
				for (int i = 0; i < partes; i++) {
					FileOutputStream fouts = new FileOutputStream("sierra/parte"+i+".bin");

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
