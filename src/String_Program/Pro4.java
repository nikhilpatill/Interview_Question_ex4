package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro4 {

	// count the total number of dublicate arrayString
	public static void main(String[] args) {

		String[] name = { "nikhil", "parshant", "nikhil", "parshant" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String name1 : name) {

			if (map.containsKey(name1)) {

				map.put(name1, map.get(name1)+1);
			}

			else {
				map.put(name1, 1);
			}

		}

		for (Map.Entry<String, Integer> s : map.entrySet()) {

			if (s.getValue() >= 1) {
				System.out.println(s.getKey() + "=>" + s.getValue());
				
			}
		}

	}

}
