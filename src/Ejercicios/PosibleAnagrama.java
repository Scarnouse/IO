package Ejercicios;

public class PosibleAnagrama {
	//Atributos
	private String palabraUno;
	private String palabraDos;
	//Constructor
	public PosibleAnagrama(String palabraUno, String palabraDos){
		if (isAnagrama(palabraUno, palabraDos)){
			System.out.println("Es anagrama");
			this.palabraUno = palabraUno;
			this.palabraDos = palabraDos;
		} else {
			System.out.println("No es anagrama");
		}
	}
	//Método
	private boolean isAnagrama(String palabraUno, String palabraDos){
		boolean validado = false;
		if (palabraUno.length()==palabraDos.length()&&palabraUno.matches(".*[^0-9].*")&&palabraDos.matches(".*[^0-9].*")){
			int contador = 0;
			for (int i = 0; i < palabraDos.length(); i++) {
				if(palabraDos.toLowerCase().contains(Character.toString(palabraUno.toLowerCase().charAt(i)))){
					contador ++;
				}
			}
			if (contador==palabraDos.length()) return validado = true;
		}
		return validado;
	}
}
