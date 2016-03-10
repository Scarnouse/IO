package flujosIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerUTF {

	public static void main(String[] args) {
		File inFile = new File("datosSalida/utf.bin");
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));){
			String texto;
			while(in.available()!=0){
				texto = in.readUTF();
				System.out.println(texto);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
