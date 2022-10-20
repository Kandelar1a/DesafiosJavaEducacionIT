package modulo21ej02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Fecha {

	String PATRON_FECHA_YYYYMMDD = "yyyy-MM-dd";
	String PATRON_FECHA_HORA_YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";

	static LocalDate getLocalDate(String fecha) {
		return LocalDate.parse(fecha, DateTimeFormatter.ofPattern(PATRON_FECHA_YYYYMMDD));
	}
	
	static LocalDateTime getLocalDateTime(String fecha) {
		return LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern(PATRON_FECHA_HORA_YYYYMMDD_HHMMSS));
	}

	public static String getStringLocalDate(LocalDate fecha) {
		return fecha.format(DateTimeFormatter.ofPattern(PATRON_FECHA_HORA_YYYYMMDD_HHMMSS));
	}
	
	public static String getStringLocalDateTime(LocalDateTime fecha) {
		return fecha.format(DateTimeFormatter.ofPattern(PATRON_FECHA_HORA_YYYYMMDD_HHMMSS));
	}

	
		
}
