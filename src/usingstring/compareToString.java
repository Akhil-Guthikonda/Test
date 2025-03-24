package usingstring;

public class compareToString {

	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "hello";
		int c = str1.compareTo(str2);
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareToIgnoreCase(str1));
		System.out.println(str1.compareToIgnoreCase(str2));
	}

}
