package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {

	public static void main(String[] args) {

		Ex5SearchForALetter ex5 = new Ex5SearchForALetter();

		Scanner scanner =new Scanner(System.in);

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
			/*else{
			}*/

		}
		if(!isFound){
			System.out.println("[ "+searchChar +" ] was not found");
			
		}

		scanner.close();
	}
}
