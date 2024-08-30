package anexo3.fechas;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Ej03FechasEnSQL {

public static void main(String[] args) {
		
		/* Declaracion de fecha */
		LocalDate fecha1 = LocalDate.of(2000, 4, 4);
		LocalDate fecha2 = LocalDate.of(2001, 4, 4);
		
		/* Parseamos a java.sql.Date */
		Date fecha1SQLformat = Date.valueOf(fecha1);
		Date fecha2SQLformat = Date.valueOf(fecha2);
		
		/* Parseamos de nuevo a java.time.LocalDate */
		fecha1 = fecha1SQLformat.toLocalDate();
		fecha2 = fecha2SQLformat.toLocalDate();
		
	}
}
