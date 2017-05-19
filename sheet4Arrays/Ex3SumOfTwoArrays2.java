package sheet4Arrays;

public class Ex3SumOfTwoArrays2 {

	public static void main(String[] args) {
		
		Ex3SumOfTwoArrays2 ex3 = new Ex3SumOfTwoArrays2();

		int[] array1 = {2,4,6,8,10,12,14,16};
		int[] array2 = {1,2,3,4,5,6,7,8};
		
		ex3.printMyArray(array1);
		ex3.printMyArray(array2);
		ex3.sumOfArrays(array1, array2);
		
		
	}//main
	
	/**
	 * printf()
	 * % 	is called the conversion specifier, it means special
	 *   	conversion characters follow
	 * -	is to left align the argument
	 * 12	specifies a column width
	 * s	the argument is a String
	 * d	the argument is an int
	 */
	
	public void sumOfArrays(int[] array1, int[] array2){
		//System.out.printf("Array 1\t\tArray2\t\tSum");
		System.out.printf("\n%-12s%-12s%s\n","Array 1","Array 2","Sum");
		for (int i = 0; i < array1.length; i++) {
			System.out.printf("%-12d%-12d%d\n",array1[i],array2[i], array1[i]+array2[i]);
		}
	}
	
	/*
	 * This method will print the contents of any array passed
	 * to it. When a method received an array, it must declare
	 * the parameter type fully, e.g. for an integer array, it
	 * will be     int [] myArray
	 */
	
	public void printMyArray(int[] myArray){
		for(int i=0; i<myArray.length;++i){
			//System.out.println(myArray[i]);
		}
	}

}
