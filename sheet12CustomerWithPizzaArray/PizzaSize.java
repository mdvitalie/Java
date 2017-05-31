package sheet12CustomerWithPizzaArray;

public enum PizzaSize {
	SMALL(7,1.10),
	MEDIUM(9,1.2),
	LARGE(12,1.3),
	EXTRA_LARGE(15,1.5);


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

	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * @return the pricePerTopping
	 */
	public double getPricePerTopping() {
		return pricePerTopping;
	}

	/**
	 * @param pricePerTopping the pricePerTopping to set
	 */
	public void setPricePerTopping(double pricePerTopping) {
		this.pricePerTopping = pricePerTopping;
	}












}



