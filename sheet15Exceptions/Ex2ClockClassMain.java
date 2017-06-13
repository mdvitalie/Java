package sheet15Exceptions;

import java.time.Clock;

import javax.swing.JOptionPane;

public class Ex2ClockClassMain {

	public static void main(String[] args) {
		
		Ex2ClockClass c = new Ex2ClockClass();
		try{
		c.setHours(12);
		c.setMinutes(87);
		c.setSeconds(33);
		}catch(InvalidTimeException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(c);
		
		try{
		Ex2ClockClass c1 = new Ex2ClockClass(90,100,200);
		System.out.println(c1);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("Finally block always executed");
		}
		
		try{
		Ex2ClockClass c2 = new Ex2ClockClass(9,1,15);
		System.out.println(c2);
		
		c2.incrementSeconds(300);
		}catch(InvalidTimeException e){
			e.printStackTrace();
		}catch(IncrementProblemException e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
				
		
		/*
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
		
		Ex2ClockClass c2 = new Ex2ClockClass(48, 120, 120);
		System.out.println(c2);
		
		}catch(InvalidTimeException e){
			JOptionPane.showMessageDialog(null, "That’s not a correct time");
			e.printStackTrace();
		}
		finally{
			System.out.println("\nThe final block");
		}*/
//		
//		ex2.resetTime();
//		System.out.println(ex2);
//		
	}

}
