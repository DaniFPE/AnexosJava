package anexo3.fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ej02FechasManipulacion {

public static void main(String[] args) {
		
		/* Declaracion de fecha */
		LocalDate fecha1 = LocalDate.of(2000, 4, 4);
		
		System.out.println(fecha1);
		
		/* extracción de partedes de la fecha */
		DayOfWeek diaSemana = fecha1.getDayOfWeek();
		Month mes = fecha1.getMonth();
		Integer mesNumero = fecha1.getMonthValue();
		Integer año = fecha1.getYear();
		
		System.out.println(diaSemana);
		System.out.println(mes);
		System.out.println(mesNumero);
		System.out.println(año);
		System.out.println();
		
		/* Sumar periodos temporales a una fecha
		 * Darse cuenta de que estos métodos no mofican la fecha original,
		 * lo que hacen es darnos una nueva fecha con el cambio especificado */
		System.out.println( fecha1.plusDays(5) );
		System.out.println( fecha1.minusDays(190) );
		System.out.println( fecha1.plusMonths(2) );
		System.out.println( fecha1.minusMonths(2) );
		System.out.println( fecha1.plusYears(2) );
		System.out.println( fecha1.minusYears(2) );
		
		/* Comparar fechas */
		LocalDate fecha2 = LocalDate.of(2001, 4, 4);
		fecha1 = LocalDate.of(2000, 4, 4);
		
		System.out.println("fecha 2 va después de fecha 1: " + fecha2.isAfter(fecha1));
		System.out.println("fecha 2 va antes de fecha 1: " + fecha2.isBefore(fecha1));
		System.out.println("fecha 2 es igual a fecha 1: " + fecha2.isEqual(fecha1));
		
		int compare = fecha2.compareTo(fecha1); // 0 iguales, positivo si fecha2 mayor a fecha1
		System.out.println(compare);
		
		/* Trabajo con periodos */
		System.out.println("\n----Period----");
		
		fecha2 = LocalDate.of(2001, 4, 4);
		fecha1 = LocalDate.now();
		
		Period periodo = Period.between(fecha2, fecha1);
		System.out.println(periodo.getYears() + " " + periodo.getMonths() + " " + periodo.getDays());
		
		System.out.println(periodo.addTo(fecha2));
		
		/* Trabajo con ChronoUnit */
		System.out.println("\n----ChronoUnit----");
		
		fecha2 = LocalDate.of(2001, 4, 4);
		fecha1 = LocalDate.now();
		
		System.out.println(fecha2);
		
		Integer days = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
		
		
		fecha2 = ChronoUnit.YEARS.addTo(fecha2, 2);
		
		System.out.println(fecha2);
		System.out.println(days);
		
	}
}
