package sheet14TraineesAndApprentices;

public class Trainee {
	
	//member variable
	private String name;
	private String dateOfBirth;
	private String rsiNumber;
	
	
	public Trainee() {
		
	}


	public Trainee(String name, String dateOfBirth, String rsiNumber) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.rsiNumber = rsiNumber;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}


	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	/**
	 * @return the rsiNumber
	 */
	public String getRsiNumber() {
		return rsiNumber;
	}


	/**
	 * @param rsiNumber the rsiNumber to set
	 */
	public void setRsiNumber(String rsiNumber) {
		this.rsiNumber = rsiNumber;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trainee name: " + name + 
				"\nDate of Birth: " + dateOfBirth + 
				"\nPPS number: " + rsiNumber;
	}
	
	

}
