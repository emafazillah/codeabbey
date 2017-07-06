package problem011To020;

import java.util.Scanner;

public class VowelCount {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String result = "";
		for(int i = 0; i < n; i++) {			
			int count = 0;
			String data = "";
			data += scan.nextLine();
			char[] arr = data.toCharArray();
			for(int j = 0; j < arr.length; j++) {
				if(Character.toString(arr[j]).equalsIgnoreCase("a") || 
						Character.toString(arr[j]).equalsIgnoreCase("e") || 
						Character.toString(arr[j]).equalsIgnoreCase("i") || 
						Character.toString(arr[j]).equalsIgnoreCase("o") || 
						Character.toString(arr[j]).equalsIgnoreCase("u") || 
						Character.toString(arr[j]).equalsIgnoreCase("y")) count++;  
			}
			result = result + Integer.toString(count) + " ";
		}		
		System.out.println(result.trim());
		scan.close();
	}

}
