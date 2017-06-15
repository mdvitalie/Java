package sheet16StringsAndStringBuilder;

public class Ex3UpdateTheMenu {

	public static void main(String[] args) {

		StringBuilder todayMenu = new StringBuilder("Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.");
		System.out.println(todayMenu);
		//Insert a newline just before potatoes
		todayMenu.insert(todayMenu.indexOf("potatoes"),"\n");
		/*** Replace Wednesday with Thursday ***/
		int index = 0;
		// Find the first occurrence of Wednesday
		int found = todayMenu.indexOf("Wednesday",index);

		// While it was found. indexOf() will return -1 when not found
		while(found !=-1){
			int end =found +"Wednesday".length();
			todayMenu.replace(found, end, "Thursday");
			// Start searching again at the end of the previous find + 1
			index = end +1;
			// Search again for Wednesday at the next index
			found = todayMenu.indexOf("Wednesday", index);

		}

		System.out.println(todayMenu);
		// to search for a String using regular expression.
		String menu = todayMenu.toString().replaceAll("turkey", "beef");
		// Convert the String back into a StringBuilder
		todayMenu = new StringBuilder(menu);

		todayMenu.append(" Jelly and ice cream for dessert.");
		System.out.println(todayMenu);
		
		//todaysMenu.replace(todaysMenu.indexOf("and ice cream"), 
		//		todaysMenu.indexOf("for"), "");
		
		System.out.println(todayMenu.delete(todayMenu.indexOf("and ice cream"), todayMenu.indexOf("for")));



		//		System.out.println(todayMenu);
		//		System.out.println();
		//		todayMenu.delete(0, 9);
		//		 todayMenu.insert(0, "Tuesday");
		//		//System.out.println(todayMenu);
		//		todayMenu.replace(22, 29, "beef ");
		//		todayMenu.replace(41, 48 , "beef ");
		//		System.out.println(todayMenu);
		//		System.out.println();
		//		todayMenu.append("Jelly and ice cream for dessert.");
		//		System.out.println(todayMenu);
		//		todayMenu.delete(91, 105);
		//		System.out.println(todayMenu);

	}

}
