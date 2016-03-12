package Ejercicios;

public class Libro {
	//atributos
	private String titulo;
	private String autor;
	private String isbn;
	//constructor
	public Libro (String titulo, String autor, String isbn){
			this.titulo=titulo;
			this.autor=autor;
			this.isbn=isbn;
		
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
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + "]";
	}
	
	
	/*
	public static void main(String[] args) {
		String isbn = "039572774X";
		validarIsbn(isbn);
	}*/
}
