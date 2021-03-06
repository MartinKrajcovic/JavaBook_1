package b5_datumy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class D6 {
	public static void main(String[] args) {
		Duration duration = Duration.ofHours(6);
		duration = duration.multipliedBy(3);
		duration = duration.plusMinutes(30);
		
		/*
		 * duration object holds nanoseconds
		 */
		
		LocalDateTime dt = LocalDateTime.now();
		dt = dt.plus(duration);
		
		
		Period period = Period.ofMonths(9);
		period = period.plusDays(6);
		
		dt = dt.plus(period);
		
		/*
		 * Classes in Date and Time API in JDK 1.8 
		 * 
		 * LocalDate
		 * LocalTime
		 * LocalDateTime
		 * OffsetTime
		 * OffsetDateTime
		 * ZonedDateTime
		 * 
		 * Year
		 * YearMonth
		 * MonthDay
		 * Instant
		 */
		
	}
}
