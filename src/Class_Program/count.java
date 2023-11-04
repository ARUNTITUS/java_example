package Class_Program;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array: ");
		int n=s.nextInt();
		int  count =0;
		int arr[]=new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the element of which you want to"+"count number of occurrences:");
		int search=s.nextInt();
		
		for(int i=0;i<n;i++) {
			if (arr[i]==search)
				count++;
		}
		if(count>0)
			System.out.println("Number of Occurrence of the Element:"+count);
		else
			System.out.println("Number of Occurrence of the Element:"+count);
		s.close();       
	}

}
