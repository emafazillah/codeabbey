package problem011To020;

import java.util.Scanner;

public class WeightedSumOfDigits {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			String digits = scan.next();
			int wsd = 0;
			char[] arr = digits.toCharArray();
			for(int j = 1; j < (arr.length + 1); j++) {
				String num = Character.toString(arr[j - 1]);
				wsd += Integer.parseInt(num) * j;
			}
			result += Integer.toString(wsd) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
