package sheet13OwnerWithPetArray;

public class Hamster extends Pet implements Mammal {

	public Hamster(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
		
	}

	@Override
	public void walk() {
		System.out.println("The Hamster runs");

	}

	@Override
	public void sleep() {
		System.out.println("The Hamster sleeps");

	}

	@Override
	public String getTypeOfAnimal() {
		
		return "Hamster";
	}

}
