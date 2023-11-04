import java.util.Scanner;

public class Second_t {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,d,e ;
		
		System.out.print("Enter  Value of a=");
		a= s.nextInt();
		System.out.print("Enter value b=");
		b=s.nextInt();
		System.out.print("Enter value c=");
		c=s.nextInt();
		
		d =a>b?a:b;
		e =c>d?c:d;
		//result=c>result?c:result;
		System.out.println("The largest value is:"+e);
		
		
		if (a>b && a>c);
		System.out.println("the biggest value is:"+a);
		
	System.out.println("the bigger value is:"+b);
		
		

	}

}

