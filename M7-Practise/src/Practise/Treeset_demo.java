package Practise;

import java.util.TreeSet;

public class Treeset_demo {

	public static void main(String[] args) {
		
        TreeSet<Integer> integers=new TreeSet<>();
        integers.add(23);
        integers.add(11);
        integers.add(89);
        integers.add(99);
        integers.add(23);
        
        
        for (Integer in : integers) {
			
        	System.out.println(in+"");
		}
	}

}
