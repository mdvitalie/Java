package sheet5CreatingClasses;

public class Exe2DogMainClass {

	public static void main(String[] args) {
		
		//Exe2DogClass dog = new Exe2DogClass();
		
		/*dog.setBreed("Siberian Husky");
		dog.setColour("Sable");
		dog.setOwnerName("Vladimir Putin");
		
		
		System.out.println("\n\tDog class\n");
		System.out.println("Breed: "+dog.getBreed());
		System.out.println("Colour: "+dog.getColour());
		System.out.println("Owner's name: "+dog.getOwnerName());
		

		System.out.println("\nDog class 2\n");
		Exe2DogClass dog2 = new Exe2DogClass("Siberian Husky","Agouti","Adriano celentano",2);
		System.out.println(dog2);
		Exe2DogClass dog3 = new Exe2DogClass();
		
		dog3.setBreed("Canadian Husky");
		dog3.setAge(2);
		System.out.println("\nBreed: "+dog2.getBreed());
		System.out.println("Age: "+dog2.getAge()+ " years old");*/
		
		Exe2DogClass dog2 = new Exe2DogClass();
		dog2.setBreed(Exe2DogClass.LABRADOR);
		dog2.setColour("Golden");
		dog2.setOwnerName("Mr. Chelentano");
		dog2.setAge(2);
		System.out.println("Breed: " + dog2.getBreedAsString());
		System.out.println("Colour: "+ dog2.getColour());
		System.out.println("Age: " + dog2.getAge()+" years old");
		System.out.println("Owner's name: " + dog2.getOwnerName());
		System.out.println("Counter : "+ Exe2DogClass.dogCounter);
		
		
		System.out.println();
		Exe2DogClass dog3 = new Exe2DogClass(Exe2DogClass.HUSKY,"Brown","Mr.Putin",3);
		System.out.println(dog3);
		System.out.println("Counter : "+ Exe2DogClass.dogCounter);
		
		
		System.out.println();
		Exe2DogClass dog4 = new Exe2DogClass(Exe2DogClass.BOXER,"Golden brown","Mr. faraje",6);
		System.out.println(dog4);
		System.out.println("Counter : "+ Exe2DogClass.dogCounter);
	}

}
