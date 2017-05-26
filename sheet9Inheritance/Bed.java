package sheet9Inheritance;

public class Bed extends Furniture {

	//member variable
	private boolean hasHeadboard;
	private String size;
	
	//Static / class variables
		public static int bedCounter=520;
	
	
	 Bed() {
		 bedCounter++;
	}


	public Bed(String colour, String materialType,boolean hasHeadboard, String size) {
		this();
		setColour(colour);
		setMaterialType(materialType);
		this.hasHeadboard = hasHeadboard;
		this.size = size;
	}


	/**
	 * @return the hasHeadboard
	 */
	public boolean isHasHeadboard() {
		return hasHeadboard;
	}


	/**
	 * @param hasHeadboard the hasHeadboard to set
	 */
	public void setHasHeadboard(boolean hasHeadboard) {
		this.hasHeadboard = hasHeadboard;
	}


	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("\n\tBED");
		System.out.println("---------------------");
		return "\n Bed number: " +bedCounter +"\n\n"+super.toString() + "\n Head board: " + hasHeadboard + 
				"\n Size: " + size;
	}
	
	
	
	
}
