package Program1;

import java.util.ArrayList;

public class Pro14 {

	// dublicate elemets reverse  dublicate elemet 

	public static void main(String[] args) {

		int count = 0;
		int[] num = { 10, 20, 30, 30, 40,  40, 50 };
		
		ArrayList<Integer> s =new ArrayList<Integer> ();
		for (int i = 0; i <= num.length - 1; i++) {

			for (int j = i + 1; j <= num.length - 1; j++) {

				if (num[i] == num[j]) {
					
					System.out.println(num[j]);
					s.add(num[j]);
					count++;
				}

			}

		}

		  
	//	System.out.println("reverse dublicate Elemets =>"+s.reversed());
		
		System.out.println("count of dublicate =>" + count);

	}

}
