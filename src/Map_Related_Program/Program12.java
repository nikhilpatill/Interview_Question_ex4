package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program12 {

	public static void main(String[] args) {
		// count each and every charter in String
		String name = "nikhil patil";

		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {

			if (s.getValue() >= 1) {
				System.out.println(s.getKey() + "=>" + s.getValue());
			}

		}

	}

}
