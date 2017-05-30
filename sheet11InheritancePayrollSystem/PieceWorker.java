package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public class PieceWorker extends Employee {
	
	//member variables
	private double wagePerPiece;
	private int quantity;
	
	
	

	public PieceWorker() {
		
	}




	public PieceWorker(String firstName, String lastName, LocalDate dob, double wagePerPiece, int quantity) {
		super(firstName, lastName, dob);
		this.wagePerPiece = wagePerPiece;
		this.quantity = quantity;
	}




	/**
	 * @return the wagePerPiece
	 */
	public double getWagePerPiece() {
		return wagePerPiece;
	}




	/**
	 * @param wagePerPiece the wagePerPiece to set
	 */
	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
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
	public void earning() {
		

	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PieceWorker \n Wage Per Piece: " + wagePerPiece +
				"\n Quantity=" + quantity+ super.toString();
	}
	
	
	

}
