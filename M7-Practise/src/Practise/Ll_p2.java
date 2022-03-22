package Practise;

import java.util.LinkedList;

public class Ll_p2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ls=new LinkedList<Integer>();
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		
		if(ls.contains(4)) {
			System.out.println("4 was present in the list");
		}
			else {
				System.out.println("4 is not present");
			
		}
		
	}

}
