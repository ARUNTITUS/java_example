package Class_Program;

import java.util.Scanner;

public class Sum_of_naturals {

	public static void main(String_Example[] args) {
		 Scanner scanner = new Scanner(System.in);

		  System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isAbundantNumber(number)) {
	            System.out.println("Yes, it is an abundant number");
	        } else {
	            System.out.println("No, it is not an abundant number");
	        }

	        scanner.close();
	    }

	    public static boolean isAbundantNumber(int number) {
	        int sum = 0;

	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        return sum > number;

	}

}
