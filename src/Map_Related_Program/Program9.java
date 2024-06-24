package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program9 {

	public static void main(String[] args) {
		// count each and every charter in String
		String[] ch = { "nikhil", "parshant", "nikhil", "parshant", "parshant", "nam" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String c : ch) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry<String, Integer> s : map.entrySet()) {

			System.out.println(s.getKey() + "=>" + s.getValue());

		}

	}

}
