package String_Program;

import java.util.HashMap;
import java.util.Map;

public class Pro14 {

	// show the vowels count

	public static void Vowel() {
		String name = "i am nikhil you are boy";

		String rev= "";
		
	String[] ch = 	name.split(" ");
		
	
	for(String s : ch)
	{
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev= rev+s.charAt(i);
			
		}
		
		
	}
	
	System.out.println(rev);
		
	}

	public static void main(String[] args) {

		Vowel();

	}

}
