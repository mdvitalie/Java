package sheet4B_Arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1LargestSmallestSearchingSortingAnArray {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);

		Ex1LargestSmallestSearchingSortingAnArray ex1 = new Ex1LargestSmallestSearchingSortingAnArray();


		Random random = new Random();

		int[]  elements = new int[50];

		//int numRand = random.nextInt(100)+1;

		//For loop
		int i=0;
		for(;i<elements.length;i++){
			elements[i] =random.nextInt(100)+1;
			//System.out.println(elements[i]);

		}
		
		System.out.print("Type a number 1 to 100");
		int value = scanner.nextInt();
		ex1.findSmallestElement(elements);
		ex1.findLargestElement(elements);
		ex1.searchArray(elements, value);
		i=0;
		
		//Array is not sorted
		
		for(;i<elements.length;i++){
			
			System.out.println(i+1 + ") "+elements[i]);
			//System.out.println(elements[i]);

		}
		
		ex1.sortArray(elements);
		ex1.printArray(elements);


	}//main

	public void printArray(int[] printContent){
			System.out.println("\n\nPrinting the array contents");
		for(int i=0; i<printContent.length; i++){
			System.out.println(printContent[i]);
		}
	
	}

	public void sortArray(int[] sortNum){
	int counter = 1;
		System.out.println();
		System.out.print("##### Sorted Array #####");
		System.out.println();
		Arrays.sort(sortNum);
		for(int i=0; i<sortNum.length; i++){
			
			System.out.print(" "+sortNum[i]+" ");
			/*if(counter % 7 == 0){
				System.out.println(" ");
			}
			counter++;*/
		}
		
	}
		
//##############################################################
	
	public void	searchArray(int[] searchNum, int value){
		
		boolean isFound = false; // not yet found
		
		for(int i=0;i<searchNum.length; i++){
			if(searchNum[i] == value){
				 isFound = true;
				System.out.println("\nNumber "+value+" found at position: "+ (i+1)+"\n");
			}
			
			
		}
		if(!isFound){
			System.out.println("\nThe number hasn't been found\n");
		}
	}


	public void findLargestElement(int[] largNum) {


		int largetst = largNum[0];

		for(int i=1; i< largNum.length; i++) {
			if(largNum[i] > largetst){

				largetst = largNum[i];

			}

		}
		System.out.print("  Largest Number : " + largetst+"\n");
		//System.out.println();

	}


	public void findSmallestElement(int[] smallNum) {

		int smallest = smallNum[0];


		for(int i=1; i< smallNum.length; i++) {

			if (smallNum[i] < smallest){

				smallest = smallNum[i];
			}   
		}
		//return smallest;
		System.out.print("\n Smallest Number : " + smallest + "   ||");


	}

}//class
