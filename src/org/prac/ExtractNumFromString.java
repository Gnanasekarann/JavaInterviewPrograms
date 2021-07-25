package org.prac;

public class ExtractNumFromString {
	
	public static void main(String[] args) {
		
		String name = "Gnana5ekaran7";
		int total =0;
		
		for(int i=0;i<name.length();i++) {
			char charAt = name.charAt(i);
			if (Character.isDigit(charAt)) {
				total=Character.getNumericValue(charAt)+total;
			}
		}System.out.println("Total = "+total);
		
		
	}

}
