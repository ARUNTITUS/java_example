package Class_Program;

import java.util.Scanner;

public class Oddeven {

	public static void main(String_Example[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }

		 
	}


