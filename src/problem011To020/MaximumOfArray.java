package problem011To020;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[300];
		for(int i = 0; i < 300; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Integer.toString(arr[299]) + " " + Integer.toString(arr[0]));
		scan.close();
	}

}
