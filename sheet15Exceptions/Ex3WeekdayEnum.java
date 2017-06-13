package sheet15Exceptions;

public class Ex3WeekdayEnum {

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

	public Ex3WeekdayEnum() {

	}

	public Ex3WeekdayEnum(Weekdays weekday)  {

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
	public void setWeekday(Weekdays weekday) {

		this.weekday=weekday;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String text = weekday.toString().toLowerCase();
		char first = text.charAt(0);
		char upper = Character.toUpperCase(first);
		return "\nWeekday: " + upper + text.substring(1) ;
	};

	public static void main(String[] args){
		
		Ex3WeekdayEnum w1 = new Ex3WeekdayEnum(Weekdays.SATURDAY);
		System.out.println(w1);
	}

}
