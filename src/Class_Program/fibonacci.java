package Class_Program;

import java.util.Scanner;

public class fibonacci {
	public static void main(String_Example[] args) {
Scanner s= new Scanner(System.in);
		
		System.out.println("enter the number");
		int n =s.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		s.close();
	}

}