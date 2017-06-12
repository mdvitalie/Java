package sheet16StringsAndStringBuilder;

public class Ex3UpdateTheMenu {

	public static void main(String[] args) {

		StringBuilder todayMenu = new StringBuilder("Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.");
		System.out.println(todayMenu);
		System.out.println();
		todayMenu.delete(0, 9);
		 todayMenu.insert(0, "Tuesday");
		//System.out.println(todayMenu);
		todayMenu.replace(22, 29, "beef ");
		todayMenu.replace(41, 48 , "beef ");
		System.out.println(todayMenu);
		System.out.println();
		todayMenu.append("Jelly and ice cream for dessert.");
		System.out.println(todayMenu);
		todayMenu.delete(91, 105);
		System.out.println(todayMenu);
	
	}

}
