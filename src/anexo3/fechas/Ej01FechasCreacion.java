package anexo3.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

import java.sql.Date;


public class Ej01FechasCreacion {
	
	public static void main(String[] args) {
		
		/* Declaracion de fecha y fecha tiempo */
		LocalDate fecha1 = LocalDate.of(1902, Month.JANUARY, 25);
		
		LocalDateTime fechaTime1 = LocalDateTime.of(3030, 2, 24, 12, 30, 30);
		
		System.out.println("\n ---- OF ------");
		System.out.println(fecha1);
		System.out.println(fechaTime1);
		
		System.out.println();
		
		/* Los métodos estan sobrecargados, por ejemplo para el mes */
		LocalDate fecha2 = LocalDate.of(2014, Month.MAY, 2);
		
		System.out.println(fecha2);
		
		System.out.println("\n ---- NOW ------");
		
		/* Usos basicos */
		/* Fecha de hoy */
		LocalDate fechaHoy = LocalDate.now();
		System.out.println(fechaHoy);
		
		LocalDateTime fechaTiempoHoy = LocalDateTime.now();
		System.out.println(fechaTiempoHoy);
		
		System.out.println();
		
		/* Introducir como String */
		/* Por defecto */
		System.out.println("\n ---- String ------");
		LocalDate hoy = LocalDate.parse("2024-07-30");
		System.out.println(hoy);
		
		/* Con un formato específico */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // "29/07/2024"
		LocalDate fechaFromStr = LocalDate.parse("09/06/2022", formatter);
		System.out.println(fechaFromStr);
		
		/* Transformarlas a formato SQL */
		Date fechaSQLformat = Date.valueOf(fechaFromStr);
		System.out.println(fechaSQLformat);
		
		
	}

}
