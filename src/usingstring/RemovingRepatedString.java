package usingstring;
import java.util.LinkedHashSet;
public class RemovingRepatedString {

	public static void main(String[] args) {
		
		String Original = "Am Am Akhil working in in Virtusa Virtusa";
		String RemovingRepatedWords = RemovedDuplicateString(Original);
		System.out.println("Original: " + Original);
		System.out.println("RemovingRepatedWords: " + RemovingRepatedWords);
	}
	
	public static String RemovedDuplicateString(String Original) {
		String[] Words = Original.split(" ");
		LinkedHashSet<String> unique = new LinkedHashSet<>();
		for(String Word : Words) {
			unique.add(Word);
		}
	
		return String.join(" " , unique);
	}

}
