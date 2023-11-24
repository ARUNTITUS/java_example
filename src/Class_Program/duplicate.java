package Class_Program;

import java.util.Scanner;

public class duplicate {

	public static void main(String_Example[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]+" ");
			}
		}
		s.close();
	}

}
