package logicalPrograms;

import java.util.HashMap;

public class hashmappro {

	public static void main(String[] args) {

      HashMap m=new HashMap();
      
      m.put(101,"vishal");
      m.put(102, "jarwal");
      m.put(103, "suraj");
      m.put(104, "kakarwal");
      m.put(105, "ishwar");
      m.put(106, "ghunawat");
      
      System.out.println(m);
      System.out.println(m.get(105));
      m.remove(105);
      
		System.out.println(m);
		System.out.println(m.containsKey(105));
	System.out.println(m.isEmpty());
//	System.out.println(m.keySet());
//	System.out.println(m.values());
//	System.out.println(m.entrySet());
//		
		
		
		for( Object i:m.keySet()) {
			
			System.out.println(i);
		}
		
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		for(Object i:m.keySet()) {
			
			System.out.println(i+" : "+m.get(i));
		}
		
		 //lets update through gitbash 4.46 30 aug
		
		
		
		
		
	}

}
