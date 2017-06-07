package sheet14TraineesAndApprentices;

import java.time.LocalDate;
import java.time.Month;

public class TraineesAndApprenticesMain {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee("Garmondos", LocalDate.of(1990, Month.APRIL,05), " 0516476W");
		//System.out.println(trainee);
		
		Electrician electrician = new Electrician("Madonel",LocalDate.of(2000, Month.AUGUST, 10), "564897P", "Monster Joinery", Apprentice.PHASE_THREE);
		//System.out.println(trainee+" \n"+electrician);
		
		Trainee [] trainees ={trainee,electrician,new SoftwareDeveloper("Nicolas", LocalDate.of(1998, Month.MARCH, 25), "6547895T"),
								new Carpenter("Datsuk", LocalDate.of(1998, Month.MARCH, 29), "6548925W", Apprentice.PHASE_THREE, "Luca and Company LTD"),
								new Carpenter("Yaroslav", LocalDate.of(1988, Month.APRIL, 15), "45878925Q", Apprentice.PHASE_THREE, "Luca and Company LTD"),
								new Carpenter("Varlam", LocalDate.of(1988, Month.AUGUST, 9), "65489876Q", Apprentice.PHASE_FIVE, "Luca and Company LTD"),
								new Electrician("Electrocutare", LocalDate.of(1980, Month.MAY, 31), "9876258K", "Jones Engineering", Apprentice.PHASE_FIVE)
								};
		
		
		
		for(Trainee t : trainees){
			//System.out.println(t);
			//It prints all the PHASE, if a much is found//classes that implements the interface
			if(t instanceof Apprentice && ((Apprentice)t).getPhase() == Apprentice.PHASE_THREE){
				//((Carpenter)t).getPhase();
				System.out.println("Trainee's name: " + t.getName()+ "\tEmployer's name: " + ((Apprentice)t).getEmployersName());
			}
			//System.out.println();
			
		}

	}

}
