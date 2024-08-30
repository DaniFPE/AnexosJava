package anexo1.excepciones;

public class Excepciones3 {

	public static void main (String[] args) {
		
		try {
			throw new CustomException("Error en el main de Excepciones3.");	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
