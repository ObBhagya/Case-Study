package com.te.learn.HashMp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.java_cup.internal.runtime.Symbol;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class HashMpDemo {

	public static void main(String[] args) {
		
		

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "a");
		hashMap.put(12, "x");
		hashMap.put(3, "b");

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("key-" + entry.getKey()+"-value-" +entry.getValue());
		}
		
//		//HashMap hp=new HashMap();
//		hashMap.getkey(1);
//		System.out.println(hp);
//		
		

	}

}
