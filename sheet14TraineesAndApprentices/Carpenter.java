package sheet14TraineesAndApprentices;

public class Carpenter extends Trainee implements Apprentice {
	
	//member variables
	private int phase;
	private String employersName;
	
	
	public Carpenter() {
		
	}


	

	public Carpenter(String name, String dateOfBirth, String rsiNumber, int phase, String employersName) {
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carpenter phase=" + phase + ", employersName=" + employersName;
	}
	
	
	
	


	
	

}
