package anexo1.excepciones;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException() {
        super();
    }
	
	public CustomException(String message) {
        super("\nWOW this is a CustomException: " + message);
    }

	/**
	 * @param message
	 * @param cause
	 */
	public CustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
