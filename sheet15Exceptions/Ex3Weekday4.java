package sheet15Exceptions;

public class Ex3Weekday4 {
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

		public Ex3Weekday4() {

		}

		public Ex3Weekday4(String weekday) throws InvalidWeekdayException {

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

			switch(weekday.toUpperCase()){

			case "MONDAY": 
			case "TUESDAY":
			case "WEDNESDAY":
			case "THURSDAY":
			case "FRIDAY":
			case "SATURDAY":
			case "SUNDAY":

			this.weekday = weekday;
			break;
			//System.out.println(weekday);

			default:
				throw new InvalidWeekdayException(weekday+" is invalid week day");
				//System.out.println("invalid week day");
			}
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "\nWeekday: " + weekday ;
		};



	}