package sheet15Exceptions;

public class Ex2ClockClassMain {

	public static void main(String[] args) {
		
		Ex2ClockClass ex2 = new Ex2ClockClass(1,30,10);
		System.out.println(ex2);
		
		ex2.incrementHours(23);
		System.out.println(ex2);
		
		ex2.incrementMinutes(50);
		System.out.println(ex2);
	
		ex2.incrementSeconds(50);
		System.out.println(ex2);
		
		ex2.incrementSeconds(40);
		System.out.println(ex2);
		
		ex2.incrementMinutes(45);
		System.out.println(ex2);
		
		ex2.incrementHours(21);
		System.out.println(ex2);
		
		ex2.incrementSeconds(140);
		System.out.println(ex2);
//		
//		ex2.resetTime();
//		System.out.println(ex2);
//		
	}

}
