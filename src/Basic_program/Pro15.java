package Basic_program;

import java.util.ArrayList;

public class Pro15 {

	// Buble Sort swap the two number

	public static void nik() {

		int a = 20;
		int b = 30;

		System.out.println(a + "" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + "" + b);

	}

	public static void main(String[] args) {

		nik();
		int a = 20;
		int b = 30;

		System.out.println(a + "" + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println(a + "" + b);

	}

}
