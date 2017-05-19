package sheet4Arrays;
import java.util.Scanner;

public class Ex2DoubleArray{
	public static void main(String[] args){
		
		//Decalring the Scanner
		Scanner input = new Scanner(System.in);
		double [] arrNum =  new double[10];
		
		
		double total =0;
		//double average = 0;
		int i=0;
		
		for(; i<arrNum.length; ++i){
			
			// Asking for the user to type a value/number
			System.out.print("\n Type a value: ");
			//double userInput = input.nextDouble();
			arrNum[i] = input.nextDouble();
			System.out.printf(" Enter double %d : ", i+1);
			
			
			total+=arrNum[i];
		
		}
		
		for (i=0; i<arrNum.length; ++i){
			
			System.out.println(" "+arrNum[i]);
		}
		
		//average = total / i;
		System.out.printf("\n The total is:%.2f ", total);
		//System.out.printf("\n The average is: %.2f", average);
		System.out.printf("\n The average is: %.2f", total /i);
		
		//closing Scanner
		input.close();
	}//main
}