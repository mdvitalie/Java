package sheet17ArrayLists;

import java.util.ArrayList;

public class Ex1ArrayListOfStrings {

	public static void main(String[] args) {
		
//		String [] nAllNames = {"Shane","Emmanuel","Stephen","James","Janos","Kevin","Darius",
//				"Agnes","Gabriela","Damien","Sean","Asen","Ewelina","Ben","Luca","Vitalie"
//						};
		
		String s1 = "Shane";
		String s2 = "Emmanuel";
		String s3 = "Stephen";
		String s4 = "James";
		String s5 = "Janos";
		String s6 = "Jamie";
		String s7 = "Kevin";
		String s8 = "Darius";
		String s9 = "Agnes";
		String s10= "Gabriela";
		String s11 = "Damien";
		String s12 = "Sean";
		String s13 = "Asen";
		String s14 = "Ewelina";
		String s15 = "Ben";
		String s16 = "Luca";
		String s17 = "Vitalie";

		ArrayList<String> nameList = new ArrayList<>();
		nameList.add(s1);
		nameList.add(s2);
		nameList.add(s3);
		nameList.add(s4);
		nameList.add(s5);
		nameList.add(s6);
		nameList.add(s7);
		nameList.add(s8);
		nameList.add(s9);
		nameList.add(s10);
		nameList.add(s11);
		nameList.add(s12);
		nameList.add(s13);
		nameList.add(s14);
		nameList.add(s15);
		nameList.add(s16);
		nameList.add(s17);
		
		
		System.out.println(nameList.get(16));
		

	}

}
