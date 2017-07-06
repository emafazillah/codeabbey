package problem021To030;

import java.util.Scanner;

public class BodyMassIndex {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			double weight = scan.nextDouble();
			double height = scan.nextDouble();
			double BMI = weight / Math.pow(height, 2);
			if(BMI < 18.5) 
				result += "under" + " ";
			else if(BMI >= 18.5 && BMI < 25.0) 
				result += "normal" + " ";
			else if(BMI >= 25.0 && BMI < 30.0) 
				result += "over" + " ";
			else 
				result += "obese" + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
