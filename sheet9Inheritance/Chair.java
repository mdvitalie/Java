package sheet9Inheritance;

public class Chair extends Furniture {

	//member variable
	private Expandable_Yes_No hasGaslift;
	private String type;
	
	//Static / class variables
	public static int chairCounter=985;
	
	public static final String YES = "YES";
	public static final String NO = "NO";
	
	public Chair(){
		chairCounter++;
	}
	
	public Chair(String colour, String materialType,Expandable_Yes_No hasGaslift,String type){
		this();
		setColour(colour);
		setMaterialType(materialType);
		this.hasGaslift = hasGaslift;
		this.type = type;
		
	}

	/**
	 * @return the hasGaslift
	 */
	public Expandable_Yes_No isHasGaslift() {
		return hasGaslift;
	}

	/**
	 * @param hasGaslift the hasGaslift to set
	 */
	public void setHasGaslift(Expandable_Yes_No hasGaslift) {
		this.hasGaslift = hasGaslift;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("\n\tCHAIR");
		System.out.println("---------------------");
		return " Chair number: "+chairCounter + "\n\n"+super.toString()+
				"\n Has gas lift: " + hasGaslift + 
				"\n type: " + type;
	}
	
	
}
