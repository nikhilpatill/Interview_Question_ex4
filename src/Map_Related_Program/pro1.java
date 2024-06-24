package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class pro1 {

	public static void display() {
		int[] arr = { 5, 2, 3, 6, 8, 3, 2 };
	//	output = > Evennumber count    2=1, 6=>1, 8=>1
		

		int count = 0;

		Map<Integer, Integer> s = new HashMap<Integer, Integer>();

		for (Integer num : arr) {

			if (num % 2 == 0) {
				
				if(s.containsKey(num))
				{
				s.put(num, s.get(num)+1);
				
				}
				else
				{
					s.put(num,1);
					
				}

			}
			
		}

		for (Map.Entry<Integer, Integer> en : s.entrySet()) {

			if (en.getKey() >= 1) {
				System.out.println(en.getKey() + "=>" + en.getValue());

			}

		}

	}

	// count the total number of Array
	public static void main(String[] args) {
		// Evennumber();
		display();

	}

}
