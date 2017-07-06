package problem011To020;

import java.math.BigInteger;
import java.util.Scanner;

public class ModularCalculator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger result = new BigInteger("0"); 
		BigInteger calculate = new BigInteger(scan.next());
		while(scan.hasNextLine()) {
			String sign = scan.next();			
			if(!sign.equalsIgnoreCase("exit")) {
				BigInteger next = new BigInteger(scan.next());
				if(sign.equals("+")) 
					calculate = calculate.add(next);
				else if(sign.equals("*")) 
					calculate = calculate.multiply(next);
				else if(sign.equals("%")) 
					result = calculate.mod(next);
			} else 
				break;
		}
		System.out.println(result);
		scan.close();
	}

}
