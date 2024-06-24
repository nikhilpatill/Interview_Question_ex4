package String_Program;

public class Pro9 {

	//palidrom String  mom thsis palidrom

	public static void main(String[] args) {

		String name = "nikhil";

		String rev = "";

		for (int i = name.length() - 1; i > 0; i--) {

			rev = rev + name;

		}

		if (rev.equalsIgnoreCase(name)) {
			System.out.println("this is the palidrom");
		} else {
			System.out.println("this is not palidrom");
		}

	}

}
