package Ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibroReader {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("libros.csv");){
			int elemento;
			StringBuilder sb = new StringBuilder();
			String[] array = new String[10];
			List<Libro> coleccion = new ArrayList<Libro>();
			Libro l = null;
			while ((elemento=fr.read())!=-1){
				sb.append((char)elemento);
				array = sb.toString().split(",");
				l = new Libro(array[0].toString(),array[3].toString(),array[6].toString().substring(5));
				coleccion.add(l);
				}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
