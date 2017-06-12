package sheet16StringsAndStringBuilder;

public class Ex2UpdateTheMenu {

	public static void main(String[] args) {
		
		String todayManu = "Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		System.out.println(todayManu);
		todayManu= todayManu.replace("Wednes", "Thurs");
		//System.out.println(todayManu);
		todayManu = todayManu.replace("turkey", "beef");
		System.out.println(todayManu);
		todayManu = todayManu.concat("Jelly and ice cream for desert.");
		System.out.println(todayManu);
		//todayManu=todayManu.substring(0, 88);
		todayManu =todayManu.replace(" and ice cream", "");
		System.out.println(todayManu);

	}

}
