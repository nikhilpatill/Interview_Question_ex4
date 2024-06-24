package Program1;

import java.util.ArrayList;

public class Pro18 {
	static int cout = 0;

	public static void nik() {

		// fybonaysis series

		int num = 5;

		int a;
		int b = 1;
		int c = 0;

		for (int i = 0; i <= num; i++) {

			a = b;
			b = c;
			c = a+b;

			System.out.println(c);
		}

	}

	public static void main(String[] args) {

		nik();

	}

}
