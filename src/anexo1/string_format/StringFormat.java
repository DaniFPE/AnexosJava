package anexo1.string_format;

public class StringFormat {

	public static void main(String[] args) {
		// Algunos ejemplos de fomateo de Strings
		// Mediante la clase printf que llama al método String.format();
		String formato = "Esto es un ejemplo %s %s";
		String valor1 = "de string";
		String valor2 = "format.";
		System.out.printf(formato, valor1, valor2);
		
		// Mediante el método estático String.format()
		String frase = String.format("\nAqui insertaré un String %s y aqui un entero %d", "Ejemplo", 100);
		System.out.println(frase);
		
		// Strings
		String nombre = "Codigo";
		String apellido = "Facilito";

		String nombreCompleto = String.format("%s %s", nombre, apellido);
		System.out.println(nombreCompleto);
		
		// Enteros
		String resultado = String.format("%d - %d - %d", 10, 20, 30);
		System.out.println(resultado);
		
		// Float
		float pi = 3.14159265359f;

		String resultado2 = String.format("%f - Decimales: %010.5f", pi, pi);
		System.out.println(resultado2);
		
		// Boolean
		int cantidad = 10;
		boolean mayor = cantidad > 5;

		String resultado3 = String.format("La cantidad es mayor a %d : %b", 
		                                                cantidad, mayor);
		System.out.println(resultado3);
		
		// Especificando un orden diferente
		String uno = "Uno";
		String dos = "Dos";
		String tres = "Tres";
		String resultado4 = String.format("%3$s - %2$s - %1$s", 
		                             uno, dos, tres);
		System.out.println(resultado4);

		// ejemplo estilo tabla
		String row = String.format("\n\t%s:\t\t%d", "UsuarioId", 6483);
		System.out.println(row);

	}

}
