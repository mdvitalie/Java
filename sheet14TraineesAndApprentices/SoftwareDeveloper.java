package sheet14TraineesAndApprentices;

import java.time.LocalDate;

public class SoftwareDeveloper extends Trainee {

	public SoftwareDeveloper(){}
	
	public SoftwareDeveloper(String name, LocalDate dateOfBirth, String rsiNumber){
		super(name,dateOfBirth,rsiNumber);
	}

	/*
	@Override
	public String toString() {
		return "\nSoftware Developer\n" + super.toString();
	}
	*/
	
}
