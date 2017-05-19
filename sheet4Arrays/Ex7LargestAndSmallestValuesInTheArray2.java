package sheet4Arrays;

public class Ex7LargestAndSmallestValuesInTheArray2 {

	public static void main(String[] args) {
		int [] nums = {2, 6, 3, 10, 11, 1, 14, 22, 6, 8};
		Ex7LargestAndSmallestValuesInTheArray2 ex7 = new Ex7LargestAndSmallestValuesInTheArray2();
		ex7.printLargestAndSmallest(nums);
	}

	public void printLargestAndSmallest(int [] nums) {
		/* If the array doesn't contain any elements, i.e. the 
		 * length is 0, tell the user. Otherwise get the largest
		 * and smallest elements. */
		if (nums.length == 0) {
			System.out.println("Please pass in a non-empty array");
		} else {

			int smallest = nums[0];  // Make the 1st element the smallest
			int largest = nums[0];   // Make the 1st element the largest
			
			/* Loop through the array once and check each element
			 * to see if it's bigger or smaller than the variables
			 * above. If the current element is bigger or smaller
			 * then change the contents of the largest/ smallest
			 * variables. */
			for (int n : nums) {   
				if (n < smallest)
					smallest = n;
				
				else if (n > largest)
					largest = n;
			}	
			
			System.out.printf("The smallest is %d and the largest "
					+ "is %d.", smallest, largest);
		}
	}
}
/** OUTPUT
The smallest is 1 and the largest is 22.
*/