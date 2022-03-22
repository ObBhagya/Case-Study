package Practise;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_AryList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(2);
		arr.add(43);
		arr.add(6);
		arr.add(100);
		
		System.out.println("before sorting");
		for (Integer in : arr) {
			System.out.println(in);
		}
		
		Collections.sort(arr);
		
		System.out.println("after sorting");
		for (Integer in: arr) {
			System.out.println(in);
			
		}
	}

}
