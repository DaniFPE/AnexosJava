package anexo1.excepciones;

import java.util.logging.ErrorManager;

public class Excepciones2 {

	public static void main(String[] args) {
	
//		throw new ArithmeticException();
		String errorMessage = "";
		int resultado = 0;
		
		try {
			resultado = CalculadoraEnteros.divisionThrows(10, 0);
		} catch (ArithmeticException ae) {
			errorMessage = "Se a producido el siguiente error:\n" + ae;
			System.out.println(errorMessage);
		}
		
		System.out.println();
		
		try {
			resultado = CalculadoraEnteros.division(10, 0);
		} catch (ArithmeticException ae) {
			errorMessage = "Se a producido el siguiente error:\n" + ae;
			System.out.println(errorMessage);
		}
		
	}

}
