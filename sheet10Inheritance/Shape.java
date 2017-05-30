package sheet10Inheritance;

public abstract  class Shape {
	
	// member variale
	private Colour colour;
	
	
	//Enums
	public enum Colour{
		RED,GREEN,BLUE,YELLOW,BLACK,PINK,ORANGE,WHITE,GREY}


	public Shape() {
		
	}


	public Shape(Colour colour) {
		this();
		this.colour = colour;
	}


	/**
	 * @return the colour
	 */
	public Colour getColour() {
		return colour;
	}


	/**
	 * @param colour the colour to set
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	
	 public abstract void draw();
	
		
	public String toString(){
		return "\n Shape colour: " + colour;
	}
}
