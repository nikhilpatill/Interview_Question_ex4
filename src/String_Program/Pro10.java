package String_Program;

public class Pro10 {

	// charater reverse only

	public static void Vowel() {
		String name = "i am nikhil";

		String[] ch = name.split(" ");

		String rev = "";

		for (String s : ch) {

			for (int i = s.length() - 1; i >= 0; i--) {

				rev = rev + s.charAt(i);

			}

		}

		System.out.println(rev);

	}

	public static void main(String[] args) {

		Vowel();

	}

}
