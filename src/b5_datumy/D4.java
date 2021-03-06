package b5_datumy;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class D4 {
	public static void main(String...strings) {
		LocalTime time1, time2, time = LocalTime.now();
		
		time1 = LocalTime.now();
		if (time1.getHour() >= 12) {
			//something
		}
		
		time2 = LocalTime.of(13, 30);
		if (time2.isAfter(time1))
			System.out.println("we are late");
		
		String str = time.toString();
		System.out.println(str);
		
		time = time.plusHours(4).minusMinutes(2);
		time = time.withNano(0);
		time = time.truncatedTo(ChronoUnit.SECONDS);
		
	}
}
