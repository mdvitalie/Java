package sheet10Inheritance;

public class Triangle extends Shape {


	public Triangle(){
		
	}
	
	public Triangle(Colour colour){
		super(colour);
		//draw();
	}
	
	public void draw(){
		
		//System.out.println(" ---- Drawing a triangle ----\n");
		System.out.printf("Drawing a %s Triangle\n",getColour());
	}
	
	/*public String toString(){
		return super.toString();
	}*/
}
