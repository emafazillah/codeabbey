package problem011To020;

import java.math.BigInteger;
import java.util.Scanner;

public class ArrayChecksum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger result = new BigInteger("0");
		BigInteger temp = new BigInteger("0");
		for(int i = 0; i < n; i++) {
			BigInteger seed = new BigInteger("113");
			BigInteger limit = new BigInteger("10000007");
			BigInteger curr = new BigInteger(scan.next());
			result = temp.add(curr);
			result = result.multiply(seed);
			if(result.compareTo(limit) > -1) result = result.mod(limit);
			temp = result;
		}
		System.out.println(result);
		scan.close();
	}

}
