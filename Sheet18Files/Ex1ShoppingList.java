package Sheet18Files;

import java.util.Scanner;

public class Ex1ShoppingList {

	public static void main(String[] args) {
		
		//Declaring Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Add a product");
		System.out.println("2) Read a product");
		System.out.println("3) Exit");
		System.out.println("================\n");
		System.out.print("Pick a number :");
		
		int userInput = scanner.nextInt();
		boolean isRanning = true;  
		
		switch(userInput){
		case 1:
			System.out.print("Type a product and price: ");
			String prodInput = scanner.next()+scanner.nextLine();
			System.out.println(prodInput);
			break;
		case 2:
			System.out.println("Products");
			break;
		case 3:
			System.out.println("Thank you and goodbay");
			default:
			break;
		}

	}

}
