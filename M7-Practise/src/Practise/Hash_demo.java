package Practise;

import java.util.HashSet;

public class Hash_demo {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("aa");
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		for (String string : set) {
			System.out.println(string+"");
			
		}
		

		
	}

}
