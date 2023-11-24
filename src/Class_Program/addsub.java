package Class_Program;


 class specs<K extends Number>{
	
	 K right;
	K left;
	
	/*public specs(Integer r, Integer l) {
		this.right=r;
		this.left=l;
	}*/
	public double add(K g,K h){
		
		return g.doubleValue()+h.doubleValue();
	}
 }
	

public class addsub {
	

	public static void main(String[] args) {
		specs ob = new specs();
		
		System.out.println(ob.add(1, 1));

	}

}
