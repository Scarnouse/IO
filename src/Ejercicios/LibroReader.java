package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibroReader {
	static List<Libro> coleccion = new ArrayList<Libro>();
	static List<Libro> nuevaColeccion = new ArrayList<Libro>();
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Libros.csv"), "ISO-8859-1"))){
				String elemento = br.readLine();
				while ((elemento=br.readLine())!=null){
					String linea = elemento;
					String[] array = linea.split(";");
					coleccion.add(new Libro(array[0].toString(),array[1].toString(),array[2].toString(),array[5]));
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}	
		try (ObjectOutputStream oouts = new ObjectOutputStream(new FileOutputStream(new File("libros.dat")));){
			oouts.writeObject(getNuevaLista());
			oouts.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream oins = new ObjectInputStream(new FileInputStream("libros.dat"));){
			List<Libro> listaNueva = (List<Libro>) oins.readObject();
			System.out.println(listaNueva);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}

	static public List<Libro> getNuevaLista(){
		Random aleatorio = new Random();
		Libro l;
		while(nuevaColeccion.size()!=10) {
			l = coleccion.get(aleatorio.nextInt(coleccion.size()));
			if (nuevaColeccion.contains(l)) getNuevaLista();			
			else nuevaColeccion.add(l);
		}
		return nuevaColeccion;
	}
}
