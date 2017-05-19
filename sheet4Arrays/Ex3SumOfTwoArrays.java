package sheet4Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ex3SumOfTwoArrays{
	public static void main(String[] args){
		
		Ex3SumOfTwoArrays ex3 = new Ex3SumOfTwoArrays();
		
		//Decalring the Scanner
		Scanner input = new Scanner(System.in);
		
		// Creating Arrays 
		
		int arr[] = new int [3];
		int [] arr2 = new int[3];
		
		//************ Start of Array 1 ************ 
		System.out.println("\n Array 1 ");
		
		int arrTotal = 0;
		int i=0;
		for(; i<arr.length; ++i){
			System.out.print("\n Type a value:");
			arr[i] = input.nextInt();
			arrTotal += arr[i];
			
		}
		//System.out.println("");
		//ystem.out.println(" total "+ arrTotal);
		

		//************ Start of Array 2 ************
		System.out.println("\n\n Array 2 ");
		
		
		int arr2Total = 0;
		for( i=0; i<arr2.length; ++i){
			System.out.print("\n Type a value:");
			arr2[i] = input.nextInt();
			arr2Total += arr2[i];
			
		}
		//System.out.println(" Total: "+ arr2Total);
		
		ex3.getSumteoArrays(arr, arr2);
		
		//close Scanner
		input.close();
		
	}//main
	
	
	private void getSumteoArrays(int[] arr, int[] arr2){
		int i=0;
		int [] totals = new int[3];
		for( ; i<arr.length; ++i){
		totals[i] = arr[i] + arr2[i];
		
		}
		//System.out.printf("\n Array 1 \tArray 2 \tSum\n");
		System.out.println("\n Arrays total is : "+ Arrays.toString(totals));
		
		
	}
		
		
	
	
}