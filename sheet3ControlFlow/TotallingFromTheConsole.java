package sheet3ControlFlow;
import java.util.Scanner;

public class TotallingFromTheConsole{
	public static void main(String[] args){
		
	
		Scanner input = new Scanner(System.in);
		/*
		System.out.print("Enter a number : ");
		double user1 = input.nextDouble();
		
		System.out.print("Enter a second number : ");
		double user2 = input.nextDouble();
		
		System.out.print("Enter one more number : ");
		double user3 = input.nextDouble();
		
		*/
	
		double total=0;
		
		for(int i = 0;i< 3;++i){
			
			System.out.print("Enter a number : ");
			double user1 = input.nextDouble();
			//total = user1+user2+user3 ;
			total += user1;
			
		}
	    System.out.println("The toal is " + total);
	
	    //close Scanner
	    input.close();
	}//main
	
}//class
		
		/*

		int total = 0;
		
		for (int i = 0; i < 10; i++) {
		
			System.out.println("i is " + i);
			
			total = total + i; 
			//total += i;
		}
		System.out.println("The total after the loop is: " + total);
		
		*/