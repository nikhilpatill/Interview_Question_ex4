package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro12 {

	// show the vowels count

	public static void Vowel() {
		String name = "i am nikhil you are boy";

		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char m : ch) {

			if (m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u')

			{

				if (map.containsKey(m)) {

					map.put(m, map.get(m) + 1);

				} else {
					map.put(m, 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {
			if (s.getValue() >= 1) {
				System.out.println(s.getKey() + "=>" + s.getValue());
			}
		}

	}

	public static void main(String[] args) {

		Vowel();

	}

}
