package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private LocalDate dob;
	
	public static int employeeCounter;
	
	//Earning method
	public abstract double getEarning();
	
	
	
	
	public Employee() {
		
		employeeCounter++;
	}




	


	public Employee(String firstName, String lastName, LocalDate dob) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		employeeCounter++;
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
	public LocalDate getDob() {
		return dob;
	}




	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}




	
	@Override
	public String toString() {
		return  String.format(" \n Employee counter: %04d", employeeCounter)+
				" \n First name:" + firstName +
				"\n Last name: " + lastName + 
				"\n Date of birth: " +String.format("%d/%02d/%d", dob.get(ChronoField.DAY_OF_MONTH),
						dob.get(ChronoField.MONTH_OF_YEAR),
						dob.get(ChronoField.YEAR));
	}
	
	/*@Override
	public String toString() {
		return  String.format(" \n Employee counter: %04d", employeeCounter)+
				" \n First name:" + firstName +
				"\n Last name: " + lastName + "\n dob: " + dob;
	}*/
	
	
	

}
