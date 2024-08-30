package anexo1.excepciones;

public class MyOwnExcepction extends Exception {

	public MyOwnExcepction() {
		super();
	}

	public MyOwnExcepction(String message, Throwable cause) {
		super(message, cause);
	}

	public MyOwnExcepction(String message) {
		super(message);
	}
	

}
