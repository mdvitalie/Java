package sheet17ArrayLists;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2TraineesMain {

	public static void main(String[] args) {

		Ex2Trainees t1 = new Ex2Trainees("Duglas Vendora", "20 Bessington Street Dublin", LocalDate.of(2001, Month.MARCH, 25));
		Ex2Trainees t2 = new Ex2Trainees("Alles Dragoshanu", "2 Luna Street Dublin", LocalDate.of(1995, Month.AUGUST, 1));
		Ex2Trainees t3 = new Ex2Trainees("Alven Espasito", "21 Brgon Street London Uk", LocalDate.of(1988, Month.NOVEMBER, 15));

		ArrayList<Ex2Trainees> traineeList = new ArrayList<>();
		traineeList.add(t1);
		traineeList.add(t2);
		traineeList.add(t3);

		System.out.println(traineeList);
		System.out.println("\n----------------------");
		traineeList.get(0).setName("Dimon Abramos");
		System.out.println(traineeList);

		Ex2Trainees t3Copy = new Ex2Trainees("Alven Espasito", "21 Brgon Street London Uk", LocalDate.of(1988, Month.NOVEMBER, 15));
		System.out.println("\n TraineeList contens a Copy with same info: "+traineeList.contains(t3Copy));

		System.out.println("\n------------------------------------\n");
		changeTraineeList(traineeList);

		//Scanner scanner = new Scanner(System.in);


	}


	//Method
	public static void changeTraineeList(ArrayList<Ex2Trainees> traineeList){
		try(Scanner scanner =new Scanner(System.in)){


//			System.out.print("Change somebody's address :");
//				String changeAddress =scanner.nextLine().trim();
//				System.out.print("Position: ");
//				int position = scanner.nextInt();
//				System.out.print("Type a new address: ");
//				String newAddress = scanner.nextLine().trim();
//				 traineeList.get(position).setAddress(newAddress);
//
//				System.out.println(traineeList);
				
			/*
			 * Prompting the user to enter a name.
			 * Loop through the Trainees in the array list, 
			 * if the name is found, print thats the person’s birthday.
			 * */

			System.out.print("Type a name: ");
			String userInput = scanner.nextLine();
			System.out.println("The name you typed is: " + userInput);

			boolean isFound =false;
			for (int i = 0; i < traineeList.size(); i++) {
				
				
				if(traineeList.get(i).getName().equals(userInput)){
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					System.out.println("The persons birthday is: "+traineeList.get(i).getBirthday().format(formatter));
					isFound=true;
					
					//traineeList.remove(traineeList.get(i));
					//System.out.println("The ["+ userInput +"] was removed from the list\n");
					System.out.println("\nCorent list: "+ traineeList);
				}
				
				

			}
			if(!isFound){
				System.out.println("Sorry not such name on the list");
				isFound=false;


			}
			
			//remove a name
			System.out.print("\nType a name: ");
			String userInput1 = scanner.nextLine();
			System.out.println("The name you typed is: " + userInput);

			boolean isFound1 =false;
			for (int i = 0; i < traineeList.size(); i++) {
				
				
				if(traineeList.get(i).getName().equals(userInput)){
					/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					System.out.println("The persons birthday is: "+traineeList.get(i).getBirthday().format(formatter));
					isFound1=true;*/
					
					traineeList.remove(traineeList.get(i));
					System.out.println("The ["+ userInput +"] was removed from the list\n");
					System.out.println("\nCorent list: "+ traineeList);
				}
				
				

			}
			if(!isFound1){
				System.out.println("Sorry not such name on the list");
				isFound1=false;


			}
			System.out.println("The end");

		}
	}

}
