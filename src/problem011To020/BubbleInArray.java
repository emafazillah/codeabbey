package problem011To020;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleInArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		List<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextLine()) {
			int input = scan.nextInt();
			if(input != -1) {
				arr.add(input);
			} else
				break;
		}
		int temp = 0;
		int swap = 0;
		for(int i = 0; i < (arr.size() - 1); i++) {
			temp = arr.get(i);
			if(arr.get(i) > arr.get(i + 1)) {
				arr.set(i, arr.get(i + 1));
				arr.set(i + 1, temp);
				temp = arr.get(i);
				swap++;
			}	
		}
		BigInteger checksum = new BigInteger("0");
		BigInteger temp_big = new BigInteger("0");
		for(int i = 0; i < arr.size(); i++) {
			BigInteger seed = new BigInteger("113");
			BigInteger limit = new BigInteger("10000007");
			BigInteger curr = new BigInteger(Integer.toString(arr.get(i)));
			checksum = temp_big.add(curr);
			checksum = checksum.multiply(seed);
			if(checksum.compareTo(limit) > -1) checksum = checksum.mod(limit);
			temp_big = checksum;
		}
		result += Integer.toString(swap) + " " + checksum.toString();
		System.out.println(result.trim());
		scan.close();
	}

}
