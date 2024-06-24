package Program1;

public class pro2 {
	
	//count the total number of charater 
	public static void main(String[] args) {
		
		String name =  "nikhil";
		int count=0;
	   char[] ch = name.toCharArray();
	   
	   for(int i=0 ; i<=ch.length-1;i++)
	   {
		   System.out.println(ch[i]);
		   count ++;
		   
	   }
	   
	   System.out.println("count the total numbar of charate "+ count);
		
		
		
		
		
	}

}
