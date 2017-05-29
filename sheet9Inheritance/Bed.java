package sheet9Inheritance;

public class Bed extends Furniture {

	//member variable
	private Expandable hasHeadboard;
	private BedSize size;
	
	//Static / class variables
		public static int bedCounter=520;
	
	
	 Bed() {
		 bedCounter++;
	}


	public Bed(Colour colour, MaterialType materialType,Expandable hasHeadboard, BedSize size) {
		//this();
		//setColour(colour);
		//setMaterialType(materialType);
		super(colour,materialType);
		bedCounter++;
		this.hasHeadboard = hasHeadboard;
		this.size = size;
	}


	/**
	 * @return the hasHeadboard
	 */
	public Expandable isHasHeadboard() {
		return hasHeadboard;
	}


	/**
	 * @param hasHeadboard the hasHeadboard to set
	 */
	public void setHasHeadboard(Expandable hasHeadboard) {
		this.hasHeadboard = hasHeadboard;
	}


	/**
	 * @return the size
	 */
	public BedSize getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(BedSize size) {
		this.size = size;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("\n\tBED");
		System.out.println("---------------------");
		return "\n Bed number: " +bedCounter +"\n\n"+super.toString() + "\n Headboard: " + hasHeadboard.toString().toLowerCase() + 
				"\n Size: " + size.toString().toLowerCase();
	}
	
	
	
	
}
