package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public class Boss extends Employee {

	private double weeklySalary;
	
	
	public Boss(){
		weeklySalary =3500;
	}
	
	
	



	public Boss(String firstName, String lastName, LocalDate dob, double weeklySalary) {
		super(firstName, lastName, dob);
		this.weeklySalary = weeklySalary;
	}


	



	/**
	 * @return the weeklySalary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}




	/**
	 * @param weeklySalary the weeklySalary to set
	 */
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	



	@Override
	public double getEarning() {
		weeklySalary = weeklySalary/5;
		return weeklySalary;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n Boss "+super.toString()+
				"\n Weekly salary: " + weeklySalary;
	}
	
	

}
