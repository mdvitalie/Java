package sheet12CustomerWithPizzaArray;

public enum PizzaSize {
	SMALL(7,1.0),
	MEDIUM(9,1.2),
	LARGE(12,1.5),
	EXTRA_LARGE(15,2);


	private int basePrice;
	private double pricePerTopping;

	private PizzaSize(int basePrice, double pricePerTopping) {
		this.basePrice = basePrice;
		this.pricePerTopping = pricePerTopping;
	}

	/**
	 * @return the basePrice
	 */
	public int getBasePrice() {
		return basePrice;
	}

	
	/*public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}*/


	public double getPricePerTopping() {
		return pricePerTopping;
	}

	










}



