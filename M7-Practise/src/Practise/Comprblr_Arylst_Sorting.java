package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comprblr_Arylst_Sorting {

	public static void main(String[] args) {
		
//		ArrayList<Student> list= new ArrayList<>();
//		list.add(new Student(1, 18,"aa"));
//		list.add(new Student(1, 12,"bb"));
//		list.add(new Student(1, 15,"cc"));
//		list.add(new Student(1, 11,"dd"));
//		
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(new Student(1, 18,"aa"));
		list.add(new Student(1, 12,"bb"));
		list.add(new Student(1, 15,"cc"));
		list.add(new Student(1, 11,"dd"));
		
		
		
		
		Collections.sort(list);
		
		for (Student student : list) {
			
		
		System.out.println(student+"student");}
	}

}
