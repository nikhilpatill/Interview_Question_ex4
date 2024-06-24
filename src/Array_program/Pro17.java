package Array_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Pro17 {

	// accending order sort array Sort array

	public static void nik(Integer[] a, int numsize) {

		Arrays.sort(a);

		for (int i = 0; i < numsize; i++) {

			System.out.println(a[i]);

		}

	}

	public static void main(String[] args) {

		Integer[] a = { 10, 40, 30, 60, 50 };

		int n = a.length;

		nik(a, n);

	}

}
