package sheet14TraineesAndApprentices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class Trainee {
	
	//member variable
	private String name;
	private LocalDate dateOfBirth;
	private String rsiNumber;
	
	
	public Trainee() {
		
	}


	public Trainee(String name, LocalDate dateOfBirth, String rsiNumber) {
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
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
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); 
		return "Trainee name: " + name + 
				//"\nDate of Birth: " + dateOfBirth.format(formatter) + 
				"\nDate of Birth: " + dateOfBirth.format(formatter)+
				"\nPPS number: " + rsiNumber;
		
/*		return "Trainee name: " + name + 
				//"\nDate of Birth: " + dateOfBirth.format(formatter) + 
				"\nDate of Birth: " + String.format("%d/%02d/%d",dateOfBirth.get(ChronoField.DAY_OF_MONTH),
						dateOfBirth.get(ChronoField.MONTH_OF_YEAR), dateOfBirth.get(ChronoField.YEAR)) + 
				"\nPPS number: " + rsiNumber;
*/		
	}
	
	

}
