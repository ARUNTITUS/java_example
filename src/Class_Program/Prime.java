package Class_Program;

import java.util.Scanner;

public class Prime {

	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;		
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if (flag==0 && n!=1)
			System.out.println(n+"is a prime number");
		else if(n!=1)
			System.out.println(n+"is not a prime number");
		s.close();

	}

}
