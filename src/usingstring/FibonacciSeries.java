package usingstring;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10; // Range of Fibonacci series
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to range " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate the next number
            first = second;           // Update the first number
            second = next;            // Update the second number
        }

	}

}
