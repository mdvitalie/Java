package sheet10Inheritance;

public class Rectangle extends Shape {
	
	//member variable
	private double heigth;
	private double width;
	private double area;
	
	public static int rectangleCounter = 213;
	
	
	public Rectangle() {
		rectangleCounter++;
	}


	public Rectangle(String colour,double heigth, double width) {
		super(colour);
		this.heigth = heigth;
		this.width = width;
	}


	/**
	 * @return the heigth
	 */
	public double getHeigth() {
		return heigth;
	}


	/**
	 * @param heigth the heigth to set
	 */
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}


	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	
	//Method draw()
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nColour: "+ getColour() +
				"Heigth: " + heigth + 
				"\n Width=" + width + 
				"\n Area=" + area;
	}

	
	
}
