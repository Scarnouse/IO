package Ejercicios;

public class Libro {
	//atributos
	private String isbn;
	private String codigo;
	private String titulo;
	private String lanzamiento;
	//constructor
	public Libro (String isbn, String codigo, String titulo, String lanzamiento){
			this.codigo=codigo;
			this.titulo=titulo;
			this.isbn=isbn;
			this.lanzamiento=lanzamiento;
		
	}

	/*private boolean validarIsbn(String isbn){
		boolean validado = false;
		int resultado = 0;
		for(int i = 0; i < isbn.length()-1;i++){
			resultado += (i+1)*Character.getNumericValue(isbn.charAt(i));
		}
		if(resultado%11==Character.getNumericValue(isbn.charAt(9))) validado = true;
		if(resultado%11==10 && isbn.charAt(isbn.length()-1)=='X') validado = true;
		System.out.println(validado);
		return validado;
	}*/
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", codigo=" + codigo + ", titulo=" + titulo + ", lanzamiento=" + lanzamiento
				+ "]";
	}
	
	/*
	public static void main(String[] args) {
		String isbn = "039572774X";
		validarIsbn(isbn);
	}*/
}
