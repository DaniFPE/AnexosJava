package anexo2;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejemplo de uso de la clase HashMap
 * 
 * @author Luis José Sánchez
 */
public class EjemploHashMap04 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.print("Por favor, introduzca un código: ");
    
    Scanner s = new Scanner(System.in);
    int codigoIntroducido = Integer.parseInt( s.next() );

    if (m.containsKey(codigoIntroducido)) {
      System.out.print("El código " + codigoIntroducido + " corresponde a ");
      System.out.println(m.get(codigoIntroducido));
    } else {
      System.out.print("El código introducido no existe.");
    }
  }
}
