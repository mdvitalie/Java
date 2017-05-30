package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		
		/*LocalDate now = LocalDate.now();
		System.out.println(now);*/
	
		
		Boss theBoss = new Boss("Vitas", "Oringoy",LocalDate.of(1975, Month.MARCH, 5), 2500);
		System.out.println(theBoss);
		Boss theBoss1 = new Boss("Vovaldy", "Martinez",LocalDate.of(1860,Month.APRIL, 30), 2500);
		System.out.println(theBoss1);
		
		

	}

}
