package problem011To020;

import java.util.Scanner;

public class ModuloAndTimeDifference {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int n = Integer.parseInt(scan.nextLine());		
		for(int i = 0; i < n; i++) {
			String data = "";
			data += scan.nextLine();
			String[] arr = data.split(" ");
			int start = (Integer.parseInt(arr[0]) * 24 * 60 * 60) + 
					(Integer.parseInt(arr[1]) * 60 * 60) + 
					(Integer.parseInt(arr[2]) * 60) + 
					Integer.parseInt(arr[3]);
			int end = (Integer.parseInt(arr[4]) * 24 * 60 * 60) + 
					(Integer.parseInt(arr[5]) * 60 * 60) + 
					(Integer.parseInt(arr[6]) * 60) + 
					Integer.parseInt(arr[7]);
			int diff = Math.abs(end - start);			
			int day = diff / (24 * 60 * 60);
			int hour = (diff % (24 * 60 * 60)) / (60 * 60);
			int min = ((diff % (24 * 60 * 60)) % (60 * 60)) / 60;
			int sec = ((diff % (24 * 60 * 60)) % (60 * 60)) % 60;
			result += "(" + Integer.toString(day) + " " +  
					Integer.toString(hour) + " " + 
					Integer.toString(min) + " " + 
					Integer.toString(sec) + ") ";
		}
		for(int i = 0; i < n; i++) {
			
		}
		System.out.println(result.trim());
		scan.close();
	}

}
