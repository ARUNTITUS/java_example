package Class_Program;

import java.util.HashMap;

public class HaspMapExample {

	public static void main(String[] args) {
		HashMap<String, String> haspMap = new HashMap<String,String>();
		
		haspMap.put("Name", "Arun");
		haspMap.put("Age", "22");
		haspMap.put("Gender", "Male");
		haspMap.put("etc","...");
		
		
		System.out.println(haspMap.get("Name"));
		System.out.println(haspMap.get("Age"));
		System.out.println(haspMap.get("Gender"));
		System.out.println(haspMap.get("etc"));
		System.out.println(haspMap.size());
		
		
		System.out.println("contains:"+haspMap.containsKey("Name"));
		System.out.println("contains:"+haspMap.containsKey("22"));
		//System.out.println("contains:"+haspMap.remove("Age"));
		HashMap<String, String> h=haspMap;
		System.out.println(h);
		//h.clear();
		System.out.println(h);
		System.out.println("contains:"+haspMap.containsValue("22"));
		
		System.out.println("contains:"+haspMap.containsValue("Age"));
		System.out.println("vcontains:"+haspMap.forEach("Age"));
h.
	}
	

}
