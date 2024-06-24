package Array_program;

import java.util.ArrayList;

public class program2 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		// [30, 20, 10, 40, 50, 60]

		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (i = 0; i <= arr.length - 1; i++) {

			int temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;

			list.add(arr[i]);
		}

		System.out.println(list);

	}

}
