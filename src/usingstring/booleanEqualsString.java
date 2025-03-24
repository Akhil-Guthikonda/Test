package usingstring;

public class booleanEqualsString {

	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "hello";
		boolean str3 = str2.equalsIgnoreCase(str1);
		boolean str4 = str1.equalsIgnoreCase(str2);
		
		boolean str5 = str2.equals(str1);
		boolean str6 = str1.equals(str2);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		//-----------
		System.out.println(str2.equals(str1));
		System.out.println(str2.equalsIgnoreCase(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
