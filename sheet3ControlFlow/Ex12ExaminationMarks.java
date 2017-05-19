package sheet3ControlFlow;

import java.util.Scanner;

public class Ex12ExaminationMarks{
	public static void main(String[]args){

		Ex12ExaminationMarks ex12 =new Ex12ExaminationMarks();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter result for first exam: ");
		int exam1 = scanner.nextInt();
		
		System.out.print("enter result for second exam: ");
		int exam2 = scanner.nextInt();

		System.out.print("enter result for third exam: ");
		int exam3 = scanner.nextInt();

		
		scanner.close();


		ex12.calculateResult(exam1, exam2, exam3);


	}

	public void calculateResult(int exam1, int exam2, int exam3){
		
		int numOfPasses =0;
		
		if(exam1>=40)
			numOfPasses++;
		
		if(exam2 >=40)
			numOfPasses++;

		if(exam3 >=40)
			numOfPasses++;
		
		System.out.printf("Exam 1: %d \t Exam 2: %d \t Exam 3: %d\t", exam1,exam2,exam3);
		
		if(numOfPasses == 0 || numOfPasses ==1){
			System.out.println("Fail");
		}
		else if(numOfPasses == 2){
			double average = (exam1 +exam2+exam3)/3.0;
			
			String result = (average >=50) ? "Pass" : "Fail";
			
				System.out.println(result);
			
			
		}else{//numOfPasses = 3
			System.out.println("Pass");
			
		}


	}
}