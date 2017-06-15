package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex8CharacterAndWordCount {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Type a sentence: ");
		String userSentence = scan.nextLine();
		
		//Scanner close
		scan.close();
		
		//String class has a split() method which splits up a String into a String array (this might be useful for doing a word count). 
		String[] words = userSentence.split(" ");
		System.out.println("Number of Words: "+ words.length);
		
		char[] letters = userSentence.toCharArray();
		
		System.out.print("Characters(with spaces): "+letters.length);
//		for(int i=0; i<letters.length;i++){
//			System.out.print(letters[i]+"|");
//			
//		}
		
		System.out.println("\nCharacters (without spaces): " +userSentence.replace(" ", "").length());
	}
}
