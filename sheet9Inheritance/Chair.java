package sheet9Inheritance;

public class Chair extends Furniture {

	//member variable
	//private Expandable_Yes_No hasGaslift;
	private Expandable hasGaslift;
	private TypeOfChair typeOfChair;
	
	//Static / class variables
	public static int chairCounter=985;
	
	public static final String YES = "YES";
	public static final String NO = "NO";
	
	public Chair(){
		chairCounter++;
	}
	
	public Chair(Colour colour, MaterialType materialType,Expandable hasGaslift,TypeOfChair typeOfChair){
		this();
		setColour(colour);
		setMaterialType(materialType);
		this.hasGaslift = hasGaslift;
		this.typeOfChair = typeOfChair;
		
	}

	/**
	 * @return the hasGaslift
	 */
	public Expandable isHasGaslift() {
		return hasGaslift;
	}

	/**
	 * @param hasGaslift the hasGaslift to set
	 */
	public void setHasGaslift(Expandable hasGaslift) {
		this.hasGaslift = hasGaslift;
	}

	/**
	 * @return the type
	 */
	public TypeOfChair getType() {
		return typeOfChair;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeOfChair typeOfChair) {
		this.typeOfChair = typeOfChair;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("\n\tCHAIR");
		System.out.println("---------------------");
		return " Chair number: "+chairCounter + "\n\n"+
		super.toString()+
				"\n Has gas lift: " + hasGaslift.toString().toLowerCase() + 
				"\n Type of chair: " + typeOfChair.toString().toLowerCase().replace('_',' ');
	}
	
	
}
