package usingstring;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovingDuplicateSting {

	public static void main(String[] args) {
		
		String A = "Akhil testing";
		String dublicate = RemovingdublicateSting(A);
		System.out.println(dublicate);
	}
	public static String RemovingdublicateSting(String A) {
		//String[] word = A.split(" ");
		LinkedHashSet<Character> remove = new LinkedHashSet<>();
	//	HashSet<Character> remove = new HashSet<>();
		for (char ch : A.toCharArray()) {
			remove.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer();
		for(char ch: remove) {
			sb.append(ch);
		}
		
		return sb.toString();
	}

}
