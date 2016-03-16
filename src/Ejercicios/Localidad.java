package Ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Localidad implements Serializable{
	//atributos
	private String id;
	private String latitude;
	private String longitude;
	private String elevation;
	private String name;
	private String url;
	private String year;
	//constructor
	public Localidad(String id, String latitude, String longitude, String elevation, String name, String url,
			String year) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.name = name;
		this.url = url;
		this.year = year;
	}

	//métodos
	public String localizar(String nombre){
		String cadena = "";
		try (ObjectInputStream oins = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("nuevaGeografia.bin"))));){
			Localidad l;
			try {
				while((l=(Localidad) oins.readObject())!=null){
					
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;
	}
	//toString
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", elevation="
				+ elevation + ", name=" + name + ", url=" + url + ", year=" + year + "]";
	}
	
	
}
