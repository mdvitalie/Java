package sheet9Inheritance;

public class Furniture {
	//member variable 
	private String colour;
	private String materialType;
	
	
	public Furniture() {
		
	}


	public Furniture(String colour, String materialType) {
		this();
		this.colour = colour;
		this.materialType = materialType;
	}


	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}


	/**
	 * @return the materialType
	 */
	public String getMaterialType() {
		return materialType;
	}


	/**
	 * @param materialType the materialType to set
	 */
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Colour: " + colour + 
				"\n Material type: " + materialType;
	}
	
	
	
}
