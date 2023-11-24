package Class_Program;

import java.util.Scanner;

public class Studentid {

	public static void main(String_Example[] args) {
		Scanner s= new Scanner(System.in);
		int id,m1,m2,m3,total,average,grade;
		String_Example name;
		System.out.print("student id: ");
		id=s.nextInt();
		System.out.print("student name");
		name=s.next();
		System.out.print("Mark 1: ");
		m1=s.nextInt();
		System.out.print("mark 2: ");
		m2=s.nextInt();
		System.out.print("mark 3: ");
		m3=s.nextInt();
		total=m1+m2+m3;
		average=total/3;
		System.out.println("Total="+total);
		System.out.println("Average="+average);
		if(average>=90) {
			System.out.println("remark:excellent");
		}
		else if(average>=80){
			System.out.println("remark:very good");
		}
		else if(average>=70) {
			System.out.println("remark:good");
		}
		else if(average>=60) {
			System.out.println("remark: has to improve");
		}
		else if (average>=50) {
			System.out.println("remark:work hard");
		}
		else {
			System.out.println("remark:fail");
		}
		
	}
		
}


