package org.prac;

public class NumberPresentInArrayOrNot {
	
	public static void main(String[] args) {
		
		
		int array[] = {2,4,1,4,6,7,8};
		int numberToCheck = 40;
		Boolean found = false;
		
		for(int num:array) {
			if (num==numberToCheck) {
				found=true;
				break;
			}
		}if (found==true) {
			System.out.println("Number Found");
		}else {System.out.println("number not found");
		
	}
	}
}
