package sheet17ArrayLists;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

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
		//		nameList.add(s1);
		//		nameList.add(s2);
		//		nameList.add(s3);
		//		nameList.add(s4);
		//		nameList.add(s5);
		//		nameList.add(s6);
		//		nameList.add(s7);
		//		nameList.add(s8);
		//		nameList.add(s9);
		//		nameList.add(s10);
		//		nameList.add(s11);
		//		nameList.add(s12);
		//		nameList.add(s13);
		//		nameList.add(s14);
		//		nameList.add(s15);
		//		nameList.add(s16);
		//		nameList.add(s17);


		String [] allNames = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17};

		nameList.addAll(Arrays.asList(allNames));

		searchforName(nameList);

	}

	//Method
	public static void searchforName(ArrayList<String> nameList){
		try(Scanner scanner =new Scanner(System.in)){


			System.out.print("Search for a name :");
			String searchName =scanner.nextLine().trim();

			//			//String class has a split() method which splits up a String into a String array (this might be useful for doing a word count). 
			//			String[] words = names.split(" ");
			//			System.out.println("Number of Words: "+ words.length);



			boolean isFound = false;

			for(int i =0; i<nameList.size(); i++){

				if(nameList.get(i).equals(searchName)){

					//int position = str.indexOf(searchChar);
					System.out.println("[ "+searchName +" ] was found at position : " + (i+1));
					isFound = true;

				}
				//				else{
				//				}

			}
			if(!isFound){
				System.out.println("[ "+searchName +" ] was not found");
			}


			System.out.println("------------------------------------\n");
			System.out.println("The list with names.");
			System.out.println("\n"+nameList+"\n");

			System.out.print("Please remove a name from the list :");
			String removeName = scanner.nextLine().trim();

			//removing a name from the list
			for(int i =0; i<nameList.size(); i++){


				if(nameList.get(i).equals(removeName)){

					//int position = str.indexOf(searchChar);
					System.out.println("\n[ "+removeName +" ] has been removed from the list " +nameList.remove(removeName));
					isFound = true;
					break;


				}
			}
			if(!isFound){
				System.out.println("Sorry not such name on the list");
				isFound=false;


			}

			//System.out.println("the name " + removeName +" was successfully removed ");

			System.out.println("------------------------------------");
			System.out.println("The list with removed name.");
			System.out.println("\n"+nameList);

			System.out.println("------------------------------------\n");
			System.out.print("Change sombody's name:");
			String changeName1= scanner.nextLine().trim();
			int position = nameList.indexOf(changeName1);

			System.out.print("to :");
			String changeName2 = scanner.nextLine().trim();
			//int  position2 =nameList.indexOf(changeName2);



			System.out.println(nameList.set(position, changeName2)+" was changed name to "+ changeName2);
			System.out.println("\n"+nameList);
			System.out.println("Number of names: " +nameList.size());

			System.out.println("------------------------------------");
			System.out.println("Sorted the array names.");
			Collections.sort(nameList);
			System.out.println("\n"+nameList);

			System.out.println("------------------------------------");
			System.out.print("remove the name at position: ");
			int removePosNum = scanner.nextInt();
			String nameRemove = nameList.remove(removePosNum-1);

			System.out.println("You just removed from the list names: "+ nameRemove);
			System.out.println("------------------------------------");
			System.out.print("Insert a name to the list: ");

			//scanner.next();
			String insertName =scanner.next()+ scanner.nextLine().trim();
			System.out.print("Position: ");
			int inserPosition = scanner.nextInt();
			nameList.add(inserPosition-1, insertName);
			System.out.println("\n"+ nameList);

			System.out.println("------------------------------------");
			System.out.println("Inseted Name is :" + insertName);

			System.out.println("------------------------------------");
			System.out.println("\n"+ nameList);
			System.out.println(nameList.isEmpty() ? "The list is empty" : "The list is not empty");

			nameList.clear();
			System.out.println("Empty list "+nameList);
			System.out.println("------------------------------------");
			System.out.println(nameList.isEmpty() ? "The list is empty" : "The list is not empty");
		}

	}
}
