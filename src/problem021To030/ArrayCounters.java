package problem021To030;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCounters {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int n = scan.nextInt();
		int m = scan.nextInt();		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int count = 1;
		for(int i = 0; i < n; i++) {
			int curr = arr[i];
			if(i < n - 1) {
				int next = arr[i + 1];
				if(curr == next) 
					count++;
				else {
					result += Integer.toString(count) + " ";
					count = 1;
				}
			} else{
				result += Integer.toString(count) + " ";
			}
		}
		System.out.println(result.trim());
		scan.close();
	}

}
