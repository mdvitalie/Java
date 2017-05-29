package sheet9Inheritance;
import sheet9Inheritance.Expandable_Yes_No;

public class MainFurniture {

	public static void main(String[] args) {

//		Furniture furniture = new Furniture("Brown","Wood");
//		System.out.println(furniture);
		
		Table table = new Table();
		table.setColour("Red");
		table.setMaterialType("Plastic");
		table.isExpandable();
		table.setShape("Square");
		table.setExpandable(Expandable_Yes_No.NO);
		
		System.out.println(table);
		
		Table table2 = new Table("Brown", "Wood", Expandable_Yes_No.YES, "round");
		System.out.println(table2);
		
		System.out.println("\n///////////////////////////////////\n");
		
		
		Bed bed = new Bed("Blue","Plastic",Expandable_Yes_No.YES,"single");
		System.out.println(bed);
		Bed bed2 = new Bed("Orange","Metal",Expandable_Yes_No.NO,"Double");
		System.out.println(bed2);
		
		System.out.println("\n///////////////////////////////////\n");
		Chair chair = new Chair("Red", "Wood", Expandable_Yes_No.NO, "Dining Chair");
		System.out.println(chair);
		
		Chair chair2 = new Chair();
		chair2.setColour("Green");
		chair2.setMaterialType("Stool");
		chair2.setHasGaslift(Expandable_Yes_No.YES);
		chair2.setType("Ball chair");
		System.out.println(chair2);
		
		Chair chair3 = new Chair("Lime", "Plastic", Expandable_Yes_No.YES, "Arm chair");
		System.out.println(chair3);
		
		
	}

}
