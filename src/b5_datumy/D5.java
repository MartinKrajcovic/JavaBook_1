package b5_datumy;

import java.time.LocalDateTime;
import java.time.Month;

public class D5 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ltd2 = LocalDateTime.of(2013, Month.SEPTEMBER, 12, 13, 33);
		
		ldt = ldt.plusDays(2).minusHours(4);
	}
}
