package sheet12CustomerWithPizzaArray;

import java.util.ArrayList;

public class MainForPizza {

	public static void main(String[] args) {
	
		
		PizzaSize ps1 =PizzaSize.LARGE;
		/*
		System.out.println("Large "+p1.getBasePrice()+'"');
		System.out.println(p1.getPricePerTopping());
		*/
		
		String[] toppings = {"Cheese","tomato"};
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
		System.out.println(c1);
	}

}
