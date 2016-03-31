package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pegamento {

	public static void main(String[] args) {
		File inFile1 = new File("sierra/trozo1");
		File inFile2 = new File("sierra/trozo2");
		File inFile3 = new File("sierra/trozo3");
		File file = new File("sierra/pegamento");
		try (FileInputStream fins1 = new FileInputStream(inFile1);
				FileInputStream fins2 = new FileInputStream(inFile2);
				FileInputStream fins3 = new FileInputStream(inFile3);
				FileOutputStream fouts = new FileOutputStream(file)){
			int byteLeido;
			while ((byteLeido=fins1.read())!=-1){
				fouts.write(byteLeido);
				fouts.flush();
			}
			while ((byteLeido=fins2.read())!=-1){
				fouts.write(byteLeido);
				fouts.flush();
			}
			while ((byteLeido=fins3.read())!=-1){
				fouts.write(byteLeido);
				fouts.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
