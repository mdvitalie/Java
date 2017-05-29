package sheet9Inheritance;

public abstract class Furniture {
	//member variable 
	private Colour colour;
	private MaterialType materialType;	
	
	protected enum Colour{RED,BLUE,GREEN,BLACK,GREY,WITHE,YELLOW,BROW}
	
	//STATIC COUNTER
	public static int counter;
	
	

	
	public Furniture() {
		counter++;
	}


	public Furniture(Colour colour, MaterialType materialType) {
		this();
		this.colour = colour;
		this.materialType = materialType;
	}


	/**
	 * @return the colour
	 */
	public Colour getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}


	/**
	 * @return the materialType
	 */
	public MaterialType getMaterialType() {
		return materialType;
	}


	/**
	 * @param materialType the materialType to set
	 */
	public void setMaterialType(MaterialType materialType) {
		this.materialType = materialType;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Colour: " + colour.toString().toLowerCase() + 
				"\n Material type: " + materialType.toString().toLowerCase();
	}
	
	
	
}
