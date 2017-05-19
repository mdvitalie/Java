package sheet4Arrays;

public class Ex6ExamResults2 {

	public static void main(String[] args) {
		

		
			
			int [] results1 = {50, 60, 75}; 
			int [] results2 = {39, 75, 41};
			int [] results3 = {45, 40, 33};
			
			Ex6ExamResults2 ex6 = new Ex6ExamResults2();
			
			ex6.printResults(results1);
			ex6.printResults(results2);
			ex6.printResults(results3);
			
			/***********************************************************
			 * When you copy and paste a chunk of code, STOP DON'T 
			 * DO IT!!!!!  Put the chunk of code you are copying into
			 * a method. Each time the method is called it will work
			 * on a different array, so the method must take in that
			 * array as a parameter, and you must pass in that array
			 * when you call the method. 
			 */
			
			
			/*System.out.print("Results 1:\t");
			
			for (int num : results1) {
				System.out.print(num + "   ");
			}
			
			boolean result = ex6.calculateResults(results1);
			
			System.out.println( (result) ? "Pass" : "Fail" );
			
			
			System.out.print("Results 2:\t");
			
			for (int num : results2) {
				System.out.print(num + "   ");
			}
			
			result = ex6.calculateResults(results2);
			
			System.out.println( (result) ? "Pass" : "Fail" );
			
			
			
			System.out.print("Results 3:\t");
			
			for (int num : results3) {
				System.out.print(num + "   ");
			}
			
			result = ex6.calculateResults(results3);
			
			System.out.println( (result) ? "Pass" : "Fail" );*/

		}
		
		private void printResults(int [] results) {
			System.out.print("Results 1:\t");
			
			/* Loop through the results and print out each one */
			for (int num : results) {
				System.out.print(num + "   ");
			}
			
			/* Calls the calculateResults() method which will return
			 * true (pass) or false (fail) */
			boolean result = calculateResults(results);
			
			/* Convert true to "Pass" and false to "Fail" */
			System.out.println( (result) ? "Pass" : "Fail" );
		}
		
		public boolean calculateResults(int [] examResults) {
			int numOfPasses = 0;
			/* Check each exam result and count it if the score is 40 or over */ 
			if (examResults[0] >= 40)
				numOfPasses++;
			if (examResults[1] >= 40)
				numOfPasses++;
			if (examResults[2] >= 40)
				numOfPasses++;
			
			/* Work out the num of passes, 0 or 1 is a fail, 2, check
			 * the average and 3 is a pass. This method returns true or
			 * false for a pass or a fail. */
			if (numOfPasses == 0 || numOfPasses == 1)
				return false;
			else if (numOfPasses == 2) {
				// work out the average
				int total = 0;
				for (int num : examResults) {
					total += num;
				}
				double average = total / 3.0;
				/*if (average >= 50)
					return true;
				else 
					return false;*/
				
				return (average >= 50) ? true : false;
				
				//return ((examResults[0] + examResults[1] + examResults[2])
				//		/ 3 >= 50) ? true : false;
				
			} else { // numOfPasses = 3
				return true;
			}
		}
	}
	/**
	Results 1:	50   60   75   Pass
	Results 1:	39   75   41   Pass
	Results 1:	45   40   33   Fail  
	*/