package sheet15Exceptions;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex3WeekdayMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean t = false;
		
			try{
				do{
				
				System.out.print("Enter a week day: ");
				String week = scanner.nextLine();
				Ex3Weekday2 wk = new Ex3Weekday2(week);
				System.out.println(wk);
				
				
				}while(!t);
			
			
			}catch(InvalidWeekdayException e){
				System.out.println(" Invalid week day");
				e.printStackTrace();
				
			}finally{
				scanner.close();
			}
			

	}

}
