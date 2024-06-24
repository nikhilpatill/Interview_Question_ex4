package Map_Related_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program1 {
	
	public static void Game()
	{
		
		Map<Integer,String> map =new  HashMap<Integer,String>();
		map.put(1, "nikhil");
		map.put(2, "patil");
		map.put(3, "patil");
		map.put(4, "kem");
		map.put(3, "nikhil");
		
		
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+ " = " +m.getValue());
			 if(map.containsKey(m.getKey()))
			{
				System.out.println("key is present "+m);
			}
			
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		Game();
	 Map<Integer,String> map=new HashMap<Integer,String>();  
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map
		//Set set = map.entrySet();// Converting to Set so that we can traverse
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
			if(map.containsValue(m.getValue()))
			{
				System.out.println("value is present "+m);
			}
			
		}
		
		
	    
		
		
	}
	}



