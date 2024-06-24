package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program5 {

	public static void main(String[] args) {
		// count each and every charter in String
		String name = "nikhil patil";
      // cout put Vowel count 
		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {

			if(c=='a'|| c=='A'||c=='e'|| c=='E'||c=='I'|| c=='i'||c=='o'|| c=='u'||c=='O'|| c=='U')
			{
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {

			if (s.getValue() >= 1) {
				System.out.println(s.getKey() + "=>" + s.getValue());
			}

		}

	}

}
