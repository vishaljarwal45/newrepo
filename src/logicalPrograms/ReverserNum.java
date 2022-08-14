package logicalPrograms;

public class ReverserNum {

	public static void main(String[] args) {


		int number=7845;
		
		String s=Integer.toString(number);
	    String r="";
	    
	    for(int i=s.length()-1;i>=0;i--) {
	    	r=r+s.charAt(i);}
	    int revNum=Integer.parseInt(r);
	    	
	    	System.out.println("reverser number is "+revNum);
	    
		
		
		
		
		
		
		
	}

}
