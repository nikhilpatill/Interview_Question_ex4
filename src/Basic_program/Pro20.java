package Basic_program;

import java.util.ArrayList;

public class Pro20 {

	public static void nik() {

		// reverse number

		int num = 1234;
		int reminder;
		int reverse = 0;

		while (num != 0) {

			reminder = num % 10;
			reverse = num * 10 + reminder;
			num = num / 10;
			
			System.out.println(reverse);

		}

	

	}

	public static void main(String[] args) {

		nik();

	}

}
