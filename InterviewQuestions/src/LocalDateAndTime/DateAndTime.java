package LocalDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	
	  public static void main(String[] args) {
	     	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	        String date = LocalDateTime.now().format(formatter);
	        System.out.println(date); 
	    
	    }

}
