package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		Boss b = new Boss("Tony", "Soprano", LocalDate.of(1958, Month.JUNE, 5), 135000);
		CommissionWorker c = new CommissionWorker("Tony", "Montqana", LocalDate.of(1949, Month.APRIL, 9), 200, 50, 32);
		PieceWorker p = new PieceWorker("Al", "capone", LocalDate.of(1922, Month.DECEMBER, 25), 125, 15);
		HourlyWorker h = new HourlyWorker("Bugsy", "Malone", LocalDate.of(1902, Month.MAY, 25), 10, 50);
		
		
		Employee[] workers = {b,c,p,h};
		
		for(Employee one: workers){
			System.out.println(one.toString());
			
			
			if(one instanceof Boss){
				System.out.println("________________");
				System.out.printf(" Boss salary : €%.2f ",((Boss)one).getWeeklySalary());
				System.out.print("\n________________");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*LocalDate now = LocalDate.now();
		System.out.println(now);*/
	
		
		/*Boss theBoss = new Boss("Vitas", "Oringoy",LocalDate.of(1975, Month.MARCH, 5), 2500);
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
		}*/

	}

}
