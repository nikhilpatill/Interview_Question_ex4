package Program1;

public class Project1 {
	public static void main(String[] args) {
		
		String name ="Great Responsibilities";
		
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			for(int j=i+1;j<name.length()-1;j++)
			{
				
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println(name.charAt(j));
					count++;
					System.out.println(count);
				}
				
			}
		}
		
		System.out.println(count);

	}

}
