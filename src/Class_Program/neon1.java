package Class_Program;

import java.util.Scanner;

public class neon1 {

	public static void main(String_Example[] args) {
		int sum=0,n;
		Scanner s=new scanner(system.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		int square=n*n;
		while(square!=0) {
			int digit=square%10;
			sum=sum+digit;
			square=square/10;
			if(n==sum)
				System.out.println(n+"neon number.q");
		}

	}

}
