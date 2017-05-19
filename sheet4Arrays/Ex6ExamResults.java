package sheet4Arrays;

public class Ex6ExamResults {

	public static void main(String[] args) {

		Ex6ExamResults ex6 = new Ex6ExamResults();

		int[] results1 = {50,6,59};
		int[] results2 = {59,10,39};
		int[] results3 = {4,40,4};

		ex6.calculateResults(results1,"Results 1: ");
		ex6.calculateResults(results2,"Results 2: ");
		ex6.calculateResults(results3,"Results 3: ");


	}//main

	

	public void calculateResults(int[] results1, String message){
		int passResult = 0;
		int totalResults =0;

		System.out.print("\n"+message);

		for(int i=0;i<results1.length;++i){
			//prints out each set from the array
			System.out.print(results1[i]+" ");
			//adds each set from the array
			totalResults += results1[i];


		}
		
		
		for(int each:results1){
		if(each>=40)
			passResult++;
		}

		if(passResult== 0 || passResult == 1){
			System.out.println("| Fail");
		}

		else if(passResult == 2){

			double average = (totalResults)/3.0;

			String result = (average >=50) ? "| Pass" : "| Fail";

			System.out.println(result);


		}else{//numOfPasses = 3
			System.out.println("| Pass");

		}


	}	

}//class
