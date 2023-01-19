package assignment2;

public class Main {

	public static void main(String[] args) {
		int n = 10;
		int answer = recFib(n);
		System.out.println("The " + n + "th number of the fibonacci sequence is " + answer);
	}
	public static int recFib(int n) {
		if(n <= 1) return n;
		int results = recFib(n - 1) + recFib (n - 2);
		return results;
	}
}
