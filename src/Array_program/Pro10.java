package Array_program;

import java.util.Arrays;
import java.util.Collections;

public class Pro10 {

	// print second max value arrays value

	public static void secondMax(Integer[] arr, int numsize) {

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 1; i < numsize; i++) {
			if (arr[i] != arr[0]) {

				System.out.println("secondmax value=>" + arr[i]);
				break;
			}

		}

	}

	public static void main(String[] args) {

		Integer[] arr = { 10, 30, 40, 50, 28, 80, 70 };

		int n = arr.length;

		secondMax(arr, n);
	}
}
