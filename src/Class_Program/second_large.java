package Class_Program;

import java.util.Scanner;

public class second_large {

	public static void main(String[] args) {
		{
			int n,temp;
			Scanner s= new Scanner(System.in);
			System.out.print("enter no. of elements you want in array(minimum 2):");
			n=s.nextInt();
			int a[]=new int[n];
			System.out.println("enter all the elements:");
			for (int i=0; i<n;i++)
			{
				a[i]=s.nextInt();
			
			}
			for (int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if (a[i] > a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("second Largest:"+a[n-2]);
			System.out.println("smallest:"+a[0]);
		}

	}

}
