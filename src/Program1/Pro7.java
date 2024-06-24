package Program1;

public class Pro7 {

	// min value in array
	public static void main(String[] args) {

		int[] num = { 10, 20, 40,70, 50 };

		int min=num[0];
		
		for(int i=1;i<=num.length-1;i++)
		{
			
			if(min>num[i])
			{
				min=num[i];
			}
			
		}
		
		System.out.println(min);
		
		
		
		
	}
}
