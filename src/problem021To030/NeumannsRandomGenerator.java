package problem021To030;

import java.util.Scanner;

public class NeumannsRandomGenerator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int input = scan.nextInt();
			int input_pow = input * input;
			String middle = Integer.toString(input_pow);
			char[] arr = middle.toCharArray();
			for(int j = 0; j < arr.length; j++) {
				
			}
		}
		System.out.println(result.trim());
		scan.close();
	}

}
