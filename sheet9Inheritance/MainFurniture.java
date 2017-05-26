package sheet9Inheritance;

public class MainFurniture {

	public static void main(String[] args) {

//		Furniture furniture = new Furniture("Brown","Wood");
//		System.out.println(furniture);
		
		Table table = new Table();
		table.setColour("Red");
		table.setMaterialType("Porcelan");
		table.isExpandable();
		table.setShape("Square");
		
		System.out.println(table);
		
		System.out.println("\n///////////////////////////////////\n");
		
		
		Bed bed = new Bed("Blue","Plastic",true,"XXL");
		System.out.println(bed);
		Bed bed2 = new Bed("Orange","Metal",true,"Double");
		System.out.println(bed2);
		
		System.out.println("\n///////////////////////////////////\n");
		Chair chair = new Chair("Red", "Wood", false, "Dining Chair");
		System.out.println(chair);
		
		Chair chair2 = new Chair();
		chair2.setColour("Green");
		chair2.setMaterialType("Plastic");
		chair2.setHasGaslift(true);
		chair2.setType("Ball chair");
		System.out.println(chair2);
		
	}

}
