package org.prac;

public class ReverseSentence {
	
	
	public static void main(String[] args) {
		String given = "May god bless you";
		String[] split = given.split(" ");
		/*StringBuffer buffer = new StringBuffer();
		StringBuffer append = buffer.append(given);
		System.out.println(append.reverse());*/
		for (String string : split) {
			System.out.println(string);

		}
		String reverse = "";
		for(int i=split.length-1;i>=0;i--) {
			reverse=reverse+split[i]+" ";
		}
		System.out.println(reverse);
	}
	

}
