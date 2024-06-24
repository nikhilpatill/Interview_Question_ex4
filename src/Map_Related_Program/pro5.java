package Map_Related_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class pro5 {

	  // second largest elements
    static void print2largest(Integer arr[], int arr_size)
    {
        // Sort the array in descending order
        Arrays.sort(arr,Collections.reverseOrder());
        // Start from second element as first
        // element is the largest
        for (int i = 1; i < arr_size; i++) {
            // If the element is not
            // equal to largest element
            if (arr[i]!=arr[0]) {
            	
                System.out.printf("The first largest "
                                      + "element is %d\n",
                                  arr[i]);
                return;
            }
        }

        System.out.printf("There is no second "
                          + "largest element\n");
    }

    // Driver code
    public static void main(String[] args)
    {
        Integer arr[] = {12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }



}
