package problem001To010;

import java.util.Scanner;

public class SumInLoop {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;
		for(int i = 0; i < n; i++) {
			result += scan.nextInt();
		}
		System.out.println(result);
		scan.close();
	}

}
