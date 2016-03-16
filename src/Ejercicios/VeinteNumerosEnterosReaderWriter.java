package Ejercicios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VeinteNumerosEnterosReaderWriter {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("ejercicioFileWriter");){
			for (int i = 250; i <=260; i++) {
				fw.write(i);
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileReader fr = new FileReader("ejercicioFileWriter");){
			int numeros;
			while((numeros=fr.read())!=-1){
				System.out.println(numeros);
				//Este al guardarlos como una cadena y no a nivel de bytes si muestra del 250 al 260
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
