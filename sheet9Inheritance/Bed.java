package sheet9Inheritance;

public class Bed extends Furniture {

	//member variable
	private boolean hasHeadboard;
	private String size;
	
	
	 Bed() {
		 
	}


	public Bed(String colour, String materialType,boolean hasHeadboard, String size) {
		this();
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
		return "\n Has Head board: " + hasHeadboard + 
				"\n Size=" + size;
	}
	
	
	
	
}
