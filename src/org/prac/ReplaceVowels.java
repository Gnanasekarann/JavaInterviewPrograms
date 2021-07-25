package org.prac;

public class ReplaceVowels {
	String name = "Gnanasekaran";

	private void byCoding() {
		char[] charArray = name.toCharArray();
		
		
		for(int i=0;i<name.length();i++) {
			if (charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i') {
				charArray[i]='*';
			}
		}
		for(int i=0;i<name.length();i++) {
			System.out.print(charArray[i]);
		}
	}
	
	private void byInbuildMedthod() {
		String replaceAll = name.replaceAll("[AEIOUaeiou]", "@");
		System.out.println(replaceAll);
	}
	
	public static void main(String[] args) {
		ReplaceVowels r = new ReplaceVowels();
		r.byCoding();
		r.byInbuildMedthod();
	}

}
