package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		
		/*LocalDate now = LocalDate.now();
		System.out.println(now);*/
	
		
		Boss theBoss = new Boss("Vitas", "Oringoy",LocalDate.of(1975, Month.MARCH, 5), 2500);
		System.out.println(theBoss);
		Boss theBoss1 = new Boss("Vovaldy", "Martinez",LocalDate.of(1860,Month.APRIL, 30), 3500);
		//System.out.println(theBoss1);
		
		System.out.println();
		CommissionWorker commissionWorker = new CommissionWorker("Vlad", "Plachodo", LocalDate.of(1990, Month.MAY, 5),
				25000, 2.5, 5);
		//System.out.println(commissionWorker);
		
		System.out.println();
		PieceWorker pieceWorker = new PieceWorker("Daniela", "Vradenogo", LocalDate.of(1999, Month.JUNE, 10), 30, 10);
		//System.out.println(pieceWorker);
		
		System.out.println();
		HourlyWorker hourlyWorker = new HourlyWorker("Nikola", "Paganiny", LocalDate.of(2000, Month.AUGUST, 01), 11.50, 40);
		//System.out.println(hourlyWorker);
		
		System.out.println();
		HourlyWorker hourlyWorker1 = new HourlyWorker("Nikola", "Paganiny", LocalDate.of(2000, Month.AUGUST, 01), 11.50, 50);
		//System.out.println(hourlyWorker1);
		
		
		
		Employee[] employees = {theBoss,theBoss1,commissionWorker,pieceWorker,hourlyWorker,hourlyWorker1};
		
		for(Employee one : employees){
			//System.out.println(((Employee)one).getEarning());
			System.out.println(one);
		}

	}

}
