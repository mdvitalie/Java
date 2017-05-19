package sheet3ControlFlow;
import java.util.Scanner;

public class Ex7TotalOf10Values{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double total=0;
		double average=0;
		//double average;
		int i;
		for( i=0; i<10; ++i){
			System.out.print(" Enter a value : ");
			double user = scan.nextDouble();
			total +=user; 
			System.out.println("\n Total user input is: "+ total);
			
			if(total % 5==0){
				total*=5;
				System.out.println(" Total * 5 is: "+ total);
				
			}
			
		}
		    average= total/i;
			System.out.printf("\n The average is : %.2f", average);
		//System.out.print("The total of user input is: " + total);
			
			//close Scanner
			scan.close();
	}//main
	
}//class