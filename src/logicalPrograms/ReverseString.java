package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
	 //String s="velocity";
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string");
		   String s=sc.next();
		
		
	 String r="";
	 
	 for(int i=s.length()-1;i>=0;i--) {
		 
		 r=r+s.charAt(i);
	 }
		
		System.out.println(r);
		
		
		
	}
}
