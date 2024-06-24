package Program1;

public class Pro8 {

	// max value in array
		public static void main(String[] args) {

			int[] num = { 10, 20, 40,70, 50 };

			int max=num[0];
			
			for(int i=1;i<=num.length-1;i++)
			{
				
				if(max<num[i])
				{
					max=num[i];
				}
				
			}
			
			System.out.println(max);
			
			
			
		}
}
