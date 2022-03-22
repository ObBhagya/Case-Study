package com.onebill.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap();
		map.put(100, "aa");
		map.put(101, "bb");
		map.put(99, "cc");
		map.put(104,"dd");
		
		System.out.println(map.size());
		System.out.println(map);
		Set<Integer>KeySet=map.keySet();
			for (Integer key:KeySet)
			{
			System.out.println(key+"->"+map.get(key));
		}
	}

}
