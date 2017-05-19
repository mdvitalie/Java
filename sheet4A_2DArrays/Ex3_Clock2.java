package sheet4A_2DArrays;

public class Ex3_Clock2 {


	public static void main(String[] args) {
		/* printf()
		 * %	special character for printf() follow
		 * 0	fill the column with zeros in front of the number
		 * 2	the column width
		 * d	integer
		 **/
		
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.printf("%02d:%02d\n", i, j);
			}
		}
	}
}