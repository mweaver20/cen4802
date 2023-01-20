package assignment2;

public class Main {
/**
 * The main method which calls our static recFib method and displays the results to the console
 * @author - morgan
 * @param args - any arguments given from the command line
 * @return - returns nothing
 */
	public static void main(String[] args) {
		/**
		 * @variable n - set to ten, passed to method recFib as an argument, set to 10 to find the 10th term of the Fibonacci sequence
		 * @variable result - set to the result of calling static recFib method, used to easily display recFib result to console 
		 */
		int n = 10;
		int answer = recFib(n);
		System.out.println("The " + n + "th number of the fibonacci sequence is " + answer);
	}
	
	/**
	 * the method recFib, short for recursive Fibonacci, is used to find a specific term in the Fibonacci sequence. It will find the term of the argument passed to it as n, and recursively call itself until the nth sequence is found.
	 * @author morgan
	 * @param n - integer passed to method to find the term of Fibonacci sequence
	 * @return results - returns an integer which is the nth term in the fib sequence
	 */
	public static int recFib(int n) {
		if(n <= 1) return n;
		int results = recFib(n - 1) + recFib (n - 2);
		return results;
	}
}
