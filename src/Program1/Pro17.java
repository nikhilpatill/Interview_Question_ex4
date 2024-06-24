package Program1;

import java.util.ArrayList;

public class Pro17 {

	// Buble Sort 

	public static void nik() {

		int[] a= {10,40,30,60,50};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}
		}
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			
		}

	}

	public static void main(String[] args) {

		nik();
		int a = 20;
		int b = 30;

		System.out.println(a + "" + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println(a + "" + b);

	}

}
