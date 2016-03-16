package Ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	
	//getter
	public String getName(){
		return this.name;
	}
	public String getLatitude(){
		return this.latitude;
	}
	public String getLongitude(){
		return this.longitude;
	}

	//métodos
	public String localizar(String nombre){
		String cadena = "";
		List<Localidad> lista = new ArrayList<Localidad>();
		//int num;
		try(ObjectInputStream oins = new  ObjectInputStream(new FileInputStream(new File("nuevaGeografia.bin")));){
			lista = (List<Localidad>) oins.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		cadena = lista.toString();
		/*for (int i = 0; i < lista.size(); i++) {
			cadena = lista.get(i).toString();
		}*/
		return cadena;
	}
	//toString
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", elevation="
				+ elevation + ", name=" + name + ", url=" + url + ", year=" + year + "]";
	}
	
	
}
