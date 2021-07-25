package org.prac;

public class SwapNumbers {
	
	private void with3rdVariable() {
		int a =1000;
		int b =9000;
		int c =a;
		a=b;
		b=c;
		System.out.println("a "+ a +"b "+b);
		

	}
	private void without3rdVariable() {
		int a =1000;
		int b =9000;
		a = a-b;
		b=a+b;
		a=b-a;
		System.out.println("a "+ a +" b "+b);

	}
	
	public static void main(String[] args) {
		SwapNumbers s = new SwapNumbers();
		s.without3rdVariable();
	}

}
