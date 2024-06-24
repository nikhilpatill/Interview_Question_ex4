package Array_program;

import java.util.Arrays;
import java.util.Collections;

public class Pro14 {

	// print third min value arrays value

	public static void ThirdMin(Integer[] arr, int numsize) {

		Arrays.sort(arr);
		
		for(int i=2;i<numsize;i++)
		{
			if(arr[i]!=arr[1])
			{
				System.out.println("thir minmum value ="+arr[i]);
				break;
			}
		}

	}

	public static void main(String[] args) {

		Integer[] arr = { 10, 30, 40, 50, 28, 80, 70 };

		int n = arr.length;

		ThirdMin(arr, n);

	}
}
