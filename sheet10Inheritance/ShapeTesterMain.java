package sheet10Inheritance;

import java.util.Arrays;

public class ShapeTesterMain {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		Rectangle rectangle = new Rectangle(Shape.Colour.BLUE, 2.0,5.5);
		rectangle.draw();
		System.out.println(rectangle);
		
		System.out.println("\n//////////////////////\n");
		
		Triangle triangle = new Triangle(Shape.Colour.BLUE);
		System.out.println(triangle);
		
		
		//Shape array
		

	}

}
