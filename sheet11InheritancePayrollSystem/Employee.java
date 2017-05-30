package sheet11InheritancePayrollSystem;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private int dob;
	
	public static int employeeCounter;
	
	//Earning method
	public abstract void earning();
	
	
	
	
	public Employee() {
		employeeCounter++;
	}




	public Employee(String firstName, String lastName, int dob) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the dob
	 */
	public int getDob() {
		return dob;
	}



	/**
	 * @param dob the dob to set
	 */
	public void setDob(int dob) {
		this.dob = dob;
	}


	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "Employee counter: "+ employeeCounter+
				" \n First name:" + firstName +
				"\n Last name: " + lastName + "\n dob: " + dob;
	}
	
	
	

}
