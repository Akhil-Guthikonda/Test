package usingstring;

public class RepeatedWordString {

		public static void main(String[] args) {
	      String A = "Akhil Akhil Akhil testing testing";
	        String[] words = A.split(" ");

	       System.out.println("Repeated words:" +A);
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    System.out.println(words[i]);
	                    break;
	                }
	            }
	        }
			 
		}

}
