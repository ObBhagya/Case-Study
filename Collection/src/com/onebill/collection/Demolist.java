package com.onebill.collection;
import java.util.*;

public class Demolist {
	public static void main(String args[]) {
		List col=new ArrayList();
		col.add("Bhagyashree");
		col.add("Akashay");
		col.add("Akashay");
		
		Iterator iterator=col.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
