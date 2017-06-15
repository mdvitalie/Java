package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex4Reverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Type a sentence: ");

		String myString = scanner.nextLine();
		//Sanner close()
		scanner.close();


		char [] letters = myString.toCharArray();
		
		for(int i =letters.length-1;i>=0;i--){
			System.out.print(letters[i]);
		}
		
		for(int i =myString.length()-1; i>=0; i--){
			System.out.print("\n"+myString.charAt(i));
		}

//		for(int i=0;i <letters.length-1;i++){
//			System.out.print(letters[i]+ " ");
//		}
//		
//		System.out.println();
//		
//		for(int j=letters.length-1; j>=0;j--){
//
//			System.out.print(letters[j]+" ");
//		}


	}

}
