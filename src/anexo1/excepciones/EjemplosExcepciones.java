package anexo1.excepciones;

public class EjemplosExcepciones {

	public static void main(String[] args) {
		
		
		
		try {
			customFunction();		
		} catch (MyOwnExcepction e) {
			System.out.println("Error en la funcion main:\n");
			int a = 0;
		}

	}
	
	
	public static void customFunction() throws MyOwnExcepction {
		System.out.println("Hola Desde la funcion");
		throw new MyOwnExcepction();
	}

}
