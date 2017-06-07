package sheet14TraineesAndApprentices;

import java.time.LocalDate;

public class Electrician extends Trainee implements Apprentice {
	
	// member variables
	private String employersName;
	private int phase;
	
	public Electrician() {
		
	}



	public Electrician(String name, LocalDate dateOfBirth, String rsiNumber, String employersName, int phase) {
		super(name, dateOfBirth, rsiNumber);
		this.employersName = employersName;
		this.phase = phase;
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
		this.phase = phase;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nElectrician\nPhase: " + phase +
				"\nemployers Name: " + employersName + 
				"\n"+ super.toString();
	}
	
	

}
