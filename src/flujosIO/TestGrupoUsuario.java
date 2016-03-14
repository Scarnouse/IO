package flujosIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestGrupoUsuario {

	public static void main(String[] args) {
		GrupoUsuarios gu = new GrupoUsuarios("amigos");
		Usuario u = new Usuario("joaquín cortés", 29);
		Usuario u1 = new Usuario("venceslao rodriguez", 45);
		Usuario u2 = new Usuario("manolo molino", 41);
		Usuario u3 = new Usuario("elvira lindo", 12);
		Usuario u4 = new Usuario("juanita calamidad", 56);
		Usuario u5 = new Usuario("septiembre", 7);
		Usuario u6 = new Usuario("Kira Miró", 41);
		gu.addUsuario(u);
		gu.addUsuario(u1);
		gu.addUsuario(u2);
		gu.addUsuario(u3);
		gu.addUsuario(u4);
		gu.addUsuario(u5);
		gu.addUsuario(u6);
		System.out.println(gu);
		File f = new File("datosSalida/usuarios.bin");
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));){
			oos.writeObject(gu);
			oos.flush();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Tamaño del fichero: "+f.length());
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));){
			GrupoUsuarios nuevoGu = (GrupoUsuarios)ois.readObject();
			System.out.println(nuevoGu);
		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}

}
