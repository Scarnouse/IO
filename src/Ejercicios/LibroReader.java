package Ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LibroReader {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("libros.csv");){
			int elemento;
			StringBuilder sb = new StringBuilder();
			String[] array = new String[10];
			List<Libro> coleccion = new ArrayList<Libro>();
			while ((elemento=fr.read())!=-1){
				sb.append((char)elemento);
				//la pauta de la "," no vale.
				array = sb.toString().split(",");
				//Libro l = new Libro(array[0].toString(),array[3].toString(),array[6].toString());
				//coleccion.add(l);					
			}

		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
