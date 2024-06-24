package Program1;

import java.util.ArrayList;

public class Pro13 {

	// dublicate elemets reverse

	public static void main(String[] args) {

		int count = 0;
		int[] num = { 10, 20, 30, 30, 40, 40, 50 };

		ArrayList<Integer> s = new ArrayList<Integer>();
		ArrayList<Integer> s2 = new ArrayList<Integer>();

		for (int i = 0; i < num.length - 1; i++) {
			    s.add(num[i]);

		}
		
		System.out.println(s);

		//sSystem.out.println("reverse  Elemets =>" + s.reversed());


		System.out.println("------------------------------------------------");

		for (Integer t : num)

		{
			s2.add(t);
		}

		System.out.println(s2);

		//System.out.println("reverse  Elemets =>" + s2.reversed());

	}

}
