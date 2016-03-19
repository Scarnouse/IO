package Ejercicios;

import java.util.Scanner;

public class TestAnagrama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce dos palabras: ");
		PosibleAnagrama pAnagram = new PosibleAnagrama(scanner.next(), scanner.next());
	}

}
