package problem061To070;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersGeneration {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();
			result += Integer.toString(calcPrime(m)) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

	static int calcPrime(int inp) {
		// Sieve of Eratosthene or Trial division
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		int number = 4; // start primarity test with number 4
		while (arr.size() < inp) {
			if (number % 2 != 0 && number % 3 != 0) { // sieve out even numbers and factor 3
				int temp = 4;
				while (temp * temp <= number) { // sieve out factor sqrt(number)
					if (number % temp == 0)
						break;
					temp++;
				}
				if (temp * temp > number) {
					arr.add(number);
				}
			}
			number++;
		}
		return arr.get(inp - 1);
	}

}
