package sheet10Inheritance;

public class Circle extends Shape {
	
	//member variable
	private int radius;
	
	public Circle(){
		
	}
	
	public Circle(String colour, int radius){
		super(colour);
		this.radius=radius;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw(){
		System.out.println("It is a circle");
	}
	
	public String toString(){
		return "Colour : " + getColour()+
				"Radius : " + radius;
	}

}
