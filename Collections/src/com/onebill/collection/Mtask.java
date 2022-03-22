package com.onebill.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Mtask {
	public static void main(String[] args) {

		//List<Task> list = new ArrayList();
		List<Task> list=new Stack();
		list.add(new Task(1, "aa", 55));
		list.add(new Task(2, "bb", 75));
		list.add(new Task(3, "cc", 55));

		/*Iterator it = list.iterator();
		while (it.hasNext()) {
			Task tt=(Task) it.next();
			if (tt.getMarks() < 60) {
				it.remove();

			}
		}
		for (Task st : list) {
			System.out.println(st);*/
			
			
		Stack st=(Stack)list;
		while (st.size()>0) {
			System.out.println(st.pop());
			

		}

	}

}
