package sheet12CustomerWithPizzaArray;

public class Customer {
	
	//member variable
	private String name;
	private String address;
	private String phone;
	private Pizza[] pizzas ;
	//private double totalCost;
	
	



	public Customer() {
		
	}



	public Customer(String name, String address, String phone, Pizza[] pizzas) {
		this();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pizzas = pizzas;
		
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * @return the pizzas
	 */
	public Pizza[] getPizzas() {
		return pizzas;
	}



	/**
	 * @param pizzas the pizzas to set
	 */
	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}



	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		double cost= 0;
		
		for(Pizza one: pizzas){
			cost += one.calculatePrice();
		}
		
		return cost;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String text = " Name: " + name;
		text += "\n Address: " + address;
		text += "\n Phone: " + phone;
		
		for(int i=0; i<pizzas.length; i++){
			
			text += "\n\n"+(i+1) +":"+ pizzas[i];
			if(i != pizzas.length){
				text +=", ";
			}
		}
		
		text += String.format("\n Total cost: €%.2f", getTotalCost());
		return text;
		
		/*return "Customer name: " + name +
				"\n Address: " + address + 
				"\n Phone: " + phone +
				"\n Pizzas: " + pizzas
				+ "\n Total Cost: " + getTotalCost() ;*/
	}
	

	
}
