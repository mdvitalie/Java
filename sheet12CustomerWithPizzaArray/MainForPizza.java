package sheet12CustomerWithPizzaArray;

import java.util.ArrayList;

public class MainForPizza {

	public static void main(String[] args) {
	
		
		PizzaSize ps1 =PizzaSize.LARGE;
		/*
		System.out.println("Large "+p1.getBasePrice()+'"');
		System.out.println(p1.getPricePerTopping());
		*/
		
		/*String[] toppings = {"Cheese","tomato"};
		Pizza p1 = new Pizza(toppings, ps1);

		Pizza p2 = new Pizza(new String[]{"cheese","tomato","ham","mushrooms"},PizzaSize.EXTRA_LARGE);
		
		Pizza[] pizzas = {p1,p2};
		
		ArrayList<Pizza> pizzaList =  new ArrayList<>();
		pizzaList.add(p1);
		pizzaList.add(p2);
		
		for(Pizza one: pizzaList){
			System.out.println(one);
		}
		
		Customer c1 = new Customer("Jony Delvido", "20 Aldemo Street Dublin", "089546789",
				new Pizza[]{p1,p2, new Pizza(new String[]{"extra cheese","black olievs","pepperoni"},PizzaSize.MEDIUM)});
		System.out.println(c1);*/
		
		Customer c2 = new Customer("Dimon Alberto", "56 Roma avenue Italy", "02-456-789", new Pizza [] {  new Pizza(new String[]{"extra cheese","Green olievs", "Chiken"},PizzaSize.SMALL) , 
				 new Pizza(new String[]{"extra cheese","Black olievs", "Pepperoni"},PizzaSize.EXTRA_LARGE)} );
		
		Customer c3 = new Customer("Grado Marino", "5 Roma Italy", "02-456-789", new Pizza [] {  new Pizza(new String[]{"cheese","Onions","Green olievs", "Chiken"},PizzaSize.SMALL) , 
				 new Pizza(new String[]{"extra cheese","Green olievs", "Pepperoni","Chiken"},PizzaSize.SMALL)} );
		
		Customer c4 = new Customer("Grado Marino", "5 Roma Italy", "02-456-789", new Pizza [] {  new Pizza(new String[]{"cheese","Onions","Green olievs", "Chiken"},PizzaSize.SMALL) , 
				new Pizza(new String[]{"extra cheese","Green olievs", "Pepperoni","Chiken"},PizzaSize.SMALL)} );
		
		Customer[] customers = {c2,c3,c4};
		
		for(Customer one: customers){
			System.out.println("\n"+one);
			System.out.println("____________________________");
		}
		
	}
	

}
