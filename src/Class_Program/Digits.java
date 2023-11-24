package Class_Program;

import java.util.Scanner;

public class Digits {

	public static void main(String_Example[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			System.out.print(rem);
		}
		
		s.close();

	}

}