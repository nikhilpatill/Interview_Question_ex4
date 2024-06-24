package Collection;

import java.util.ArrayList;

public class program1 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (i = 0; i <= arr.length - 1; i++) {

			if (i >= 0 && i <= 2) {
				list.add(arr[i]);
			} else if (i >= 3 && i <= 5) {
				list2.add(arr[i]);
			}

		}

		System.out.println(list);
		System.out.println(list2);

		list2.addAll(list);

		System.out.println(list2);

	}

}
