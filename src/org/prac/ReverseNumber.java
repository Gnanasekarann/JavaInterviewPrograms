package org.prac;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int original=0;
		int reversed =0;
		System.out.println("Enter your number: ");
		Scanner s = new Scanner(System.in);
		original = s.nextInt();
		
		while (original!=0) {
			reversed=reversed*10;
			reversed=reversed+original%10;
			original=original/10;
		}
		System.out.println(reversed);
	}
	
	

}
