package Class_Program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String srtr1=s.next();
		StringBuffer sb =new StringBuffer(str1);
		if(str1.equalsIgnoreCase(sb.reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		s.close();
		
	} 
}


