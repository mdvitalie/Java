package sheet13OwnerWithPetArray;

public class Dog extends Pet implements Mammal {
	
	
	//member variable
	private String microChipNumber;
	private boolean isMicroChipped;
	
	
	



	public Dog(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
		
	}
	
	

	public Dog(String name, String breed, int age, String colour, boolean isFemale, String microChipNumber,
			boolean isMicroChipped) {
		super(name, breed, age, colour, isFemale);
		this.microChipNumber = microChipNumber;
		this.isMicroChipped = isMicroChipped;
	}

	
	


	/**
	 * @return the microChipNumber
	 */
	public String getMicroChipNumber() {
		return microChipNumber;
	}



	/**
	 * @param microChipNumber the microChipNumber to set
	 */
	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}



	/**
	 * @return the isMicroChipped
	 */
	public boolean isMicroChipped() {
		return isMicroChipped;
	}



	/**
	 * @param isMicroChipped the isMicroChipped to set
	 */
	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}



	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTypeOfAnimal() {
		
		return "Animal type : Dog";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() +"Dog microChipNumber: " + microChipNumber + 
				", isMicroChipped: " + isMicroChipped;
	}
	
	

}
