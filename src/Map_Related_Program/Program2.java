package Map_Related_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program2 {
	
	public static void Game()
	{
		
		HashMap<Integer,String> map =new  HashMap<Integer,String>();
		map.put(1, "nikhil");
		map.put(2, "patil");
		map.put(3, "patil");
		map.put(4, "kem");
		map.put(3, "nikhil");
		
		System.out.println(map);
		
		System.out.println(map.containsValue("nikhil"));
		System.out.println(map.containsKey(3));
		System.out.println("pass key and get value => "+map.get(2));
		System.out.println(map.replace(3, "kempatil"));
		System.out.println(map);
		System.out.println(map.size());
		
		
		HashMap<Integer,String> map2 =new  HashMap<Integer,String>();
		
		map2.put(1, "pooja");
		
		
		map.putAll(map2);
		
		
		for(Map.Entry s: map.entrySet())
		{
			System.out.println(s.getKey()+"="+s.getValue());
		}
		
		
		map.putIfAbsent(5, "5");
		System.out.println("---------------------------------");
		for(Map.Entry s: map.entrySet())
		{
			System.out.println(s.getKey()+"="+s.getValue());
		}
		
		
	
		
		
	}
	

	public static void main(String[] args) {
		
		Game();
	
	}
	}



