package Inheritance;

public class Program1 {

	public void animal() {
		System.out.println("this is animal ");
	}

}

class Program extends Program1
{
	public  void sysou() {
		
		System.out.println("this is cat ");
		
	}

	
	public static void main(String[] args) {
		
		Program s =new Program();
		
		s.sysou();
		s.animal();
		
	}
}
