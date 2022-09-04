package logicalPrograms;

public class logic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234567   ;
		int odd=0;
		int even=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem % 2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("even number"+even);
		System.out.println("odd number is"+odd);
		
	}

}
