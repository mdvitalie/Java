/**
 * Exercise 11 – Invoicing System
A program is required as part of an invoicing system to enter the reference number of a product,
 its unit price in Euros and Cents and a quantity ordered. 
 The program should output the total cost of the order given that the first 100 items ordered are charged at the unit price
  and that the remainder are charged at 75% of unit price. Write a program that holds each of the values required as variables
   and pass the values to a method to work out the total cost of the order.

 * */

package sheet3ControlFlow;

public class Ex11InvoicingSystem2 {

	public static void main(String[] args) {
		
		Ex11InvoicingSystem2 ex11 = new Ex11InvoicingSystem2();
		
		String refNum = "123ABC";
		double price =1;
		int quantity = 100;

		ex11.claculateTotal(refNum, price, quantity);
		
	}//main
	
	public void claculateTotal(String refNum,double price,int quantity){
		
		int remainder;
		double totalCost;
		if(quantity >100){
			remainder = quantity -100;
			 totalCost =100*price + remainder * price *0.75;
		}else{
			totalCost = quantity * price;
		}
		
		System.out.printf("Referance number: %s,\n" + "quantity: %d * price: %.2f",refNum, quantity, price,totalCost);
	}

}//class
