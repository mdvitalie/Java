package sheet12CustomerWithPizzaArray;



public class Pizza {

	//member variables

	private String[] toppings;
	private PizzaSize pizzaSize;

	public static int pizzaCounter;


	//constant
	//	public static final int SMALL = 5;
	//	public static final int MEDIUM = 7;
	//	public static final int LARGE = 9;
	//	public static final int EXTRA_LARGE = 12;


	public Pizza() {
		pizzaCounter++;
	}


	public Pizza(String[] toppings, PizzaSize pizzaSize) {
		super();
		this.toppings = toppings;
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


	public double calculatePrice(){
		return pizzaSize.getBasePrice()+ (pizzaSize.getPricePerTopping() * toppings.length);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		String text = " Pizza toppings: ";

		/* Loop through the toppings array, when it's not the last element
		 * put in a , and a space, if it is the last element, just add
		 * it onto the text String.*/

		for(int i=0;i<toppings.length; i++){
			text+= toppings[i];

			if(i !=toppings.length -1){
				text+= ",";
			}
			
		}
		text += "\n pizzaSize: "+ pizzaSize.toString().toLowerCase().replace("_", " ");
		text += String.format("\n Price: €%.2f", calculatePrice());

		return text;
		
		
		//	return " Pizza toppings: " + 
		//	Arrays.toString(toppings) + 
		//	"\n pizzaSize: " + pizzaSize;
	}





}
