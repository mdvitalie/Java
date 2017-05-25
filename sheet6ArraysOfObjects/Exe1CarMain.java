package sheet6ArraysOfObjects;


public class Exe1CarMain {

	
	public static void main(String[] args) {

		/*Exe1CarClass car = new Exe1CarClass();
		System.out.println(car);*/
		
		Exe1CarClass[] cars = {new Exe1CarClass("Audi","Q7", 2.0), 
							new Exe1CarClass("Ford","Mondeo",1.8),
							new Exe1CarClass("BMW","BMW 5 series", 2.5),
							new Exe1CarClass("Honda","Civic", 1.4)};
		 printCars(cars);
	}

	public static void printCars(Exe1CarClass[] carArrays){
		
		for(Exe1CarClass printCar : carArrays){
			System.out.print(printCar+" ");
			System.out.println("\n-----------------------------------\n");
		}
		
	}
}
