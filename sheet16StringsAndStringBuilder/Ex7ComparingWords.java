package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex7ComparingWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	

		System.out.println("Compering two words");
		System.out.print("\nType the first word: ");
		String fWord = scan.nextLine();

		System.out.print("Type the second word: ");
		String sWord = scan.nextLine();


		comparingWords(fWord,sWord);
		scan.close();

	}

	public static void comparingWords(String fWord, String sWord ){

		int result = fWord.compareTo(sWord);
		System.out.println("the resulr: "+ result);
		if(result<0){
			System.out.println(fWord+" presedes "+ sWord);
		}else{
			System.out.println(sWord + " presedes " +fWord);
		}

		for(char i='a';i<'z'; i++){
			System.out.print(i +"|");
		}


	}
}