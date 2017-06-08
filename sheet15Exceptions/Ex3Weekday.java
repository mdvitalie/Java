package sheet15Exceptions;

public class Ex3Weekday {

	private Weekdays weekday;

	enum Weekdays{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY

	}

	public Ex3Weekday() {

	}

	public Ex3Weekday(Weekdays weekday) throws InvalidWeekdayException {

		setWeekday(weekday);
	}

	/**
	 * @return the weekday
	 */
	public Weekdays getWeekday() {
		return weekday;
	}

	/**
	 * @param weekday the weekday to set
	 */
	public void setWeekday(Weekdays weekday) throws InvalidWeekdayException {

		switch(weekday){

		case MONDAY: 
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
		case SATURDAY:
		case SUNDAY:

		this.weekday = weekday;
		//System.out.println(weekday);

		default:
			throw new InvalidWeekdayException(weekday+" invalid week day");
			//System.out.println("invalid week day");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nWeekday: " + weekday.toString().toLowerCase() ;
	};



}
