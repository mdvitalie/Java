package sheet4Arrays;

public class Ex1_10ElementArray{
	public static void main(String[] args){
		
	
		
		
		int []arrNum = new int[10];
		//System.out.print("The size of the array is: ");
		// A loop to populate the array
		for(int i=0, value=2; i<arrNum.length; ++i, value+=2){
			arrNum[i]=value;
		}
		
		
		//A loop to print the Array
		for(int i=0; i<arrNum.length; ++i){
			
		System.out.println(i+1+") The values are : "+ arrNum[i]);
		}
	}
}