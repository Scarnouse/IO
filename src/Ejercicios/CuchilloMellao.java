package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CuchilloMellao {

	public static void main(String[] args) {
		if (args.length!=2 && !args[1].matches("[0-9]+") && Integer.parseInt(args[1])==0){
			System.out.println("Error de argumentos");
			System.exit(1);
		}
		int numeroTrozos=Integer.parseInt(args[1]);
		long particion = args[0].length()/numeroTrozos;
		//System.out.println(particion + " "+ numeroTrozos);
		List<FileOutputStream> lista = new ArrayList<FileOutputStream>();

		File file = new File(args[0]);
		for(int i=0; i<numeroTrozos;i++){
			String nombreFichero = "sierra/parte"+i+".bin";
			try {
				lista.add(new FileOutputStream(new File(nombreFichero)));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		try (FileInputStream fileIn =new FileInputStream(file);){
			int byteLeido;
			int contador=0;
			while ((byteLeido=fileIn.read())!=-1){
				//System.out.println((char)byteLeido);
				lista.get((int)(contador/particion)).write(byteLeido);
				lista.get((int)(contador/particion)).flush();
				//contador++;
				if ((int)(contador/particion)<numeroTrozos-1){
					contador++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
				
	}
}
