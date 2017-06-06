package sheet13OwnerWithPetArray;

public class Hamster extends Pet implements Mammal {

	public Hamster(String name, String breed, int age, Colour colour, Gender isFemale) {
		super(name, breed, age, colour, isFemale);
		//getTypeOfAnimal();
		
	}

	@Override
	public void walk() {
		System.out.println(getName()+" is going for a walk.");

	}

	@Override
	public void sleep() {
		System.out.println(getName()+" is sleeping.");

	}

	@Override
	public String getTypeOfAnimal() {
		
		return " Hamster";
	}

}
