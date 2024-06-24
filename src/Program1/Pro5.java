package Program1;

public class Pro5 {

	// Remove the digit in name
	public static void main(String[] args) {

		String name = "nikhil2020";
		
		System.out.println("main String "+name);
		
		String newname  = name.replaceAll("[0-9]", "");
		System.out.println("remove the digit in String =>"+newname);
		
		// remove the charter in string 
		
		String digit =  name.replaceAll("[a-zA-Z]", "");
		System.out.println("remove the charter => "+digit);

	}
}
