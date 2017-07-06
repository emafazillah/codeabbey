package problem041To050;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfThree {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int[] arr = new int[3];
			arr[0] = scan.nextInt();
			arr[1] = scan.nextInt();
			arr[2] = scan.nextInt();
			Arrays.sort(arr);
			result += Integer.toString(arr[1]) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
