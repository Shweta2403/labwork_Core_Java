package laboratory_1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate joiningDate = LocalDate.of(2022,  02, 18);
		System.out.println(joiningDate);
		
		joiningDate.getYear();
		
	}

}
