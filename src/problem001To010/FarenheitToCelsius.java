package problem001To010;

import java.util.Scanner;

public class FarenheitToCelsius {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			// Convert degrees of Farenheit to Celsius
			double farenheit = scan.nextDouble();
			double celsius = ((farenheit + 40) / 1.8) - 40;
			result = result + Math.round(celsius) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
