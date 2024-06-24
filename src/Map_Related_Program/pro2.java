package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class pro2 {

	public static void display() {
		int[] arr = { 5, 2, 3, 6, 8, 3, 2 };
	//	output = > odd number dublicate count count    2=1, 6=>1, 8=>1
	
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int a : arr)
		{
			
			if(a%2==1)
			{
				
			if(map.containsKey(a))
			{
				map.put(a, map.get(a)+1);
				
			}
			else
			{
				map.put(a, 1);
			}
			

			}
			
		}
		
		
		for(Map.Entry<Integer, Integer> s: map.entrySet())
		{
			
			if(s.getValue()>=1)
			{
				
				System.out.println(s.getKey() +"=>"+ s.getValue());
			}
			
		}
		
		
		
	}

	// count the total number of Array
	public static void main(String[] args) {
		// Evennumber();
		display();

	}

}
