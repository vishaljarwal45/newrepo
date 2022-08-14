package random;

public class palindromeString {

	public static void main(String[] args) {

     String org ="eye";
     String rev=" ";
     
     for(int i=org.length()-1;i>=00;i--) {
    	 rev=rev+org.charAt(i);
    	 
    	 
     }
     
		System.out.println(rev);
		if(org.equals(rev)) {
			
			System.out.println("palindrome");
			
		}
		
		else {
			System.out.println("not palindrome");
		}	
		
		
		
		
		
		
		
		
		
	}

}
