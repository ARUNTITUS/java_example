package Class_Program;

import java.util.Scanner;

public class Abundant {

	public static void main(String_Example[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int x=0;
		for( int i=1; i<n; i++) {
			if(n%i==0) 
				x=x+i;
			}
			if(x>=0)
		System.out.println("is an abundant number");
		else {
		System.out.println("is not an anbundant number");
			
	}

}
}





