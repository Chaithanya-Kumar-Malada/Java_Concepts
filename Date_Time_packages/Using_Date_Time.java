package Date_Time_packages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

//import java.time.zone.*;

public class Using_Date_Time {

	public static void main(String[] args) {
	
		
		LocalDate localdate = LocalDate.now();
		LocalTime localtime =LocalTime.now();
		LocalDateTime localdatetime = LocalDateTime.now();
		
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(localdatetime);
	
// 			You can use the DateTimeFormatter class with the ofPattern() method
//				in the same package to format or parse date-time objects
		
		
		DateTimeFormatter myformat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		
		String mytime = localdatetime.format(myformat);
		
		System.out.println("Formatted Date & Time : "+mytime);
		
		
		
		
	}
}
