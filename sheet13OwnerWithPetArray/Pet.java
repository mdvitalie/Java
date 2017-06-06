package sheet13OwnerWithPetArray;

public abstract class Pet {
	
	private String name;
	private String breed;
	private int age;
	private Colour colour;
	private Gender isFemale;
	
	//static variables
	public static final boolean MALE = false;
	public static final boolean FEMALE = true;
	
	
	public Pet(String name, String breed, int age, Colour colour, Gender isFemale) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
	}


	
	public String getName() {
		return name;
	}


	
	public void setName(String name) {
		this.name = name;
	}


	
	public String getBreed() {
		return breed;
	}


	
	public void setBreed(String breed) {
		this.breed = breed;
	}


	
	public int getAge() {
		return age;
	}


	
	public void setAge(int age) {
		this.age = age;
	}


	
	public Colour getColour() {
		return colour;
	}


	
	public void setColour(Colour colour) {
		this.colour = colour;
	}


	
	public Gender isFemale() {
		return isFemale;
	}


	
	public void setFemale(Gender isFemale) {
		this.isFemale = isFemale;
	}

	
	//abstract method
	public abstract String getTypeOfAnimal();


	@Override
	public String toString() {
		
		//String text = "\n"+ getName()+ " is a " + ((isFemale()) ? "female " : "male ")+ getTypeOfAnimal();
		String text = "\n"+ getName().toUpperCase()+ " is a " + getTypeOfAnimal();
		text += "\nBreed is " + breed;
		text += "\nAge is " + age;
		text += "\nColour is " + colour.toString().toLowerCase();
		return text;
		
		/*return "\n\n Animal type: " + getTypeOfAnimal()+ 
				"\n Pet name: " + name + 
				"\n Breed: " + breed + 
				"\n Age: " + age + 
				"\n Colour: " + colour +
				"\n Gender: "+ isFemale.toString().toLowerCase()
				;*/
		
		
	}
	
	
	
	

}
