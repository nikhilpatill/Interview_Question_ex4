package Program1;

import java.util.HashMap;
import java.util.Map;

public class Practice {

//	aeiou => count   Nikhil 

	public static void main(String[] args) {

		String name = "nikhil";

		int count = 0;

		char[] ch = name.toCharArray();

		for (int i = 0; i < +ch.length - 1; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')

			{

				count++;

			}

		}

		System.out.println("count of " + count);

	}

}
