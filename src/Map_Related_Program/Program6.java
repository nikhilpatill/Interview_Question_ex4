package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program6 {

	public static void main(String[] args) {
		
		String name ="google";
		
		char[] ch = name.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(char c : ch)
		{
			
			if(map.containsKey(c))
			{
				
				map.put(c,map.get(c)+1);
				
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> e : map.entrySet())
		{
			
			if(e.getValue()>=1)
			{
				
			System.out.println(e.getKey()+ " => "+ e.getValue());
				
			}
			
			
		}
		
		
}

}
