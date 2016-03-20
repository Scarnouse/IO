package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AveriguarPalabra {
	public static void main(String[] args) {
		File file = new File("listado-general.txt");
		List<String> listaPalabras = new ArrayList<String>();
		Random aleatorio = new Random();
		try (Scanner scanner = new Scanner(file);){
			while(scanner.hasNext()){
				listaPalabras.add(scanner.next());
			}
			String palabraAlmacenada = listaPalabras.get(aleatorio.nextInt(listaPalabras.size()));
			String palabraCifrada = palabraAlmacenada.replaceAll("[a-záéíóú]", "*");
			char[] arrayChar = palabraCifrada.toCharArray();
			int contador = 0;
			System.out.println("Juego del ahorcado.\nLas vocáles acentuadas han de ser introducidas con su conrrespondiente tilde.");
			while(!palabraCifrada.equals(palabraAlmacenada)){
				System.out.println(palabraCifrada);
				Scanner letra = new Scanner(System.in);
				System.out.println("Introduce una letra: ");
				String letraIntroducida = letra.next();
				if (letraIntroducida.length()>1){
					System.out.println("Introduce una sola letra");
				}
				String palabraSustituta = "";
				for (int i = 0; i < palabraAlmacenada.length(); i++) {
					if (palabraAlmacenada.charAt(i)==letraIntroducida.charAt(0)){
						arrayChar[i] = palabraAlmacenada.charAt(i);
					}
				}
				for (int i = 0; i < arrayChar.length; i++) {
					palabraSustituta += arrayChar[i];
				}
				palabraCifrada = palabraSustituta;
				contador ++;
			}
			System.out.println(palabraCifrada);
			System.out.println("Fin de la partida.\nHas necesitado "+contador+" intentos.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
