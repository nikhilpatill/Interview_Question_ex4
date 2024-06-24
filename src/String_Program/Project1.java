package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Project1 {
	
	
	public static void main(String[] args) {

		String name = "Great Responsibilities";

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
			if (s.getKey() >=1) {
				System.out.println(s.getKey() + s.getValue());

			}
		}

	}

}
