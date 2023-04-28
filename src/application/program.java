package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d04 = LocalDate.parse("2020-07-23");
		LocalDateTime d05 = LocalDateTime.parse("2020-07-23T23:45:53");
		Instant d06 = Instant.parse("2020-11-25T01:45:35Z");
		Instant d07 = Instant.parse("2020-11-25T23:45:35-03:00");
		
		LocalDate  d08 = LocalDate.parse("22/07/2023", fmt1);
		
	
		
		
		
		System.out.println("d01 : " + d01 );
		System.out.println("d02 : " + d02 );
		System.out.println("d03 : " + d03 );
		System.out.println("d04 : " + d04 );
		System.out.println("d05 : " + d05 );
		System.out.println("d06 : " + d06 );
		System.out.println("d07 : " + d07 );
		System.out.println("d08 : " + d08 );
		System.out.println("d05 : " + d05.format(fmt1));
		System.out.println("d05 : " + d05.format(fmt2));
		
		// instante nao está numa forma local, nao recebe o format
		System.out.println("d06 : " + fmt3.format(d06));
		
	
	}

}
