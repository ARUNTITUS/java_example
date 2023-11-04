package Class_Program;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		switch(ch) {
		case'a':
		case'A':
		//	System.out.println("vowel");
		//	break;
		case'e':
		case'E':
	    //	System.out.println("vowel");
		//	break;
		case'i':
		case'I':
		//	System.out.println("vowel");
		//	break;
		case'o':
		case'O':
		//	System.out.println("vowel");
		//	break;
		case'u':
		case'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Not a vowel");
			
		}
	}
}
