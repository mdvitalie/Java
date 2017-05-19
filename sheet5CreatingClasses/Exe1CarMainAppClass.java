package sheet5CreatingClasses;

import java.util.Scanner;

public class Exe1CarMainAppClass {

	public static void main(String[] args) {
		
		
		//Decalring Scanner
		Scanner scan = new Scanner(System.in);
		
		Exe1CarClass car = new Exe1CarClass();
		
		System.out.print("\nEntern the car make: ");
		String user = scan.nextLine();
		
		System.out.print("Entern the car model: ");
		String user2 = scan.nextLine();
		
		
		System.out.print("Entern engine size: ");
		double user3 = scan.nextDouble();
		System.out.println();
		
		
		//Closing the Scanner
		scan.close();
		

		car.setMake(user);
		car.setModel(user2);
		car.setEngineSize(user3);
		
//		car.setMake("Lancia");
//		car.setModel("Delta");
//		car.setEngineSize(3.6);
		
		System.out.println("Car make: "+ car.getMake());
		System.out.println("Car model: " + car.getModel());
		System.out.println("Engen size: " + car.getEngineSize()+"l");
		
	System.out.println();
		Exe1CarClass car2= new Exe1CarClass("Ford","Mondeo", 2.0);
		System.out.println(car2);
		
		System.out.println();
		Exe1CarClass car3=new Exe1CarClass("Audi","Q7",1.5);
		System.out.println(car3);
		
		Exe1CarClass car4 = new Exe1CarClass();
		car4.setMake("GAZ");
		car4.setModel("Volga");
		car4.setEngineSize(2.5);
		
		System.out.println();
		System.out.println("Make: "+car4.getMake());
		System.out.println("Model: "+car4.getModel());
		System.out.println("Engen size: "+car4.getEngineSize());
		
		

		
		

	}

}
