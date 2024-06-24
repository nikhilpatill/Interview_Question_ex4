package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro3 {

	// count the total number of dublicate charater
	public static void main(String[] args) {

		String name = "i am nikhil this is good opportunity";

		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char n : ch) {

			if (map.containsKey(n)) {

				map.put(n, map.get(n) + 1);

			} else {
				map.put(n, 1);
			}

		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {
			if (s.getValue() >= 1) {

				System.out.println(s.getKey() + "=>" + s.getValue());

			}

		}

	}

}
