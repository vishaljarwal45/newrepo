package logicalPrograms;

public class WhiteSpacesFromString {

	public static void main(String[] args) {


		String s="@my@ name @@@@ is @@vishal@@@";
		
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) { 
			
			
             char blank =s.charAt(i);
             
			if(blank== '@' ) {
				count++;
			}
			System.out.println("@ symbol in "+s+"is "+count);
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
