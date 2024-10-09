package com.interviewpre.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate date = LocalDate.now();
LocalDateTime Time = LocalDateTime.now();
LocalTime currentTime = LocalTime.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
try {
	 String format2 = currentTime.format(format);
	 System.out.println(format2);
} catch (Exception e) {
	System.out.println(e.getMessage());
}
                 
System.out.println(date);
System.out.println(currentTime);

	}

}
