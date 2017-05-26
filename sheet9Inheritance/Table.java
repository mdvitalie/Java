package sheet9Inheritance;

public class Table extends Furniture {

	//member variable
	private boolean isExpandable;
	private String shape;
	
	//Static / class variables
	public static int tableCounter=333;
	
	public Table() {
		tableCounter++;
	}

	public Table(String colour, String materialType,boolean isExpandable, String shape) {
		this();
		setColour(colour);
		setMaterialType(materialType);
		this.isExpandable = isExpandable;
		this.shape = shape;
	}

	/**
	 * @return the isExpandable
	 */
	public boolean isExpandable() {
		return isExpandable;
	}

	/**
	 * @param isExpandable the isExpandable to set
	 */
	public void setExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}

	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("\n\tTABLE");
		System.out.println("---------------------");
		return " Table number: " +tableCounter +"\n\n"+super.toString()+
				"\n Expandable table: " + isExpandable +
				"\n Shape: " + shape;
		
	}
	
	
	
	
}
