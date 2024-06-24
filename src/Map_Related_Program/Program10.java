package Map_Related_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program10 {

	public static void main(String[] args) {

		String name = "i am nikhil";
		// output => i=1
		// am =2
		// nikhil=6
	

		String[] ch = name.split(" ");

		String rev = "";

		Map<String, Integer> s = new HashMap<String, Integer>();
		for (String name1 : ch) {

			if (s.containsKey(name1)) {

				s.put(name1, s.get(name1) + 1);
			} else {
				s.put(name1, 1);
			}

		}

	
	
	for(String c : s.keySet())
	{
		System.out.println(c + "=>"+c.length());
	}
		
	}

}
