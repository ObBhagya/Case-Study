
package com.onebill.collection;
import java.util.*;

public class Student {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		System.out.println("preserved");
		Collections.sort(list);
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
			System.out.println("Ascending");
			Collections.sort(list);
			Iterator i1=list.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
				
				System.out.println("Descending");
				Collections.sort(list,new StuDetails());
				Iterator i2=list.iterator();
				while(i2.hasNext()) {
					System.out.println(i2.next());
		}
		
	}
}
