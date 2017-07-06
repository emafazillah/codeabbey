package problem041To050;

import java.util.Scanner;

public class CollatzSequence {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int n = scan.nextInt();
		int[] xs = new int[n];
		for(int i = 0; i < n; i++) {
			xs[i] = scan.nextInt();
		}
		for(int x : xs) {
			int count = 0;
			int x_init = x;
			int x_next = 0;
			//System.out.println("x===" + x);
			while(x_init > 1) {
				//System.out.println("x_init===" + x_init);
				if(x_init % 2 == 0) // even 
					x_next = x_init / 2;
				else // odd
					x_next = 3 * x_init + 1;
				x_init = x_next;
				//System.out.println("x_next===" + x_next);
				count++;
			}
			result += Integer.toString(count) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
