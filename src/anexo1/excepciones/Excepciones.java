package anexo1.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		
		try {
//			throw new NullPointerException();
			int zero = 0/0;
			int a = Integer.parseInt("abc1234");
			System.out.println(a);
		} catch (NumberFormatException ne){
			System.out.println(ne);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println();
			System.out.println( e.getClass() );
			System.out.println( e.getMessage() );
		}
			

	}

}
