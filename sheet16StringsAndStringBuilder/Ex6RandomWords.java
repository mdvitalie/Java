package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex6RandomWords {

	public static void main(String[] args) {
		
		String[] randWords= {"Java","JavaScript","WebDeveloper","SoftWare Developer"};
		
		int randomdNum = (int)(Math.random()*5);
		String word =randWords[randomdNum];
		searchforLetter(word);

	}
	
	public static void searchforLetter(String str){
		Scanner scanner =new Scanner(System.in);
		
		boolean isRunnig = false;
		do{

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

		}while(isRunnig = !false);
		scanner.close();
	}
	

}
