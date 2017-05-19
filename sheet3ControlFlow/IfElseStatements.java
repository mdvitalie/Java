package sheet3ControlFlow;
import java.util.Scanner;
public class IfElseStatements{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num= 5;
		if(num == 5){
			System.out.println("Number is 5");
		}
		
		System.out.println("After the if");
		
		
		if (num >10)
			System.out.println("Number is 10");
			
		else
			System.out.println("Number is 10 or over");
		
		
		System.out.println("\nExam Scores.");
		System.out.println("\nEnter your exam score.");
		double examScore = scan.nextDouble();
		//int examScore = 100;
		char grade;
		
		if(examScore <=39)
			grade = 'F';
		else if (examScore>=40 && examScore <=50)
			grade = 'D';
		else if (examScore>=41 && examScore<=64){
			grade = 'C';
			System.out.println("Well done!");
		}else if(examScore >=65 && examScore <=84)
			grade = 'B';
		else grade = 'A';
		
		System.out.println("Grade is: " + grade);
		scan.close();
	}//main
}//class