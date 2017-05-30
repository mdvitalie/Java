package sheet10Inheritance;

public class Circle extends Shape {
	
	//member variable
	private int radius;
	public static int circleCounter=0;
	
	public Circle(){
		
	}
	
	public Circle(Colour colour, int radius){
		super(colour);
		this.radius=radius;
		circleCounter++;
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
		System.out.println("\n ##### Drawing a circle #####");
	}
	
	public String toString(){
		return "\n Colour : " + getColour()+
				"\n Radius : " + radius + 
				String.format("\n Circle counter : %03d ", circleCounter);
	}

}
