package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibroReader {
	static List<Libro> coleccion = new ArrayList<Libro>();
	static List<Libro> nuevaColeccion = new ArrayList<Libro>();
public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("Libros.csv"));){
			String elemento = br.readLine();
			while ((elemento=br.readLine())!=null){
				String linea = elemento;
				String[] array = linea.split(";");
				coleccion.add(new Libro(array[0].toString(),array[1].toString(),array[2].toString(),array[5]));
			}
			System.out.println(getNuevaLista());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	static public List<Libro> getNuevaLista(){
		Random aleatorio = new Random();
		Libro l;
		for (int i = 0; i < 10; i++) {
			l = coleccion.get(aleatorio.nextInt(coleccion.size()+1));
			if (nuevaColeccion.contains(l)) getNuevaLista();
			else nuevaColeccion.add(l);
		}
		return nuevaColeccion;
	}
}
