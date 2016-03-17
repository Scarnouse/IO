package Ejercicios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerLocalidad {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("geografia.csv"));){
			String cadena = "";
			String[] array = new String[7];
			List<Localidad> lista = new ArrayList<Localidad>();
			Localidad l = null;
			while (sc.hasNextLine()){
				cadena = sc.nextLine();
				array = cadena.split(",");
				l = new Localidad(array[0].toString(),array[1].toString(),array[2].toString(),array[3].toString(),array[4].toString(),array[5].toString(),array[6].toString());
				lista.add(l);
			}
			ObjectOutputStream oouts = new ObjectOutputStream(new FileOutputStream(new File("nuevaGeografia.bin")));
			oouts.writeObject(lista);
			System.out.println(l.localizar("PABELLON"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
