package Class_Program;

import java.util.Scanner;

public class pascal {

	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=s.nextInt();
		char ch;
		for(int i=1;i<=n;i++) {
			ch='A';
			for(int j=1;j<=1;j++)	
				System.out.print(ch++);
			System.out.println();
		}
		s.close();
	}

}
