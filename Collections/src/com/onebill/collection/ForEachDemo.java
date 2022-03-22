package com.onebill.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ForEachDemo {
private static Object String;

public static void main(String[] args) {
	
	int [] arr= {1,3,4,5};
	for(int i:arr)
		System.out.println(i);
	
	
	List cl=new ArrayList();
	cl.add("aa");
	cl.add("bb");
	
	for(Object obj:cl) {
		String s= (String)obj;
	System.out.println(s);
	}
	
	
	
	/*List <String> cl=new ArrayList();
	cl.add("aa");
	cl.add("bb");
	for(String s:cl)
	System.out.println(s);*/
	
		
}
}
