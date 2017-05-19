package sheet3ControlFlow;

import java.util.Scanner;

public class Ex9ifElseStatements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// while loop is for testing
		//while(true){
		
		System.out.print("Please enter an integer: ");
		
		int num = scanner.nextInt();
			
		if(num >=1 && num <=10){
			System.out.print("You typed 1 to 10 : "+num);
		}
		else if(num>=11 && num<= 20)
			System.out.println("You typed 11 to 20 : " + num);
		else if(num>=21 && num<=30)
			System.out.println("You typed 21 to 30");
		else if(num>=31 & num <=40)
			System.out.println("You typed 31 to 40");
		else if(num>=41 && num <=50)
			System.out.println("You typed 41 to 50");
		else
			System.out.println("You typed under 0 or over 50+");
			
		//}// while
		//Close the Scanner
		scanner.close();
	}//main

}//class
