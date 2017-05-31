package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public class HourlyWorker extends Employee {
	
	//member variables
	private double wagePerHour;
	private double hoursWorked;
	
	
	

	public HourlyWorker() {

	}




	public HourlyWorker(String firstName, String lastName, LocalDate dob, double wagePerHour, double hoursWorked) {
		super(firstName, lastName, dob);
		this.wagePerHour = wagePerHour;
		this.hoursWorked = hoursWorked;
	}






	/**
	 * @return the wagePerHour
	 */
	public double getWagePerHour() {
		return wagePerHour;
	}




	/**
	 * @param wagePerHour the wagePerHour to set
	 */
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}




	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}




	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}




	@Override
	public double getEarnings() {
		/*if(hoursWorked > 40){
			return (40 * hoursWorked)+((hoursWorked - 40) * wagePerHour * 1.5);
		}
		else{
			return hoursWorked *wagePerHour;
		}*/
		
		return hoursWorked > 40 ? (40 * hoursWorked)+((hoursWorked - 40) * wagePerHour * 1.5) : hoursWorked *wagePerHour;

	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n HourlyWorker"+super.toString()+ 
				 String.format("\n Wage per hour : €,.2f", wagePerHour) + 
				"\n Hours worked: " + hoursWorked ;
	}
	
	
	

}
