package sheet10Inheritance;

import java.util.Arrays;

public class ShapeTesterMain {

	public static void main(String[] args) {
		
		//Shape array
		String[] shape = new String[8];
		shape[0] = "Cone";
		shape[1] = "Cube";
		shape[2] = "Shape";
		shape[3] = "Diamond";
		shape[4] = "Ractagle";
		shape[5] = "Triangle";
		shape[6] = "Octagon";
		shape[7] = "Circle";
		
		//Arrays.sort(shape);
		for(String str: shape){
			System.out.println(str);
		}

	}

}
