package Array_program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pro16 {
	static int cout = 0;
	// count number occurance 30 in array

	public static void nik() {

		int[] a = { 10, 10, 20, 20, 30, 30, 40, 50 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : a) {

			if (num == 30) {

				if (map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				} else {
					map.put(num, 1);
				}
			}
		}

		for (Map.Entry<Integer, Integer> s : map.entrySet()) {

			if (s.getValue() >= 1) {
				System.out.println(s.getKey() + "=>" + s.getValue());
			}
		}

	}

	public static void main(String[] args) {

		nik();

	}

}
