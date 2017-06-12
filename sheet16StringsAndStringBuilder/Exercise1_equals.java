package sheet16StringsAndStringBuilder;

public class Exercise1_equals {

	public static void main(String[] args) {
		
		
	String strA = "Monday";
	String strB = new String("Monday");
	String strC = "Tuesday";
	String strD = strC;
	String strE = new String("Tuesday");
	
	System.out.println("strA == strB :" +(strA ==strB));
	System.out.println("strC == strD :" +(strC ==strD));
	System.out.println();
	System.out.println("strD == StrE :" +(strD == strE));
	System.out.println("strA.equals(strB) : "+ strA.equals(strB));
	System.out.println("strC.equals(strD)/Tuesday : " + strC.equals(strD));
	
	strC=strC.toUpperCase();
	
	System.out.println("strC.toUpperCase()"+strC);
	System.out.println("strC.equals(strD)/TUESDAY :"+ strC.endsWith(strD));

	}

}
