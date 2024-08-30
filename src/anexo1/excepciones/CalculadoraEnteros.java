package anexo1.excepciones;

public class CalculadoraEnteros {
	
	public static int suma(int a, int b) {
		
		return a + b;
	}
	
	public static int resta(int a, int b) {

		return a - b;
	}

	public static int multiplicacion(int a, int b) {

		return a*b;
	}

	public static int divisionThrows (int a, int b) throws ArithmeticException{
		int result = 0;
		try {
			result = a/b;
		} catch (ArithmeticException ae){
			throw new ArithmeticException("Se ha producido un error en el método divisionThrows...");
		}
		return result;
	}
	
	public static int division(int a, int b) {

		return a / b;
	}
	

}
