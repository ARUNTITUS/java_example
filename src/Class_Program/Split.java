package Class_Program;

import java.util.Scanner;

public class Split {
 
	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		String_Example str=s.nextLine();
		String_Example str1[]=str.split(" ");
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		int c = Integer.parseInt(str1[2]);
		if(c*c==a*a+b*b)
			System.out.println("yes");
		else {
			System.out.println("No");
		}
	}

}
