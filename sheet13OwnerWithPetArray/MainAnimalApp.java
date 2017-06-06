package sheet13OwnerWithPetArray;



public class MainAnimalApp {

	public static void main(String[] args) {
		
		
		Owner owner = new Owner("Dimon Abramov", "25 Besington Street Dublin", "089123456789", 
				
								new Pet[]{new Dog("Muftar", "Buldog", 2, Colour.BROWN, Gender.FEMALE),
											new Cat("Marfusha", "Persian", 1, Colour.BLUE, Gender.FEMALE, 5, "0215as", MicroChipeed.IS_MICRO_CHIPEDD)});
		System.out.println(owner);
		
		for(Pet p : owner.getPets()){
			if(p instanceof Mammal){
				((Mammal)p).walk();
			}
		}
		
	}

}
