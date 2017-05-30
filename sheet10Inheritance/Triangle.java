package sheet10Inheritance;

public class Triangle extends Shape {


	public Triangle(){
		
	}
	
	public Triangle(Colour colour){
		super(colour);
		draw();
	}
	
	public void draw(){
		
		System.out.println(" ---- Drawing a triangle ----");
	}
	
	
}
