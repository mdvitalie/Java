package sheet13OwnerWithPetArray;

public class Snake extends Pet {

	public Snake(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
	}

	public String getTypeOfAnimal(){
		return " Snake";
	}
	
@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal();
	}
	
}
