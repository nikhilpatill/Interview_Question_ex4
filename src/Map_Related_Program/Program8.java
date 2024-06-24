package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program8 {

	public static void main(String[] args) {
		// count each and every charter in String
		String name = "i am nikhil";

		String[] ch = name.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String c : ch) {

			if (map.containsKey(c)) {
				
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (String s : map.keySet()) {

		
				System.out.println(s+ "=>" + s.length());
			

		}

	}

}
