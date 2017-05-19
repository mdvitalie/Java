package sheet3ControlFlow;

public class Ex10Floats {

	public static void main(String[] args) {
		
		Ex10Floats ex10 = new Ex10Floats();
		
		float num1 =0;
		float num2 = 2;
		float num3 = 5;
		
		ex10.sameDifferent(num1, num2, num3);
		ex10.largestAndsmallest(num1, num2, num3);
		
		
		
	}//main
	 public void largestAndsmallest(float a, float b, float c ){
		 float largest = a;
		 if(b>largest)
			 largest =b;
		 if(c>largest)
			 largest = c;
		 System.out.println("The largest is: " + largest);
		 
		 float smallest = a;
		 if(b < smallest)
			 smallest =b;
		 if(c < smallest)
			 smallest = c;
		 System.out.println("The smallest is: " + smallest);
	 }
	
	public void printAverage(float a, float b, float c) {
		float average = (a+b+c) /3;
		System.out.printf("the average is %.2f", average);
		
	}
	
	public void sameDifferent(float a, float b, float c) {
		
		if(a==b && b == c)
			System.out.println("All numbers are the same");
		
		else if(a !=b && b != c && a!=c)
			System.out.println("All numbers are different");
		
		else 
			System.out.println("Two are the same");
		
		//if(a==b || a==c || b==c)
	}

}//class
