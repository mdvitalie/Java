package sheet12CustomerWithPizzaArray;

import java.util.Arrays;

public class Pizza {

	//member variables

	private String[] toppings;
	private double price;
	private PizzaSize pizzaSize;

	public static int pizzaCounter;

	public Pizza() {
		pizzaCounter++;
	}

	public Pizza(String[] toppings, double price, PizzaSize pizzaSize) {
		this();
		this.toppings = toppings;
		this.price = price;
		this.pizzaSize = pizzaSize;
	}

	/**
	 * @return the toppings
	 */
	public String[] getToppings() {
		return toppings;
	}

	/**
	 * @param toppings the toppings to set
	 */
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the pizzaSize
	 */
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}


	/**
	 * @param pizzaSize the pizzaSize to set
	 */
	public void setPizzaSize(PizzaSize pizzaSize) {
		
		
		this.pizzaSize = pizzaSize;
	}

	public void calculatePrice(){
		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pizza toppings: " + Arrays.toString(toppings) +
				"\n Price: " + price +
				"\n Pizza size: " + pizzaSize;
	}




}
