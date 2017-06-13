package sheet15Exceptions;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex3WeekdayMain {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		
		//boolean t = false;
		
			try{
				//do{
				
				System.out.print("Enter a week day: ");
				String week = scanner.nextLine();
				Ex3Weekday4 wk = new Ex3Weekday4(week);
				System.out.println(wk);
				
				
				//}while(!t);
			
			
			}catch(InvalidWeekdayException e){
				System.out.println("Invalid week day");
				e.printStackTrace();
				
			}finally{
				scanner.close();
			}*/
			
			
			
			try{
				Ex3Weekday2 week2 = new Ex3Weekday2("MONDAY");
			System.out.println(week2);
			
			}catch(InvalidWeekdayException e){
				System.out.println("Problem");
				e.printStackTrace();
			}
			
			try{
				Ex3Weekday2 weekday3 = new Ex3Weekday2("friDay");
			}catch(InvalidWeekdayException e){
				e.printStackTrace();
			}

	}

}



/**OUTPUT
 * 
 * Problem
sheet15Exceptions.InvalidWeekdayException: MONDAY is not a valid weekday
	at sheet15Exceptions.Ex3Weekday2.setWeekday(Ex3Weekday2.java:71)
	at sheet15Exceptions.Ex3Weekday2.<init>(Ex3Weekday2.java:30)
	at sheet15Exceptions.Ex3WeekdayMain.main(Ex3WeekdayMain.java:38)
sheet15Exceptions.InvalidWeekdayException: friDay is not a valid weekday
	at sheet15Exceptions.Ex3Weekday2.setWeekday(Ex3Weekday2.java:71)
	at sheet15Exceptions.Ex3Weekday2.<init>(Ex3Weekday2.java:30)
	at sheet15Exceptions.Ex3WeekdayMain.main(Ex3WeekdayMain.java:47)
*/
