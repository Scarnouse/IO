package flujosIO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorio {

	public static void main(String[] args) {
		try (RandomAccessFile raFile = new RandomAccessFile(new File("datosSalida/accesoAleatorio.bin"), "rw");) {
			raFile.writeDouble(20);
			raFile.writeInt(15);
			System.out.println("Tamaño fichero :"+raFile.length());
			raFile.seek(0);
			//System.out.println(raFile.readByte());
			//raFile.seek(0);
			System.out.println(raFile.readDouble());
			raFile.skipBytes(4);
			System.out.println(raFile.getFilePointer());
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
