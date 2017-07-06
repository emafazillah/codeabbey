package problem061To070;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSequence {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			BigInteger input = scan.nextBigInteger();
			// Fibonacci, (FN) = (FN-1) + (FN-2)
			BigInteger fn = new BigInteger("0");
			BigInteger fnminus1 = new BigInteger("0");
			BigInteger fnminus2 = new BigInteger("1");
			long count = 0L;			
			while(fn.compareTo(input) != 1) {
				fn = fnminus1.add(fnminus2);
				fnminus2 = fnminus1;
				fnminus1 = fn;
				count++;
			}
			result += Long.toString(count - 1) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
