package sheet10Inheritance;

public class Rectangle extends Shape {
	
	//member variable
	private double heigth;
	private double width;
	private double area;
	
	
	public Rectangle() {
		
	}


	public Rectangle(String colour,double heigth, double width) {
		super(colour);
		this.heigth = heigth;
		this.width = width;
	}
	
	

}
