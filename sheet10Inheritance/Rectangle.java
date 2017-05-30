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


	public Rectangle(Colour colour,double heigth, double width) {
		super(colour);
		setHeigth(heigth);
		setWidth(width);
		//getArea();
		//this.area = area;
		
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
		area= width * heigth;
		return area;
	}
	
	//Method draw()
	public void draw(){
		System.out.printf(" Drawing a %.2f * %.2f %s Rectangle\n",heigth,width,getColour());
		//System.out.println("----------------------");
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Ractangle: " + super.toString()+
				"\n Heigth: " + heigth + 
				"\n Width: " + width + 
				"\n Area: " + getArea()+ "cm2"+
				String.format("\n Rectangle counter : %03d ", rectangleCounter);
	}
	
/*	@Override
	public String toString() {
		return " Colour: "+ getColour() +
				"\n Heigth: " + heigth + 
				"\n Width: " + width + 
				"\n Area: " + getArea()+
				String.format("\n Rectangle counter : %03d ", rectangleCounter);
	}
*/
	
	
}
