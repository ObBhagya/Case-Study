package com.onebill.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap();
		map.put(100, "aa");
		map.put(101, "bb");
		map.put(99, "cc");
		map.put(104,"dd");
		
		Set<Entry<Integer,String>> entryset=map.entrySet();
		
		
		for(Entry entry:entryset)
		{
			System.out.println(entry.getKey()+" " + entry.getValue());
		}
	}

}
