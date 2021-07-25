package org.prac;

import java.util.Scanner;

public class PrintTriangle {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number : ");

		Scanner s = new Scanner(System.in);
		int nextInt = s.nextInt();
		int row, col =0;
		
		for(row=0;row<nextInt;row++) {
			for(col=0;col<row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
