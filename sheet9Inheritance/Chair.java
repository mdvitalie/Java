package sheet9Inheritance;

public class Chair extends Furniture {

	//member variable
	private boolean hasGaslift;
	private String type;
	
	public Chair(){
		
	}
	
	public Chair(String colour, String materialType,boolean hasGaslift,String type){
		this();
		this.hasGaslift = hasGaslift;
		this.type = type;
		
	}

	/**
	 * @return the hasGaslift
	 */
	public boolean isHasGaslift() {
		return hasGaslift;
	}

	/**
	 * @param hasGaslift the hasGaslift to set
	 */
	public void setHasGaslift(boolean hasGaslift) {
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
		return "Chair has gas lift: " + hasGaslift + 
				"\n type=" + type;
	}
	
	
}
