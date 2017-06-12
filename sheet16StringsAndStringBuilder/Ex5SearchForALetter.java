package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {

	public static void main(String[] args) {

		Ex5SearchForALetter ex5 = new Ex5SearchForALetter();

		Scanner scanner =new Scanner(System.in);

		System.out.print("Type a word : ");
		String usInput = scanner.nextLine();

		ex5.searchforLetter(usInput);
		//System.out.println(chreturn);

	}

	//Method
	public void searchforLetter(String str){
		Scanner scanner =new Scanner(System.in);
		System.out.print("Search for a charater :");


		String searchChar =scanner.nextLine();
		char [] letters = searchChar.toCharArray();
		

		for(int i =0; i<letters.length; i++){
			
			if(str.contains(searchChar)){
				int position = str.indexOf(searchChar);
			
				System.out.println("[ "+searchChar +" ] was found at position : " +( i+ (position +1)));


			}else{
				System.out.println("[ "+searchChar +" ] was not found");
			}

		}

		scanner.close();
	}
}
