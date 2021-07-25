package org.prac;

public class CharOccurance {

	public static void main(String[] args) {
		
		String value = "N GnanasekaranN";
		char character = 'n';
		int occurance = 0;
		
		value=value.toLowerCase();
		
		for(int i=0;i<value.length();i++) {
			if (value.charAt(i)==character) {
				occurance=occurance+1;
			}
		}
		System.out.println("no of times: "+occurance);

		
		
		

	}

}
