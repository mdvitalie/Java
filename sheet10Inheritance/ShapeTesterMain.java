package sheet10Inheritance;



import sheet10Inheritance.Shape.Colour;

public class ShapeTesterMain {

	public static void main(String[] args) {
		
		
		
		
		Rectangle r1 = new Rectangle(Colour.BLUE, 5, 10);
		Circle c1 = new Circle(Colour.GREEN, 7);
		Triangle t1 = new Triangle(Colour.ORANGE);
		
		Shape[] shapes = {r1,c1,t1, new Rectangle(Colour.RED, 3, 12),
							new Circle(Colour.YELLOW, 10)
		};
		
		
		//Polymorphism patern data type with children objects
		for(int  i=0; i<shapes.length; i++){
			//System.out.println(shapes[i]);
			shapes[i].draw();
			
			if(shapes[i] instanceof Circle){
				System.out.println("The circle's radius: " + ((Circle)shapes[i]).getRadius());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//Shape shape = new Shape();
		
	/*	Rectangle rectangle = new Rectangle(Shape.Colour.BLUE, 21.0,5.5);
		//rectangle.draw();
		System.out.println(rectangle);
		
		System.out.println("\n");
		
		Triangle triangle = new Triangle(Shape.Colour.YELLOW);
//		triangle.draw();
		System.out.println(triangle);
		
		Circle circle = new Circle(Shape.Colour.ORANGE, 45);
		//circle.draw();
		System.out.println(circle);
		Circle circle2 = new Circle(Shape.Colour.BLACK, 125);
		circle.draw();
		System.out.println(circle2);
		*/
		
		

	}

}
