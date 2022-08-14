package random;

public class reverseNum {

	public static void main(String[] args) {

  int number=1234;
  
  String s=Integer.toString(number);
  String r="";
  
  for(int i=s.length()-1;i>=0;i--) {
	  
	  r=r+s.charAt(i);
  }
  int revNum=Integer.parseInt(r);
  System.out.println(revNum);
	  
  
		
		
		
		
		
		
		
	
}}
