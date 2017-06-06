package sheet13OwnerWithPetArray;

public abstract class Pet {
	
	private String name;
	private String breed;
	private int age;
	private String Colour;
	private boolean isFemale;
	
	//ENUMS
	public enum Gender{FEMALE,
						MALE
						};
	
	
	public Pet(String name, String breed, int age, String colour, boolean isFemale) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		Colour = colour;
		this.isFemale = isFemale;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}


	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the colour
	 */
	public String getColour() {
		return Colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		Colour = colour;
	}


	/**
	 * @return the isFemale
	 */
	public boolean isFemale() {
		return isFemale;
	}


	/**
	 * @param isFemale the isFemale to set
	 */
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}

	
	//abstract method
	public abstract String getTypeOfAnimal();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet name: " + name + ", breed: " + breed + ", age: " + age + ", Colour: " + Colour + ", isFemale: "
				+ isFemale;
	}
	
	
	
	

}
