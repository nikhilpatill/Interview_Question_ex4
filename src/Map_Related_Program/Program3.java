package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program3 {

	public static void Gamee() {

		String name = "gratet aoppertunityh";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = name.toCharArray();
		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {

			if (s.getValue() > 1) {

				System.out.println(s.getKey() + ":" + s.getValue());

			}

		}

	}

	public static void Game() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "nikhil");
		map.put(2, "patil");
		map.put(3, "patil");
		map.put(4, "kem");
		map.put(3, null);
		map.put(null, null);

		System.out.println("before remove" + map);
		map.remove(1);
		System.out.println("after remove " + map);

		System.out.println("------------------------------------");

		for (Map.Entry s : map.entrySet()) {
			System.out.println(s.getKey() + "=" + s.getValue());
		}

	}

	public static void main(String[] args) {

		Gamee();

	}
}
