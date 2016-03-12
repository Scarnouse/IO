package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

	//toString
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", elevation="
				+ elevation + ", name=" + name + ", url=" + url + ", year=" + year + "]";
	}
	
	
}
