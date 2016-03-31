package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sierra {

	public static void main(String[] args) {
		File file = new File("geografia.csv");
		File outFile1 = new File("sierra/trozo1");
		File outFile2 = new File("sierra/trozo2");
		File outFile3 = new File("sierra/trozo3");
		long dimension = file.length();
		long particion = dimension/3;
		try (FileInputStream fins = new FileInputStream(file);
				FileOutputStream fout1 = new FileOutputStream(outFile1);
				FileOutputStream fout2 = new FileOutputStream(outFile2);
				FileOutputStream fout3 = new FileOutputStream(outFile3)) {
			int byteLeido;
			while((byteLeido=fins.read())!=-1){
				//System.out.print((char)byteLeido); //comprobando la lectura
				int contador = 0;
				if(contador<particion){
					fout1.write(byteLeido);
					fout1.flush();
				} else if (contador>=particion && contador<=particion*2){
					fout2.write(byteLeido);
					fout2.flush();
				} else {
					fout3.write(byteLeido);
					fout3.flush();
				}
				contador++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
