package sheet4Arrays;

public class Ex7LargestAndSmallestValuesInTheArray {
	

	public static void main(String[] args) {
		
		Ex7LargestAndSmallestValuesInTheArray ex7 = new Ex7LargestAndSmallestValuesInTheArray();
		
		int[] arr1 = {5,6,12,23,45,21,11,33,24,85};
		int[] arr2 = {10,12,14,16,18,19,24,26,28,21};
		
		System.out.println("Array 1");
		ex7.smallLargeValues(arr1);
		System.out.println("Array 2");
		ex7.smallLargeValues(arr2);

	}//main
	
	public void smallLargeValues(int[] arraysNum){
		
		int smallest = arraysNum[0];
        int largetst = arraysNum[0];
               
                for(int i=1; i< arraysNum.length; i++)
                {
					if(arraysNum[i] > largetst){
						
							largetst = arraysNum[i];
							
					}else if (arraysNum[i] < smallest){
						
							smallest = arraysNum[i];
					}   
                }
				System.out.println("Largest Number : " + largetst);
				System.out.println("Smallest Number : " + smallest);
				System.out.println();
               
		
	}

}
