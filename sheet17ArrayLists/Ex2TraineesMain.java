package sheet17ArrayLists;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Ex2TraineesMain {

	public static void main(String[] args) {
		
		Ex2Trainees t1 = new Ex2Trainees("Duglas Vendora", "20 Bessington Street Dublin", LocalDate.of(2001, Month.MARCH, 25));
		Ex2Trainees t2 = new Ex2Trainees("Alles Dragoshanu", "2 Luna Street Dublin", LocalDate.of(1995, Month.AUGUST, 1));
		Ex2Trainees t2Copy = new Ex2Trainees("Alles Dragoshanu", "2 Luna Street Dublin", LocalDate.of(1995, Month.AUGUST, 1));
		
		ArrayList<Ex2Trainees> traineeList = new ArrayList<>();
		traineeList.add(t1);
		traineeList.add(t2);
		traineeList.add(t2Copy);
		traineeList.add(new Ex2Trainees("Vlademir Bolotkin", "Russian Federation", LocalDate.of(1985, Month.DECEMBER, 10)));
	}

}
