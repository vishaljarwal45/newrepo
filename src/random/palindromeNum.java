package random;

public class palindromeNum {

	public static void main(String[] args) {

  
	     int num=12344321;
	     int temp=num;
	     int rem;
	     int rev=0;
	     
	     while(temp!=0) {
	     rem=temp%10;
	     rev=rev*10+rem;
	     temp=temp/10;
	      }
	     System.out.println(rev);
		if(num==rev) {
			System.out.println("num is palindrome");
		}
		else {
		System.out.println("num is not palindrome");
		}
		
		
		
		
		
		
	}

}
