package sheet14TraineesAndApprentices;

import java.time.LocalDate;

public class Carpenter extends Trainee implements Apprentice {
	
	//member variables
	private int phase;
	private String employersName;
	
	
	public Carpenter() {
		
	}


	

	public Carpenter(String name, LocalDate dateOfBirth, String rsiNumber, int phase, String employersName) {
		super(name, dateOfBirth, rsiNumber);
		this.phase = phase;
		this.employersName = employersName;
	}


	/**
	 * @return the phase
	 */
	public int getPhase() {
		return phase;
	}


	/**
	 * @param phase the phase to set
	 */
	public void setPhase(int phase) {
		
		if(phase>=PHASE_ONE && phase<=PHASE_SIX){
			
			this.phase = phase;
		}else{
			System.out.println(phase + " is not valid to phase, setting to phase 1");
			this.phase = PHASE_ONE;
		}
	}


	/**
	 * @return the employersName
	 */
	public String getEmployersName() {
		return employersName;
	}


	/**
	 * @param employersName the employersName to set
	 */
	public void setEmployersName(String employersName) {
		this.employersName = employersName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCarpenter\nphase: " + phase + 
				"\nEmployers name: " + employersName+ "\n"+super.toString();
	}
	
	
	
	


	
	

}
