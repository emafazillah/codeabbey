package problem041To050;

import java.util.Scanner;

public class DiceRolling {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			double random_no = Math.floor(scan.nextDouble() * 6);
			long roll = (long) random_no + 1;
			result += Long.toString(roll) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
