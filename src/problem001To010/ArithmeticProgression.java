package problem001To010;

import java.util.Scanner;

public class ArithmeticProgression {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int N = scan.nextInt();
			int output = 0;
			for(int j = 0; j < N; j++) {
				output += A + (j * B);
			}
			result = result + Integer.toString(output) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
