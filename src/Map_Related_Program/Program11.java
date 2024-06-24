package Map_Related_Program;

import java.util.HashMap;
import java.util.Map;

public class Program11 {

	public static void main(String[] args) {
		// count each and every charter in String
		String name = "i am nikhil";
		//output = i am lihkin 

		String[] ch = name.split(" ");
		
		String revStrig = "";

		for (String c : ch) {
			
			for(int i=c.length()-1;i>=0;i--)
			{
				
				revStrig = revStrig+c.charAt(i);
				
			}

		}
		
		System.out.println(revStrig);

	}

}
