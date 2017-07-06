package problem001To010;

import java.util.Scanner;

public class Rounding {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			float first = scan.nextFloat();
			float second = scan.nextFloat();
			int output = Math.round(first / second);
			result = result + Integer.toString(output) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
