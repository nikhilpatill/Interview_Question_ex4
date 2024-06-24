package Array_program;

import java.util.Arrays;
import java.util.Collections;

public class Pro7 {

	// min value in array

	public static void min(Integer[] arr, int numsize) {

		Arrays.sort(arr);

		for (int i = 0; i < numsize; i++) {

				System.out.println("minium value in array =>" + arr[0]);

				return;
			}

		}

	

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 40, 70, 50 };

		int n = arr.length;

		min(arr, n);

	}
}
