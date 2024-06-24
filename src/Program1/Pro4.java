package Program1;

public class Pro4 {
	
	//count the total number of  dublicate  arrayString 
	public static void main(String[] args) {
		
		String[] name = { "nikhil", "parshant", "nikhil", "parshant"};
		int count=0;
	   
	   for(int i=0;i<=name.length-1;i++)
	   {
		 
		   for(int j=i+1; j<=name.length-1;j++)
		   {
			   
			   if(name[i]==name[j])
			   {
				   System.out.println(name[i]);
				   count++;
				   System.out.println("count the total numbar of charate "+ count);
					
			   }
		   }
		   
		  
	   }
	   
	
		
		
		
		
	}

}
