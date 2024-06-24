package Array_program;

import java.util.Arrays;
import java.util.Collections;

public class Pro13 {

	// print third max value arrays value

	public static void ThirdMax(Integer[] arr, int numsize) {

		Arrays.sort(arr, Collections.reverseOrder());
		
		//first sort array and reverse it 
		

		for (int i = 2; i < numsize; i++) {

			
			if (arr[i] != arr[1]) {
				System.out.println("Third max value =" + arr[i]);
				break;
			}
		}

	}

	public static void main(String[] args) {

		Integer[] arr = { 10, 30, 40, 50, 28, 80, 70 };

		int n = arr.length;

		ThirdMax(arr, n);

	}
}
