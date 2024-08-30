package anexo2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Ejemplo de uso de la clase ArrayList
 * 
 * @author Luis José Sánchez
 */
public class EjemploArrayList01 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();
    
    System.out.println("Nº de elementos: " + a.size());

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    
    System.out.println(a);
    System.out.println("Nº de elementos: " + a.size());        

    a.add("blanco");
    System.out.println(a);
    System.out.println("Nº de elementos: " + a.size());        

    System.out.println("El elemento que hay en la posición 0 es " + a.get(0));        
    System.out.println("El elemento que hay en la posición 3 es " + a.get(3));
    
    // Una manera de inicializarlo con valores es usar un Array previamente y 
    // trasnformalrlo en una lista mediante el uso de la clase utilitaria Arrays
    Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
    ArrayList<Integer> intArrList = new ArrayList<Integer>( Arrays.asList(intArray) );

    System.out.println(intArrList);
    
    // Para comparar elementos empleamos equals
    System.out.println( intArrList.equals(intArrList));
    System.out.println( intArrList.equals(a));
    
    String s = "Cuando el grajo vuela bajo hace un frio del carajo";
    String[] sSplitted = s.replace(".", "").split(",");
    
    System.out.println( Arrays.toString(sSplitted ) );

  }
}
