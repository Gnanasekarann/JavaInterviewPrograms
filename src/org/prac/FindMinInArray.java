package org.prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinInArray {
	
	
	Integer a[] = {23,4,5,2,67,2,3,0};
	
	private void usingArrays() {
		
	Arrays.sort(a);
	System.out.println(a[0]);
	}
	
	private void usingCollections() {
		List<Integer> asList = Arrays.asList(a);
		Collections.sort(asList);
		System.out.println(asList.get(0));
	}
	
	public static void main(String[] args) {
		
		FindMinInArray f = new FindMinInArray();
		f.usingCollections();
		f.usingArrays();
	}

}
