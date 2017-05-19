package sheet4Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Ex5ClassNames2 {

	public static void main(String[] args) {

		String[] firstNames = {"Luca","Emmanuel","Jay","Darius","Vitalie","Gablriela","Pat","Ewellina","Asen","Damian","Agnes","James","Shane","Stephen","Janos","Kaven"};
		String[] lastNames = {"Luca1","Emmanuel1","Jay1","Darius1","Vitalie1","Gablriela1","Pat1","Ewellina1","Asen1","Damian1","Agnes1","James1","Shane1","Stephen1","Janos1","Kaven1"};
		
		
		for (int i = 0; i < firstNames.length; i++) {
			System.out.println(firstNames[i]+" "+ lastNames[i]);
		}

		String [] fullName = new String[firstNames.length];
		
		//A loop to populate the fullNames array, I can't use the enhance for loop here
		for (int i = 0; i < fullName.length; i++) {
			fullName[i] = firstNames[i]+lastNames[i];
		}
		
		System.out.println(" ******The enhance for loop *******");

			for (String name : fullName) {
				System.out.println(name);
			}
			
			Arrays.sort(fullName);
			System.out.println("##### sorted #######");
			for (String name : fullName) {
				System.out.println(name);
			}
	}

}
