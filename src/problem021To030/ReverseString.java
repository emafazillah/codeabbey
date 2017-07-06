package problem021To030;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		String input = "";
		input += scan.nextLine();
		String[] arr = input.split(" ");
		String[] arr_reverse = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr_reverse[i] = arr[arr.length - i - 1];
			char[] carr = arr_reverse[i].toCharArray();
			char[] carr_reverse = new char[carr.length];
			String input_reverse = "";
			for(int j = 0; j < carr.length; j++) {
				carr_reverse[j] = carr[carr.length - j - 1];
				input_reverse += Character.toString(carr_reverse[j]);
			}
			result += input_reverse + " "; 
		}
		System.out.println(result.trim());
		scan.close();
	}

}
