package sheet13OwnerWithPetArray;

public class Cat extends Pet implements Mammal {

	//member variable
	private int numOfLives;
	private String microChipNumber;
	private boolean isMicroChipped;



	/*	public Cat(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
	}

	 */


	public Cat(String name, String breed, int age, String colour, boolean isFemale, int numOfLives, String microChipNumber,
			boolean isMicroChipped) {
		super(name, breed, age, colour, isFemale);
		this.numOfLives = numOfLives;
		this.microChipNumber = microChipNumber;
		this.isMicroChipped = isMicroChipped;
	}



	public int getNumOfLives() {
		return numOfLives;
	}



	public String getMicroChipNumber() {
		return microChipNumber;
	}



	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}



	public boolean isMicroChipped() {
		return isMicroChipped;
	}



	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}



	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}



	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}



	@Override
	public void sleep() {
		System.out.println("The Cat speeps");

	}


	@Override
	public String getTypeOfAnimal() {
		return "Cat";

	}




	public void justLostAlife(){

	}







	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat num of Lives: " + numOfLives + ", toString(): " + super.toString();
	}




}
