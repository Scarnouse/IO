package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Parse {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduce URL:");
			String urlUsuario = scanner.next();
			URL url = new URL(urlUsuario);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			int contador = 0;
			while((line=bReader.readLine())!=null){
				//System.out.println(line);
				if(line.contains("h1")){
					contador ++;
				}
			}
			System.out.println("La URL indicada posee "+contador+" tag h1");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
