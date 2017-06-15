package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
/*
		Ex5SearchForALetter ex5 = new Ex5SearchForALetter();


		System.out.print("Type a word : ");
		String userInput = scanner.nextLine();

		ex5.searchforLetter(userInput);
		//System.out.println(chreturn);
		scanner.close();
	}

	//Method
	public void searchforLetter(String str){
		Scanner scanner =new Scanner(System.in);


		System.out.print("Search for a charater :");
		String searchChar =scanner.nextLine();
		
		char letter = searchChar.charAt(0);
		
		char [] letters = str.toCharArray();
		
		boolean isFound = false;

		for(int i =0; i<letters.length; i++){
			
		

			if(letters[i] == letter){

				//int position = str.indexOf(searchChar);
				System.out.println("[ "+searchChar +" ] was found at position : " + (i+1));
				isFound = true;

			}
			else{
			}

		}
		if(!isFound){
			System.out.println("[ "+searchChar +" ] was not found");
			
		}

		scanner.close();*/
		
		
		//PART B:
		
	try (Scanner scanner1 = new Scanner(System.in)) {
			
			System.out.print("Enter a word: ");
			String word = scanner.nextLine();
			System.out.print("Enter a letter to search for: ");
			// .charAt(0) will return the first character in the string
			char letter1 = scanner.nextLine().charAt(0);
			
			// PART A: find one occurrence
//			int position = word.indexOf(letter);
//			if (position == -1) {
//				System.out.println(letter + " was not found");
//			} else {
//				System.out.println(letter + " found at " + position);
//			}
			
			// PART B: find multiple occurrences:
			char [] letters1 = word.toCharArray();
//			boolean isFound = false;
			int counter = 0;
			for (int i = 0; i < letters1.length; i++) {
				if (letters1[i] == letter1) {
					System.out.println(letter1 + " found at " + (i + 1));
					//isFound = true;
					counter++;
				} 
			}
			if (counter == 0) {
				System.out.println(letter1 + " not found");
			}
//			if (!isFound) {
//				System.out.println(letter + " not found");
//			}
			
			//scanner.close(); // closed automatically with try-with-resource block
		}
	}
}
