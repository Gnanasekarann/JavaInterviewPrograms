package org.prac;

public class noOfVowels {
	
	public static void main(String[] args) {
		
		String name = "Gnanasekaran";
		name = name.toLowerCase();
		
		int count =0;
		
		char[] charArray = name.toCharArray();
		for(int i=0;i<name.length();i++) {
			if (charArray[i]=='a'||charArray[i]=='e') {
				count=count+1;
			}
		}
		System.out.println("No of vowels: "+ count);

	}

}
