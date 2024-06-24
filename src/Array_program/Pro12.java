package Array_program;

import java.util.HashMap;
import java.util.Map;

public class Pro12 {

	// dublicate elemets in array

	public static void main(String[] args) {

		int count = 0;
		int[] num = { 10, 20, 30, 30, 40, 40, 50 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int s : num) {

			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}
		
		
		for(Map.Entry<Integer, Integer> s : map.entrySet())
		{
			if(s.getValue()>1)
			{
				System.out.println(s.getKey() + "=>" + s.getValue());
			}
			
		}

	}
	
	

}
