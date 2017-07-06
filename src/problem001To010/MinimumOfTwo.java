package problem001To010;

import java.util.Scanner;

public class MinimumOfTwo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a > b) 
				result = result + Integer.toString(b) + " ";
			else
				result = result + Integer.toString(a) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
