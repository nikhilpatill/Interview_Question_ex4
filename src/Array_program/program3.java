package Array_program;

import java.util.ArrayList;

public class program3 {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 30, 40, 50, 60 };
		// [30, 20, 10, 40, 50, 60]

		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (i = 0; i <= arr.length - 1; i++) {

			if (arr[i] > 0) {
				list.add(arr[i]);

			} else if (arr[i] == 0) {
				list2.add(arr[i]);
			}

		}

		System.out.println(list);

		System.out.println(list2);

		list.addAll(list2);
		System.out.println(list);

	}

}
