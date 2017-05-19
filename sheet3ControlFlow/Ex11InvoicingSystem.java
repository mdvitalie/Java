package sheet3ControlFlow;
import java.util.Scanner;
public class Ex11InvoicingSystem{
	public static void main(String[]args){
		
		//Declaring Scanner
		Scanner scan = new  Scanner(System.in);
		
		Ex11InvoicingSystem ex11 = new Ex11InvoicingSystem();
		
		System.out.print(" Enter the product name: ");
		String product = scan.nextLine();
		
		System.out.print(" Quantity: ");
		int quantity = scan.nextInt();
		
		System.out.print(" Price €; ");
		double price = scan.nextDouble();
		

		//String product = "Bananas";
		//int quantity = 5;
		//double price = 2.50;
		ex11.getTotalOrder(product,quantity,price);
		
		scan.close();
		
	}
	
	private void getTotalOrder(String product, int quantity, double price){
		
		double total;
		
			System.out.println("\n Product : "+ product);
			System.out.println(" Quantity : "+ quantity);
			System.out.println(" Price per Kg: " + price);
			total = quantity * price;
			System.out.println(" Total is: " + total);
		
			
		if(quantity > 100 ){
			//price = 100/.25;
			price *= 0.75;
			total = quantity * price;
			System.out.println("\n Over 100 units you get a descount 25%");
			System.out.printf(" Total of your purces is:%.2f\n ", total);
			
		}else{
			total = quantity * price;
			System.out.println(" Sorry you are not geting a descount, you have less than 100 units");
			System.out.printf(" Total of your purces is: %.2f\n", total);
		}
		
		
		
		
		
	}
}