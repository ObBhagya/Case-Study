package Practise;

import java.util.Map;
import java.util.TreeMap;

public class Treemap_Demo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(10,"aa");
		map.put(1,"vv");
		map.put(12,"kk");
		
		for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
	}

}
