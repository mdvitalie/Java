package sheet4Arrays;

import java.util.Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {
		Ex5ClassNames ex5 = new Ex5ClassNames();

		String[] firstNames = {"Luca","Emmanuel","Jay","Darius","Vitalie","Gablriela","Pat","Ewellina","Asen","Damian","Agnes","James","Shane","Stephen","Janos","Kaven"};
		String[] lastNames = {"Luca1","Emmanuel1","Jay1","Darius1","Vitalie1","Gablriela1","Pat1","Ewellina1","Asen1","Damian1","Agnes1","James1","Shane1","Stephen1","Janos1","Kaven1"};
	
		Arrays.sort(firstNames);
		
		ex5.printNames(firstNames,"First name: ");
		ex5.printNames(lastNames, "Last name: ");
		ex5.fullNames(firstNames,lastNames);


	}//main
	//Prints First Name
	private void printNames(String[] names, String message){
		for(int i=0; i<names.length;++i){
			System.out.println(message+names[i]);
		}
		System.out.println();
	}
	
	/*private void printNames(String[] names){
		for(int i=0; i<names.length;++i){
			System.out.println("First name: "+names[i]);
		}
		System.out.println();
	}*/
	
	//Prints Last Name
	/*private void printlNames(String[] names){
		for(int i=0; i<names.length;++i){
			System.out.println("Last name: "+names[i]);
		}
		System.out.println();
	}*/
	
	//Prints Full Name
	private void fullNames(String[] firstName, String[] lastName){
		for(int i=0; i<firstName.length; ++i){
			System.out.println("Full name : "+ firstName[i]+ " "+lastName[i]);
		}
	}



}//class
