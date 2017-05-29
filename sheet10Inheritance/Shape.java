package sheet10Inheritance;

public class Shape {
	
	// member variale
	private String colour;
	
	
	//Enums
	public enum Colour{
		RED,GREEN,BLUE,YELLOW,BLACK,PINK,ORANGE,WHITE,GREY}


	public Shape() {
		
	}


	public Shape(String colour) {
		this();
		this.colour = colour;
	}


	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	public void draw()
	{
		
	}
		
	public String toString(){
		return " Colour" + colour;
	}
}
