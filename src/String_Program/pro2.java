 package String_Program;

import java.util.HashMap;
import java.util.Map;

public class pro2 {

	// count the total number of charater

	public static void Count() {
		String name = " nikhil";

		Map<String, Integer> map = new HashMap<String, Integer>();

		if (map.containsKey(name)) {

			map.put(name, map.get(name) + 1);

		} else {
			map.put(name, 1);
		}
		
		
		for(String n :map.keySet())
		{
			System.out.println(n + "=>"+ n.length());
			
		}

	}

	public static void main(String[] args) {

		Count();
		
		
	
	}

}
