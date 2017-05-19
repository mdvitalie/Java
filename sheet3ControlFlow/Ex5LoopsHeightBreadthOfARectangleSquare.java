package sheet3ControlFlow;
import java.util.Scanner;

public class Ex5LoopsHeightBreadthOfARectangleSquare{
	public static void main(String[] args){
		Ex5LoopsHeightBreadthOfARectangleSquare ex5 = new Ex5LoopsHeightBreadthOfARectangleSquare();
		//Decalring Scanner
		Scanner scan = new Scanner(System.in);

		//double height;
		//double length;
		System.out.println("\nCalculate the area of Height and length.");

		System.out.print("\n Please enter the  Height: ");
		double scanHeight = scan.nextDouble();
		System.out.print("\n Please enter the length: ");
		double scanBreadth = scan.nextDouble();

		ex5.rectangleArea(scanHeight,scanBreadth);
		double totalArea = ex5.rectangleArea(scanHeight,scanBreadth);
		System.out.printf("\nThe %.2f height and  %.2f breadth = %.2f:\n",scanHeight,scanBreadth, totalArea);

		
		//close Scaner
		scan.close();
	}
	//calculateAreaAndPerimeters

	private double rectangleArea(double height, double length){

		if(height == length){
			System.out.println("\n The height and length are perimeters of a Square area");
		}else{
			System.out.println("\n The height and length are perimeters of a Rectangle area");
		}
		double totalArea =2 * height + 2 * length;
		return totalArea;

		/*
		//Second Option

		double height = 6;
		double length = 5;
		Ex5HeightBreadth ex5 = new Ex5HeightBreadth();
		ex5.calculateAreaAndPerimeter(height, length);
	}	

	private void calculateAreaAndPerimeter(double height, double length) {
		double area;
		double perimeter;

		area = height * length;
		perimeter = 2 * height + 2 * length;

		if (height == length) {
			System.out.printf("Area of the square is %.2f and " +
							  "perimeter is %.2f", area, perimeter);
		} else {
			System.out.printf("Area of the rectangle is %.2f and " +
							  "perimeter is %.2f", area, perimeter);
		}


		 */


	}
}