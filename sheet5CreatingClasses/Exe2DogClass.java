package sheet5CreatingClasses;

public class Exe2DogClass {

	//Member variables

	private int breed;
	private String colour;
	private String ownerName;
	private int age;
	public static int dogCounter;

	//Constance
	public static final int LABRADOR =1;
	public static final int POINTER =2;
	public static final int COLLIE =3;
	public static final int HUSKY =4;
	public static final int ALSATION =5;
	public static final int BOXER = 6;
	public static final int BULL_TERRIER =7;
	public static final int GARMAN_SHEPHARD =8;
	public static final int AOLOITZCUINTLI =9;


	//constructor


	public Exe2DogClass(){
		dogCounter++;
	}

	public Exe2DogClass(int breed,String colour,String ownerName,int age){
		this();
		setBreed(breed);
		/*setColour(colour);
		setOwnerName(ownerName);*/
		
		this.colour = colour;
		this.ownerName = ownerName;
		setAge(age);
	}


	public int getBreed() {
		return breed;
	}

	public void setBreed(int breed) {
		if(breed>=1 && breed<=9){
			this.breed = breed;
		}else{
			System.out.println("Invalid breed");
		}
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if(age<=-1){
			System.out.println("The age should be biger than: "+age);
		}else{

			this.age = age;
		}
	}
	
	
	public String getBreedAsString(){
		
		switch (breed) {
		case LABRADOR:
			return "Labrador";
		case POINTER:
			return "Pointer";
		case COLLIE:
			return "Collie";
		case HUSKY:
			return "Husky";
		case ALSATION:
			return "Alsation";
		case BOXER:
			return "Boxer";
		case BULL_TERRIER:
			return "Bull terrier";
		case GARMAN_SHEPHARD:
			return "German shephard";
		case AOLOITZCUINTLI:
			return "Aoloitzcuintli";

		default:
			return "Breed not set";
		}
	}


	@Override
	public String toString(){
		return "Breed : " + getBreedAsString() + "\nColour : "+colour +"\nAge: "+age+  "\nOwner's name : "+ownerName;
	}
}
