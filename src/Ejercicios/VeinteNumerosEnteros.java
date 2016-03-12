package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VeinteNumerosEnteros {

	public static void main(String[] args) {
		try (FileOutputStream fouts = new FileOutputStream("ejercicioFileOutputStream.txt");){
			for (int i = 250; i <=260; i++) {
				fouts.write(i);
				fouts.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (DataOutputStream douts = new DataOutputStream(new FileOutputStream("ejercicioDataOutputStream.txt"));){
			for (int i = 20; i <=40; i++) {
				douts.writeInt(i);
				douts.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// En ambos casos se trata de archivos de bits.
		try (FileInputStream fins = new FileInputStream("ejercicioFileOutputStream.txt");){
			int numeros;
			while((numeros=fins.read())!=-1){
				System.out.println((int)numeros);
				//creo que al introducir sólo bytes no puede pasar del valor 255
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (DataInputStream dins = new DataInputStream(new FileInputStream("ejercicioDataOutputStream.txt"));){
			while (dins.available()!=0){
				int numeros = dins.readInt();
				System.out.println(numeros);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
