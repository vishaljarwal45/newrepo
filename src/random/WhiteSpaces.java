package random;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class WhiteSpaces {

	public static void main(String[] args) {

         String s="vishal is good programmerss as";
         int count=0;
         
         for(int i=0;i<=s.length()-1;i++) {
        	 
                   char blank =s.charAt(i);
                   if(blank=='s' ) {
                	   count++;
                   }
        	 System.out.println("number of blank spaces is "+count);
         }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
