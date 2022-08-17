package random;

import java.util.Scanner;

public class scanner5 {

	public static void main(String[] args) {

		String str="this is my first demo ok";
		
		int count=0;
		boolean b=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				b=true;
			}
			else if(b==true) {
				b=false;
				count++;
				
			}
		}
		
		System.out.println(count);
		
	}}