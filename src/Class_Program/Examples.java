package Class_Program;

import java.util.Scanner;

public class Examples {

	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		 
		        int[] arr = {9, 7, 8, 6, 3, 1, 12, 2, 5};
		        
		        int min = arr[0];
		        int max = arr[0];
		        
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		            }
		            
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }
		        
		        System.out.println("Smallest number: " + min);
		        System.out.println("Biggest number: " + max);
		    }
		



	}


