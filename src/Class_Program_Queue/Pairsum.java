package Class_Program_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pairsum {
	public static int sumSecondElements(List<Pair<Integer, Intger>> List) {
		int sum =0;
		for (Pair<Intger, Intger> Pair : List) {
			sum += Pair.second;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		List arr = new ArrayList<Pair<Intger, Intger>>();
		arr.add(new Pair<Intger, Intger>(1, 2));
		arr.add(new Pair<Intger, Intger>(3, 4));
		arr.add(new Pair<Intger, Intger>(5, 6));
		arr.add(new Pair<Intger, Intger>(7, 8));
		arr.add(new Pair<Intger, Intger>(9, 10));

		System.out.println(sumSecondElements(arr));
		}
	
	Public Static class Pair<F, S> {
		F first;
		S second;
		
		
		Public Pair(F first, S second) {
			this.first=first;
			this.second=second;
		}
	}

}
