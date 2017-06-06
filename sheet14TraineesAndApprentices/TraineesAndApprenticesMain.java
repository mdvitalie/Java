package sheet14TraineesAndApprentices;

public class TraineesAndApprenticesMain {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee("Garmondos", "15/05/2018", " 0516476W");
		//System.out.println(trainee);
		
		Electrician electrician = new Electrician("Madonel", "05/05/1990", "564897P", "Vladimir", Apprentice.PHASE_FIVE);
		System.out.println(trainee+" \n"+electrician);

	}

}
