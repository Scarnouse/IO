package Ejercicios;

import java.util.Scanner;

public class TestPassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca contraseña: ");
		PosiblePassword pPass = new PosiblePassword(scanner.next());
		scanner.close();
	}

}
