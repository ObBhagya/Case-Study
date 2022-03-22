package Practise;

import java.util.HashMap;
import java.util.Map;

public class Map_demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		
		//System.out.println(map+"");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
