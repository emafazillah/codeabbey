package problem011To020;

import java.util.Scanner;

public class AverageOfAnArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String result = "";
		for(int i = 0; i < n; i++) {
			double avg = 0;
			String data = "";
			data += scan.nextLine();
			String[] arr = data.split(" ");
			for(int j = 0; j < arr.length; j++) {
				avg += Double.parseDouble(arr[j]);
			}
			long avg_round = Math.round(avg / (arr.length - 1));
			result += Long.toString(avg_round) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
