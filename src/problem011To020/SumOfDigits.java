package problem011To020;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int total = A * B + C;
			char[] digits = (Integer.toString(total)).toCharArray();
			int sum = 0;
			for(int j = 0; j < digits.length; j++) {
				String s = Character.toString(digits[j]);
				sum += Integer.parseInt(s);
			}
			result += sum + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
