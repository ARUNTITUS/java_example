package Class_Program;

public class Stingcompare {

	public static void main(String_Example[] args) {
		/*String s1 = "google";
		String s2 = "google";
		String s3 = new String ("google"); 
				
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);           
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);*/
		
		
		
		
		/*String str0rig = "hello world, Hello World";
		int lastIndex = str0rig.indexOf("Hello");
		if(lastIndex == -1 )
		{
		System.out.println("Hello not found");	
		}
		else
		{
		System.out.println("Last occurance of Hello is at index"+ lastIndex);
		}*/
		
		
		
		
		String_Example string = "abcdef 1234";
		String_Example reverse = new StringBuffer(string).reverse().toString();
		
		System.out.println("\n String before reverse: "+string);
		System.out.println("String after reverse: "+reverse);
		
		String_Example input = "abcdef";
		char[] try1 = input.toCharArray();
		
		for(int i = try1. length-1;i >= 0; i--)
		System.out.println(try1[i]);	
	
	}

}
