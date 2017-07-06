package problem001To010;

import java.util.Scanner;

public class SumsInLoop {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String output = "";
		for(int i = 0; i < n; i++) {
			int result = scan.nextInt() + scan.nextInt(); 			
			output = output + Integer.toString(result) + " ";
		}
		System.out.println(output.trim());
		scan.close();
	}

}
