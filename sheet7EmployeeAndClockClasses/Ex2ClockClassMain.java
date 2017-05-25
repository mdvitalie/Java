package sheet7EmployeeAndClockClasses;

public class Ex2ClockClassMain {

	public static void main(String[] args) {
		
		Ex2ClockClass ex2 = new Ex2ClockClass(5,30,45);
		System.out.println(ex2);
		
		ex2.incrementHours(3);
		System.out.println(ex2);
		
		ex2.incrementMinutes(50);
		System.out.println(ex2);
		
		ex2.incrementSeconds(50);
		System.out.println(ex2);
		
		ex2.incrementSeconds(15);
		System.out.println(ex2);
		
		ex2.resetTime();
		System.out.println(ex2);
		
	}

}
