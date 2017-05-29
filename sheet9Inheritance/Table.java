package sheet9Inheritance;

public class Table extends Furniture {

	//member variable
	private Expandable isExpandable;
	private Shape shape;
	
	//Static / class variables
	public static int tableCounter=333;
	
	public Table() {
		tableCounter++;
	}

	public Table(Colour colour, MaterialType materialType,Expandable isExpandable, Shape shape) {
		this();
		setColour(colour);
		setMaterialType(materialType);
		this.isExpandable = isExpandable;
		this.shape = shape;
	}

	/**
	 * @return the isExpandable
	 */
	public Expandable isExpandable() {
		return isExpandable;
	}

	/**
	 * @param isExpandable the isExpandable to set
	 */
	public void setExpandable(Expandable isExpandable) {
		this.isExpandable = isExpandable;
	}

	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
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
				"\n Expandable table: " + isExpandable.toString().toString().toLowerCase() +
				"\n Shape: " + shape.toString().toLowerCase();
		
	}
	
	
	
	
}
