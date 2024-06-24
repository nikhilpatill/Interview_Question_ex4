package Array_program;

import java.util.Arrays;
import java.util.Collections;

public class Pro11 {

	// print second min value arrays value

	public static void secondMin(Integer[] arr, int numsize) {

		Arrays.sort(arr);

		for (int i = 1; i < numsize; i++) {

			if (arr[i] != arr[0]) {

				System.out.println("second Minium value =>" + arr[i]);
				break;
			}

		}

	}

	public static void main(String[] args) {

		Integer[] arr = { 10, 30, 40, 50, 28, 80, 70 };

		int n = arr.length;

		secondMin(arr, n);
	}
}
