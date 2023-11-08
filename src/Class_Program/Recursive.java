package Class_Program;

public class Recursive {

	public static void main(String[] args) {
			int[] a = {2,5,1,7,3,8,4,9,5};
			recursive(a,0);
		}
		
		private static void recursive(int[] a, int i) {
			if (a.length == i) {
				return;
			}
			else {
				System.out.println(i+": "+a[i]);
			}
		recursive(a, i+1);
		
			
			
}

	


}
