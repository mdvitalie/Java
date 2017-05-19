package sheet4A_2DArrays;

public class Ex3_Clock {

	public static void main(String[] args) {
		
		
		
		double hours = 24;
		double minutes = 60;
		double seconds = 60;
		
		for(int i =0; i<hours;i++){
			for(int j =0; j<minutes;j++){
				
				//for(int k=0; k<seconds; k++){
					
					System.out.printf("%02d : %02d\n", i,j);
					//System.out.printf("%02d : %02d : %02d\n", i,j, k);
				//}
				//System.out.println(i+" : "+j+ "\t");
			}
		}

	}

}
