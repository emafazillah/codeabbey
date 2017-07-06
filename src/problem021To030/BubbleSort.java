package problem021To030;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";		
		int[] arr = new int[n];		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}		
		int swap = 0; // count swap
		int pass = 0; // count until pass
		boolean isStop = false;
		do {
			int count = 0;
			for(int i = 0; i < (n - 1); i++) {
				int temp = arr[i];
				if(arr[i] > arr[i + 1]) {
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap++;
					count++;
				}
				//System.out.print("a["+i+"]==="+arr[i]);
				//System.out.println(" a["+Integer.toString(i+1)+"]==="+arr[i+1]);				
			}
			pass++;
			count++;
			if(count == 1) isStop = true;
			//System.out.println("isStop==="+isStop);
		} while(!isStop);
		result += Integer.toString(pass) + " " + Integer.toString(swap);
		System.out.println(result.trim());
		scan.close();
	}

}
