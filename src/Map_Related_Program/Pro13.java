package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro13 {

	// dublicate elemets in array

	public static void main(String[] args) {

		int count = 0;
		int[] num = { 10, 20, 30, 30, 40,  40, 50 };
		
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		    for(int i : num)
		    {
		    	
		    	if(map.containsKey(i))
		    	{
		    		map.put(i, map.get(i)+1);
		    	}
		    	else
		    	{
		    		map.put(i, 1);
		    	}
		    	
		    }

		    for(Map.Entry<Integer, Integer> s : map.entrySet())
		    {
		    	if(s.getValue()>=1)
		    	{
		    		System.out.println(s.getKey() + " => " + s.getValue());
		    	}
		    
		    	
		    }
		
		
		
	}
	
	
	

}

