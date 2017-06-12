package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex4Reverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a sentence ");
//		String userInput = scanner.nextLine();
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(userInput);
//		sb.reverse();
//		System.out.println(sb);
		
		String myString = scanner.nextLine();
		
		
		
		char [] letters = myString.toCharArray();
		
		for(int i=0;i <letters.length;i++){
			System.out.print(letters[i]+ " ");
		}
System.out.println();
		for(int j=letters.length-1; j>=0;j--){
			
			System.out.print(letters[j]+" ");
		}
		
		
	}

}
