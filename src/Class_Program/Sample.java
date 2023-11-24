package Class_Program;

import java.util.Scanner;

public class Sample {

	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		int n,k;
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new  int[n];
		
		
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
		if(a[i]%k==0)
			System.out.print("1 ");
		else
			System.out.print("0 ");
	}
		
	}

}
