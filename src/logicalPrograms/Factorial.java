package logicalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		       System.out.println("input the number");
		       int number = sc.nextInt();

	//int number=4;
	int fact=1;
	
	for(int i=number;i>=1;i--) {
		
		fact=fact*i;
	}
	System.out.println("factorial is "+fact);
		
		
		
		
		
		
		
		
		
		
		
	}

}
