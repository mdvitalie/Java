package sheet10Inheritance;

public class Triangle extends Shape {


	public Triangle(){
		
	}
	
	public Triangle(Colour colour){
		super(colour);
	}
	
	public void draw(){
		
		System.out.println("Hat it is a triangle");
	}
}
