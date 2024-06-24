package String_Program;

public class Pro6 {

	// count the total number of n && i charater count ;
	public static void main(String[] args) {

		String name = "nikhil patil ganesh aihi";
		int count = 0;
		for (int i = 0; i <=name.length() - 1; i++) {

			if (name.charAt(i) == 'i') {
				System.out.println(name.charAt(i));
				count++;
				

			

			}

			
			
		}
		
		System.out.println("i count "+ count);
	}
}
