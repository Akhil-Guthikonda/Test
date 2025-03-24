package usingstring;

public class SimpleRepeatedChars {

	public static void main(String[] args) {
        String A = "Am Testing the Application";
        int[] count = new int[256]; // Array to store character frequencies

        // Count occurrences of each character
        for (char ch : A.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                count[ch]++;
            }
        }

        // Print repeated characters
        System.out.println("Repeated characters:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " - " + count[i] + " times");
            }
        }
    }
}
 




