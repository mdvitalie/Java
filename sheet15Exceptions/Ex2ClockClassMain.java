package sheet15Exceptions;

import java.time.Clock;

import javax.swing.JOptionPane;

public class Ex2ClockClassMain {

	public static void main(String[] args) {
		try{
		Ex2ClockClass ex2 = new Ex2ClockClass(1,30,50);
		System.out.println(ex2);
		
		ex2.incrementHours(23);
		System.out.println(ex2);
		
		ex2.incrementMinutes(50);
		System.out.println(ex2);
	
		ex2.incrementSeconds(50);
		System.out.println(ex2);
		
		ex2.incrementSeconds(170);
		System.out.println(ex2);
		
		ex2.incrementMinutes(45);
		System.out.println(ex2);
		
		ex2.incrementHours(21);
		System.out.println(ex2);
		ex2.reset();
		System.out.println(ex2);
		
		ex2.incrementSeconds(140);
		System.out.println(ex2);
		
		/*Ex2ClockClass c2 = new Ex2ClockClass(48, 120, 120);
		System.out.println(c2);*/
		
		}catch(InvalidTimeException e){
			JOptionPane.showMessageDialog(null, "That’s not a correct time");
			e.printStackTrace();
		}
		finally{
			System.out.println("\nThe final block");
		}
//		
//		ex2.resetTime();
//		System.out.println(ex2);
//		
	}

}
