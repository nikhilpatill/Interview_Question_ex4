package Program1;

import java.util.ArrayList;

public class Pro19 {
	static int cout = 0;

	public static void nik() {

		// prime number

		int num = 3;

		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("this is prime number ");
		} else {
			System.out.println("this is not prime number ");
		}

	}
	
	public static void show()
	{
		// this is prime number 
		
		int num=2;
		
		boolean flag =false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
			
			
		}
		
		if(!flag)
		{
			System.out.println("this is prime number ");
		}
		else
		{
			System.out.println("this is not prime number ");
		}
		
		
	}

	public static void main(String[] args) {

		show();

	}

}
