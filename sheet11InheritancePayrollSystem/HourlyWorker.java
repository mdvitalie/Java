package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public class HourlyWorker extends Employee {
	
	//member variables
	private double wage;
	private double hoursWorked;
	
	
	

	public HourlyWorker() {

	}




	public HourlyWorker(String firstName, String lastName, LocalDate dob, double wage, double hoursWorked) {
		super(firstName, lastName, dob);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}




	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}




	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
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
	public double getEarning() {
		
		if(wage<=40){
			this.wage = wage;
			
		}
		
				
		hoursWorked = hoursWorked *1.5;
		return hoursWorked;
		

	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ 
				"\n HourlyWorker \n Wage: " + wage + 
				"\n Hours worked: " + hoursWorked 
				 ;
	}
	
	
	

}
