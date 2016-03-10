import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class EscribirUTF {

	public static void main(String[] args) {
		File outFile = new File("datosSalida/utf.bin");
		Random aleatorio = new Random();
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));){
			for(int i=0; i<100;i++){
				int numero = aleatorio.nextInt(1000000);
				out.writeUTF(numero+"");
			}
		} catch (IOException e) {
			System.out.println("Error");
		}

	}

}
