package problem021To030;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortWithIndexes {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result = "";
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			map.put(scan.nextInt(), i + 1); // Initial index
		}
		Map<Integer, Integer> tree = new TreeMap<Integer, Integer>(map);
		for(Map.Entry<Integer, Integer> entry : tree.entrySet()) {
			result += Integer.toString(entry.getValue()) + " ";
		}
		System.out.println(result.trim());
		scan.close();
	}

}
