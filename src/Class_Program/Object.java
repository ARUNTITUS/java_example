package Class_Program;

import java.util.Scanner;

public class Object {
	
	int stud_id=1;
	String stud_name="Joseph";
	
	void print() {
		System.out.println("student id:"+stud_id);
		System.out.println("Student Name:"+stud_name);
	}
	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println(" enter the student id:");
		int id s.nextInt();
	    System.out.println("entrer the studet name:");
	    String name=s. next();
	    Sum1 obj=new Sum1();
	    obj.print(id,name);
	    s.close();
		
		

	}

}
