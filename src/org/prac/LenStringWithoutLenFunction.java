package org.prac;

public class LenStringWithoutLenFunction {
	
	public static void main(String[] args) {
		
		String given = "Gnanasekaran";
		char[] charArray = given.toCharArray();
		int len=0;
		for(char c:charArray) {
			len++;
		}
		System.out.println(len);
	}

}
