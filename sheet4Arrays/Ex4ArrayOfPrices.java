package sheet4Arrays;

public class Ex4ArrayOfPrices {

	public static void main(String[] args) {

		//Ex4ArrayOfPrices ex4 = new Ex4ArrayOfPrices();

		double[] prices = {12.50,11.20,4.99,5.66,25.40,14.30,33,24.50,1.25,2.20,3.48};

		double[] newPrices = new double[prices.length];
		
		/* This loop is used to populate the newPrices array
		 * with the old price + 4%. */
		for(int i=0; i<prices.length;++i){
			newPrices[i]= prices[i] * 1.04;
		}
		
		/* This loop is used to print both the old and new
		 * prices side by side 
		 * %	means special characters follow
		 * - 	left justify
		 * 10	column width of 10
		 * .2	2 decimal places
		 * s	String argument
		 * d 	int argument
		 * */

		System.out.printf("%-10s%10s\n","Old Price","New Price");
		for(int i=0; i<prices.length;++i){
			System.out.printf("%-10.2f%-10.2f\n",prices[i],newPrices[i]);
		}
		
		
		/*ex4.printMyArray(prices);
		ex4.printMyArray(newPrices);*/
		
	}//main

	


	/*public void printMyArray(double [] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println(); // prints a newline after the loop
	}*/
}//class
