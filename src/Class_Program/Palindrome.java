package Class_Program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String_Example[] args) {
		Scanner s=new Scanner(System.in);
		String_Example srtr1=s.next();
		String_Example str1 = null;
		StringBuffer sb =new StringBuffer(str1);
		if(str1.equalsIgnoreCase(sb.reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		s.close();
		
	} 
}


