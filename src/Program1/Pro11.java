package Program1;

public class Pro11 {

	// remove the space in between charater 
	public static void main(String[] args) {

		String name = "nikhil patil ganesh aihi";
	
		System.out.println(name);
		String newnm = name.replaceAll("\\s", "");
		
		System.out.println(newnm);
	}
	
}
