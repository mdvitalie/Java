package sheet13OwnerWithPetArray;

public class Cat extends Pet implements Mammal {

	//member variable
	private int numOfLives =9;
	private String microChipNumber;
	private MicroChipeed isMicroChipped;
	
	

	//public Cat(){}
	


	/*	public Cat(String name, String breed, int age, Colour colour, Gender isFemale) {
		super(name, breed, age, colour, isFemale);
	}
*/
	


	public Cat(String name, String breed, int age, Colour colour, Gender isFemale, int numOfLives, String microChipNumber,
			MicroChipeed isMicroChipped) {
		super(name, breed, age, colour, isFemale);
		this.numOfLives = numOfLives;
		this.microChipNumber = microChipNumber;
		this.isMicroChipped = isMicroChipped;
	}






	public String getMicroChipNumber() {
		return microChipNumber;
	}



	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}



	public MicroChipeed isMicroChipped() {
		return isMicroChipped;
	}



	public void setMicroChipped(MicroChipeed isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}

	public int getNumOfLives() {
		return numOfLives;
	}


	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}



	@Override
	public void walk() {
		System.out.println(getName()+" is going for a walk.");

	}



	@Override
	public void sleep() {
		System.out.println(getName()+" is  speeping.");

	}


	@Override
	public String getTypeOfAnimal() {
		return " Cat";

	}




	public void justLostAlife(){
		numOfLives--;
	}







	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+
				"\nNum of Lives: " + numOfLives +
				"\nMicro ChipNumber: "+ microChipNumber;
	}




}
