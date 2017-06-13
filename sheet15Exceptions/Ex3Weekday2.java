package sheet15Exceptions;

public class Ex3Weekday2 {
	private static final String MONDAY = "Monday";
	private static final String TUESDAY = "Tuesday";
	private static final String WEDNESDAY = "Wednesday";
	private static final String THURSDAY = "Thursday";
	private static final String FRIDAY = "Friday";
	//private static final String SATURDAY = "Saturday";
	//private static final String SUNDAY = "Sunday";
	private String weekday;

	/*	enum Weekdays{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY

	}*/

	public Ex3Weekday2() {

	}

	public Ex3Weekday2(String weekday) throws InvalidWeekdayException {

		setWeekday(weekday);
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

		//		if (weekday.equalsIgnoreCase("Monday") || 
		//		weekday.equalsIgnoreCase("Tuesday") ||
		//		weekday.equalsIgnoreCase(WEDNESDAY) || 
		//		weekday.equalsIgnoreCase(THURSDAY) ||
		//		weekday.equalsIgnoreCase(FRIDAY) ) {
		//	this.weekday = weekday;
		//} else {
		//	throw new InvalidWeekdayException(weekday + 
		//			" is not a valid weekday"); 
		//}

		switch(weekday.toLowerCase()){

		case MONDAY: 
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
		//case SATURDAY:
		//case SUNDAY:

			this.weekday = weekday;
			break;
			//System.out.println(weekday);

		default:
			throw new InvalidWeekdayException(weekday+" is not a valid weekday");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		weekday = weekday.toLowerCase();
		//gets first letter character
		char firstLetter = weekday.charAt(0);
		//converts first letter to upper case
		char uppercase = Character.toUpperCase(firstLetter);
		
		weekday = uppercase+weekday.substring(1);
		return "\nWeekday: ".concat(weekday) ;
	};



}