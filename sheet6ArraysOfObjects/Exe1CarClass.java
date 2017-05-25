package sheet6ArraysOfObjects;

public class Exe1CarClass {
	private int id;
	private String make;
	private String model;
	private double engineSize;
	public static int carCounter;
	
	//Constructor
	public Exe1CarClass(){
		id=carCounter;
		carCounter++;
	}
	
	public Exe1CarClass(String make,String model, double engineSize){
		this();
		setMake(make);
		setModel(model);
		setEngineSize(engineSize);
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		
		switch(make){
		
			case "Audi":
			case "Toyota":
			case "Ford":
			case "Honda":
			case "Alpha Romeo":
			case "BMW":
			case "Mercedes":
			case "Volkswagen":
			case "Opel":
			case "Lancia":
			case "GAZ":
			case "Lada":
				
				this.make = make;
				break;
			default:
				System.out.println(make + "is not a valid make");
				break;
		}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		
		switch(model){
		
		case "A4":
		case "Q7":
		case "Volga":
		case "Niva":
		case "Mondeo":
		case "BMW 5 series":
		case "Civic":
		
			
			this.model = model;
			
			break;
		default:
			System.out.println(model + " is not a valid model");
			break;
	}
	}
	public double getEngineSize() {
		
		return engineSize;
	}
	public void setEngineSize(double size) {
		
		if(size>=1 && size<=2.8){
			
			//System.out.println("Engen size: " +size +"cc");
			this.engineSize = size;
		
		}else{
			System.out.println(size+ " is not a valid engine size");
		}
	}
	
	public int getId(){
		return id;
	}
	
	
	//@Override
	public String toString(){
		return "ID: " +id+
				"\nMake: "+make+
				"\nModel: "+ model+
				"\nEngine size: "+ engineSize+"cc";
	}

	
}
	
