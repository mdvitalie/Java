package sheet12CustomerWithPizzaArray;

public class Customer {
	
	//member variable
	private String name;
	private String address;
	private String phone;
	private String pizzas[];
	private double totalCost;
	
	



	public Customer() {
		
	}



	public Customer(String name, String address, String phone, String[] pizzas) {
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
	public String[] getPizzas() {
		return pizzas;
	}



	/**
	 * @param pizzas the pizzas to set
	 */
	public void setPizzas(String[] pizzas) {
		this.pizzas = pizzas;
	}



	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer name: " + name +
				"\n Address: " + address + 
				"\n Phone: " + phone +
				"\n Pizzas: " + pizzas
				+ "\n Total Cost: " + totalCost ;
	}
	

	
}
