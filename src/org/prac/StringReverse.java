package org.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {
	private void usingStringBuffer() {
		String name = "Gnanasekaran";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
	}
	
	private void usingLogic() {
		String name ="Gnanasekaran";
		char[] charArray = name.toCharArray();
		
		String rev ="";
		for(int i=charArray.length-1;i>=0;i--) {
			rev = rev+charArray[i];
		}
		System.out.println(rev);
	}
	
	private void usingCollections() {
		String name ="Gnanasekaran";
		char[] charArray = name.toCharArray();
		
		List<Character> arrayList = new ArrayList<Character>();
		
		for (Character character : charArray) {
			arrayList.add(character);
		}
		
		Collections.reverse(arrayList);
		
		ListIterator iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		StringReverse s = new StringReverse();
		s.usingCollections();
		
	}

}
