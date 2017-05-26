package sheet9Inheritance;

public class Table extends Furniture {

	//member variable
	private boolean isExpandable;
	private String shape;
	
	public Table() {

	}

	public Table(String colour, String materialType,boolean isExpandable, String shape) {
		this();
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
		return "\nTable: " + isExpandable +
				"\n Shape: " + shape;
	}
	
	
	
	
}
