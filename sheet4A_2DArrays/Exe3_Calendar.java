package sheet4A_2DArrays;

public class Exe3_Calendar {



	public static void main(String[] args) {


		String[] monthsOfYear = {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};

		//int[] stratingDayOfMonths = {6,2,2,5,0,3,5,1,4,6,2,4};

		String[] headingMonths = {"M","T","W","T","F","S","S"};

		int[][] daysOfMonth ={
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}
		};



		int startingDay = 6;



		for(int i=0; i<monthsOfYear.length; i++){

			System.out.print("\n\n\n "+monthsOfYear[i]+"\n\n");

			for(int j=0; j<headingMonths.length; j++){

				System.out.print(" "+headingMonths[j]+"  ");
				//System.out.printf("%5s ",headingMonths[j]);

			}
			System.out.print("\n _ _ _ _ _ _ _ _ _ _ _ _ _");

			System.out.println("\n");


			//printing starting day of the month
			for( int k=0; k < startingDay; k++){
				System.out.printf("%4s","");
			}

			int printCounter = startingDay; 
			for(int j=0; j<daysOfMonth[i].length;j++){

				System.out.printf("%4d",daysOfMonth[i][j]);

				//printing Days of the Month 1 to 31
				if((printCounter+1) % 7 ==0){
					System.out.println("");
					printCounter=0;
				}else{
					printCounter++;
				}
			}

			startingDay = printCounter;

		}		



		/*for(int i=0;i<monthsOfYear.length; i++ ){
				System.out.println();
				for(int j=0; j<daysOfMonth[i].length;j++){
					if(daysOfMonth[i][j] <10){
						System.out.print(" ");
					}
					System.out.print(daysOfMonth[i][j]+"  ");
					if(daysOfMonth[i][j] % 7 ==0){
						System.out.println("");
					}
				}
			}
		 */	












	}//main

	/*public static void getCalendar(String[][] months, int[]days){

		for(int i=0; i<months.length; i++){
			for(int j=0; j<days[i]; j++){
				System.out.println(months[i][j]);
			}
		}
	}*/

}//class
