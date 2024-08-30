package anexo2;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class EjemploHashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> miHashSet = new HashSet<String>();
	    miHashSet.add("Volvo");
	    miHashSet.add("BMW");
	    miHashSet.add("Ford");
	    miHashSet.add("BMW");
	    miHashSet.add("Mazda");
	    
	    miHashSet.add("Volvo");
	    
	    System.out.println(miHashSet);
	    
	    // Comprobar si contiene un elemento
	    System.out.println(miHashSet.contains("Mazda"));
	    
	    // Borrar un elemento
	    miHashSet.remove("Volvo");
	    System.out.println(miHashSet);
	    
	    // Sacar el tamaño
	    int size = miHashSet.size();
	    
	    // Recorrer con un bucle for each
	    for (String item : miHashSet) {
	    	  System.out.println(item);
	    	}
	    
	    // Para crearlo desde una ArrayList previo
	    Integer[] intArray = {1,1,2,3,3,4,5,6,7,8,9,10};
	    ArrayList<Integer> intArrList = new ArrayList<Integer>( Arrays.asList(intArray) );
	    
	    HashSet<Integer> setIntegers = new HashSet<Integer>( intArrList );
	    System.out.println(setIntegers);
	    

	}

}
