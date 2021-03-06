package b5_datumy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class D7_Formatting_Parsing {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("");
		
		
		/*
		 * days between two days
		 */
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2018, 1, 26);
		Period period = Period.between(d1, d2);
		System.out.println(period.toString());
	}
}
