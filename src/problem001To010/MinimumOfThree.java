package problem001To010;

import java.util.Scanner;

public class MinimumOfThree {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if((a < b) && (a < c)) 
				result = result + Integer.toString(a) + " ";
			else if((b < a) && (b < c)) 
				result = result + Integer.toString(b) + " ";
			else if((c < a) && (c < b)) 
				result = result + Integer.toString(c) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
