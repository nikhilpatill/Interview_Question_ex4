package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro13 {

	// show the vowels count

	public static void Vowel() {
		String name = "i am nikhil you are boy";

		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				if (map.containsKey(c)) {

					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}

		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {

			if (s.getValue() >= 1) {

				System.out.println(s.getKey() + " => " + s.getValue());

			}

		}

	}

	public static void main(String[] args) {

		Vowel();

	}

}
