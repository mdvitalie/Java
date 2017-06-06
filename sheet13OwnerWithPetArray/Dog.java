package sheet13OwnerWithPetArray;

public class Dog extends Pet implements Mammal {
	
	
	//member variable
	private String microChipNumber= "Not set yet";
	private MicroChipeed isMicroChipped;
	
	
/*	public enum MicroChipeed{
			IS_MICRO_CHIPEDD,
			IS_NOT_MICRO_CHIPEED
		
	}
	*/
	
	



	public Dog(String name, String breed, int age, Colour colour, Gender isFemale) {
		super(name, breed, age, colour, isFemale);
		
	}
	
	

	public Dog(String name, String breed, int age, Colour colour, Gender isFemale, String microChipNumber,
			MicroChipeed isMicroChipped) {
		super(name, breed, age, colour, isFemale);
		setMicroChipNumber(microChipNumber);
		//this.microChipNumber = microChipNumber;
		//this.isMicroChipped = isMicroChipped;
	}

	
	


	
	public String getMicroChipNumber() {
		return microChipNumber;
	}



	
	public void setMicroChipNumber(String microChipNumber) {
		//this.microChipNumber =true;
		this.microChipNumber = microChipNumber;
	}



	
	public MicroChipeed isMicroChipped() {
		return isMicroChipped;
	}



	
	public void setMicroChipped(MicroChipeed isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}



	@Override
	public void walk() {
		System.out.println(getName()+"is going for a walk");

	}

	@Override
	public void sleep() {
		System.out.println(getName()+"is sleeping");

	}

	@Override
	public String getTypeOfAnimal() {
		
		return " Dog";
	}



	
	/*@Override
	public String toString() {
		return super.toString() +
				"\n Dog microChipNumber: " + microChipNumber + 
				"\n Micro Chipped: " + isMicroChipped.toString().replace("_", " ").toLowerCase();
	}*/
	
	

}
