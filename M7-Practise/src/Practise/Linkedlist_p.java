package Practise;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_p {

	public static void main(String[] args) {
		 
		LinkedList<String> list=new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//System.out.println("Strings"+list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

		
	}

}
