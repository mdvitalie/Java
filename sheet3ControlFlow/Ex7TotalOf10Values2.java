package sheet3ControlFlow;
import java.util.Scanner;

public class Ex7TotalOf10Values2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
			int total = 0;
			int i = 0;
			for( ; i<5; ++i ){
				
				System.out.printf("Enter number %d : ", i+1);
				int num1 = scan.nextInt();
				total = total +num1;
				System.out.println("You typed: " + num1);
				
			}
				System.out.println("Total : " + total);
				System.out.println("Avarage " + total /i);
			
	
		    //close Scanner
				scan.close();
			
	}//main
}//class