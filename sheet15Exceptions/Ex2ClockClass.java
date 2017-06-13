package sheet15Exceptions;

public class Ex2ClockClass {

	//instance variables
	private int  hours;
	private int minutes;
	private int seconds;




	public Ex2ClockClass() {

		hours   =0;
		minutes =0;
		seconds =0;

	}

	public Ex2ClockClass(int hours, int minutes, int seconds) throws InvalidTimeException {
		this();
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) throws InvalidTimeException {
		if(hours<0 || hours>23){
			throw new InvalidTimeException(hours+ " That’s definitely not the correct hours");
		}

		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) throws InvalidTimeException {

		if(minutes<0 || minutes>59){
			throw new InvalidTimeException("["+minutes+"]"+ " That’s definitely not the correct minuts");
		}
		this.minutes = minutes;

	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds)throws InvalidTimeException {

		if(seconds<0 || seconds>59){
			throw new InvalidTimeException("["+seconds+"]"+ " That’s definitely not the correct seconds");
		}

		this.seconds = seconds;

	}

	// Set complete time
	/*public void setCompleteTime(int hours, int minutes, int seconds){
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}*/



	//increment hours
	public void incrementHours(int incHours){

		hours += incHours;
		if(hours>=23)
			hours= hours % 24;

		//incrementHours(1);

	}

	//increment minutes
	public void incrementMinutes(int incMinutes){


		minutes +=incMinutes;
		if(minutes>59){
			//minutes -=60;
			incrementHours(minutes /60);
			minutes = minutes % 60;

		}

	}

	public void incrementSeconds(int incSeconds)throws IncrementProblemException{


		seconds += incSeconds;
		if(incSeconds<0 || incSeconds>120)
			throw new IncrementProblemException("cannot add on "+ incSeconds + " seconds");
		
		if(seconds >59){
			incrementMinutes(seconds /60);
			seconds = seconds % 60;
		}
	}

	public void resetTime(int hours, int minutes, int seconds) throws IncrementProblemException{
		
		reset();
		incrementHours(hours);
		incrementMinutes(minutes);
		incrementSeconds(seconds);

		/*this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;*/
	}
	
	public void reset(){
		hours = minutes = seconds =0;
	}

	@Override
	public String toString() {
		/*
			return "Hours: " + hours +
					" minutes: " + minutes +
					" seconds: " + seconds;
		 */
		return String.format("\n Time clock \n %02d:%02d:%02d", hours, minutes, seconds);
	}


}
