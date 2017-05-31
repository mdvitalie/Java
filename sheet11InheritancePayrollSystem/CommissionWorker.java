package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public class CommissionWorker extends Employee {
	
	//member variables
	private double salary;
	private double commission;
	private int quantity;
	




	public CommissionWorker(String firstName, String lastName, LocalDate dob, double salary, double commission,
			int quantity) {
		super(firstName, lastName, dob);
		this.salary = salary;
		this.commission = commission;
		this.quantity = quantity;
	}



	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}



	/**
	 * @return the commission
	 */
	public double getCommission() {
		return commission;
	}



	/**
	 * @param commission the commission to set
	 */
	public void setCommission(double commission) {
		this.commission = commission;
	}



	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}



	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public double getEarnings() {
		return salary +(commission * quantity);

	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n CommissionWorker: " + super.toString()+
				"\n Salary : "+String.format("€%.2f", salary)+String.format("Commission: €.2f", commission)+
				"\n Quantity : " +quantity;
/*		return super.toString()+ "\n CommissionWorker salary: " + salary +
				"\n Commission: " + commission +
				"\n Quantity: " + quantity
				;
*/	}

	

}
