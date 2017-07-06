package problem001To010;

import java.util.Arrays;
import java.util.Scanner;

public class Triangles {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int[] triangle = new int[3];
			for(int j = 0; j < 3; j++) {
				triangle[j] = scan.nextInt();
			}
			Arrays.sort(triangle);
			int A = triangle[0];
			int B = triangle[1];
			int C = triangle[2];
			if((A + B) < C) 
				result = result + "0 ";
			else
				result = result + "1 ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
