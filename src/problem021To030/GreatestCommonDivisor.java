package problem021To030;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int gcd = 0;
			int count = 0;
			if(a > b) 
				count = b;
			else
				count = a;
			for(int j = 1; j < count + 1; j++) {
				if(a % j == 0 && b % j == 0) gcd = j;
			}
			int lcm = a * b / gcd;
			result += "(" + gcd + " " + lcm + ")" + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
