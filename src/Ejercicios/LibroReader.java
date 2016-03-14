package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LibroReader {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("Libros.csv"));){
			String elemento;
			List<Libro> coleccion = new ArrayList<Libro>();
			while ((elemento=br.readLine())!=null){
				String linea = elemento;
				String[] array = linea.split(";");
				coleccion.add(new Libro(array[0].toString(),array[1].toString(),array[2].toString(),array[5]));					
			}
			System.out.println(coleccion);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
