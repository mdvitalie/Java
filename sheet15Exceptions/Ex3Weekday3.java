package sheet15Exceptions;

public class Ex3Weekday3 {
	

	private static final String MONDAY = "Monday";
	private static final String TUESDAY = "Tuesday";
	private static final String WEDNESDAY = "Wednesday";
	private static final String THURSDAY = "Thursday";
	private static final String FRIDAY = "Friday";
	private static final String SATURDAY = "Saturday";
	private static final String SUNDAY = "Sunday";
	private String weekday;
	
	
	public Ex3Weekday3() {
		
	}


	public Ex3Weekday3(String weekday) {
		
		this.weekday = weekday;
	}


	/**
	 * @return the weekday
	 */
	public String getWeekday() {
		return weekday;
	}


	/**
	 * @param weekday the weekday to set
	 */
	public void setWeekday(String weekday) throws InvalidWeekdayException {
		
		if(weekday == MONDAY || weekday == TUESDAY || weekday == WEDNESDAY || weekday ==THURSDAY
				|| weekday == FRIDAY || weekday==SATURDAY || weekday == SUNDAY){
			
			this.weekday = weekday;
		}
		else{
			throw new InvalidWeekdayException(weekday+" is a imvalid week day");
		}
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ex3Weekday3 weekday: " + weekday;
	}
	
	
	
}
