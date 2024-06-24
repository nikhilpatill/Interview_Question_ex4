package Array_program;

import java.util.Arrays;
import java.util.Collections;

public class Pro9 {

	// decending order print arrays value

	public static void display(Integer[] arr, int numsize) {

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < numsize; i++) {
			System.out.println(arr[i]);

		}

	}

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 40, 70, 50 };

		int n = arr.length;

		display(arr, n);

	}
}
