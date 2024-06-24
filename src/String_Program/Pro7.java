package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro7 {

	// Remove the digit in name count charater
	public static void main(String[] args) {

		String name = "nikhil2020";

		String StringN = name.replaceAll("[0-9]", "");

		System.out.println(StringN);

		char[] ch = StringN.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}
		
		
		for(Map.Entry<Character, Integer> s: map.entrySet())
		{
			
			if(s.getValue()>=1)
			{
				System.out.println(s.getKey() + ""+ s.getValue());
				
			}
			
		}

	}
}
