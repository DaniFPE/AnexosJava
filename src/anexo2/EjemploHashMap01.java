package anexo2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Ejemplo de uso de la clase HasMap
 *
 * @author Luis José Sánchez
 */
public class EjemploHashMap01 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");      
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Los elementos de m son: \n" + m);
    
    // Como acceder a un elemento a través de su clave
    String nombre = m.get(924);
    System.out.println(nombre);
    
    // Como declarar de una vez un HashMap con varios elementos
    Integer[] keys = {1,2,3,4,5,6,7,8,9,10};
    String[] values = {"a","b","c","d","e","f","g","h","i","j"};
    HashMap<Integer, String> miHashMap = new HashMap<Integer, String>();
    
    for (int i=0; i<keys.length; i++) {
    	miHashMap.put(keys[i], values[i]);
    }
    
    System.out.println(miHashMap);
    
    
  }
}
