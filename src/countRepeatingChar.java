import java.util.HashMap;
import java.util.Set;

public class countRepeatingChar {

	public static void main(String[] args) {


	String str="vishalvishalvishk";	
		
		HashMap<Character, Integer> mp= new HashMap<Character,Integer>();
		
	     for(int i=0;i<str.length()-1;i++) {
	    	 
	    	  char charkey = str.charAt(i);
	    	  
	    if(mp.containsKey(charkey)) {
	    	
	    	    mp.put(charkey, mp.get(charkey)+1);
	    }	  
	    	  
	    else {
	    	  mp.put(charkey, 1);
	    } 	  
	    	  
	    	  }
		
	//	System.out.println(mp);
		
		 Set<Character> keys=mp.keySet();
		
		 for(Character key:keys) {
			 if(mp.get(key)>1) {
			 
			 System.out.println(key+" : "+mp.get(key));}
		 }
		
		//add 12.14 8/30
		
		
		
	}

}
