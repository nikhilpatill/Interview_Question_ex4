package Program1;

public class Pro12 {

	// dublicate elemets in array

	public static void main(String[] args) {

		int count = 0;
		int[] num = { 10, 20, 30, 30, 40,  40, 50 };

		for (int i = 0; i <= num.length - 1; i++) {

			for (int j = i + 1; j <= num.length - 1; j++) {

				if (num[i] == num[j]) {
					System.out.println(num[j]);
					count++;
				}

			}

		}

		System.out.println("count of dublicate =>" + count);

	}

}
