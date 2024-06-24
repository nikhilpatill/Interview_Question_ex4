package Program1;

import java.util.ArrayList;

public class Pro16 {
	static int cout=0;
	// Buble Sort 

	public static void nik() {
     
	int[]a = {10,10,20,20,30,30,40,50};
	int i;
	for(i=0;i<=a.length-1;i++)
	{
		if(a[i]==30)
		{
			System.out.println(a[i]);
			cout++;
		
			
		}
		
		
	}
	
	System.out.println("total accurance "+cout);
	

					
		
	}

	public static void main(String[] args) {

		nik();
		

	}

}
