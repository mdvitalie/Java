package sheet7EmployeeAndClockClasses;

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

	public Ex2ClockClass(int hours, int minutes, int seconds) {
		this();
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
			
			this.hours = hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {

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
			if(hours>=24)
				hours= hours % 24;
			
			//incrementHours(1);
		
	}
	
	//increment minutes
	public void incrementMinutes(int incMinutes){
		
		
			minutes +=incMinutes;
			if(minutes>59){
				//minutes -=60;
				minutes = minutes % 60;
			incrementHours(1);
		
		}
			
	}
	
	public void incrementSeconds(int incSeconds){
		
		
			seconds += incSeconds;
			if(seconds >59){
				seconds = seconds % 60;
			incrementMinutes(1);
			}
	}
	
	public void resetTime(){
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		
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
