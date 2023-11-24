package Class_Program;

import java.util.Scanner;

public class example {

	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		int digit=0,letter=0,vowel=0,consonant=0,special=0;
		String_Example str1=s.next();
		char ch[]=str1.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
						 ||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U' )
				{
					if(vowel==0)
						vowel=i+1;
				}
				else if (consonant==0) {
					consonant=i+1;
				}
				if(Character.isUpperCase(ch[i])&&upper==0)
					upper=i+1;
				else if(Character.isLowerCase(ch[i]) && (lower==0))
					lower=i+1;	
			}
			else if (Character.isWhitespace(ch[i]) && whitespace==0)
				whitespace=i+1;
			else if(special==0){
				special=i+1;
			}
		}
		System.out.println("vowel:"+vowel);
		System.out.println("consontant:"+consonant);
	}
	
    
}


