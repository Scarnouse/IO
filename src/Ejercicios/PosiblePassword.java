package Ejercicios;

public class PosiblePassword {
	//Atributo
	private String password;
	//Constructor
	public PosiblePassword(String password) {
		if (isPassword(password)){
			System.out.println("Contraseña correcta");
			this.password=password;
		} else {
			System.out.println("Contraseña no valida");
		}
	}
	//método
	private boolean isPassword(String password){
		boolean validado = false;
		//Nota aclaratoria al matches(".*(\\d+).*(\\d+).*")
		//El ejercicio indica que debe de contener al menos
		//dos dígitos, sin indicar si están seguidos o no
		//el matches(".*(\\d+){2,).*") no funciona porque le
		//estamos indicando que los dígitos han de estar
		//seguidos
		if (password.matches(".{8,}")&&password.matches(".*[A-Z]+.*")&&password.matches(".*(\\d+).*(\\d+).*")){
			validado = true;
		}
		return validado;
	}
	//método de testeo
	/*public static void main(String[] args) {
		System.out.println(isContraseña("c43rmlo"));
	}*/
}
