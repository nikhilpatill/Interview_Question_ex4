package Program1;

public class Pro3 {
	
	//count the total number of  dublicate  charater
	public static void main(String[] args) {
		
		String name = "nikhil";
		int count=0;
	   
	   for(int i=0;i<=name.length()-1;i++)
	   {
		 
		   for(int j=i+1; j<=name.length()-1;j++)
		   {
			   
			   if(name.charAt(i)==name.charAt(j))
			   {
				   System.out.println(name.charAt(i));
				   count++;
				   System.out.println("count the total numbar of charate "+ count);
					
			   }
		   }
		   
		  
	   }
	   
	
		
		
		
		
	}

}
