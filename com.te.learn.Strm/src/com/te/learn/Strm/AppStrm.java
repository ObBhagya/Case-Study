package com.te.learn.Strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppStrm {

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "aa", 11));
		arrayList.add(new Student(2, "aa", 77));
		arrayList.add(new Student(3, "aa", 28));

		System.out.println(arrayList);

		List<Student> res;

		res = arrayList.stream().sorted().collect(Collectors.toList());

		System.out.println("res\n" + res);

	}

}
