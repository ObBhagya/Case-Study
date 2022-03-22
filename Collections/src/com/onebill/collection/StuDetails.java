
package com.onebill.collection;
import java.util.*;

public class StuDetails implements Comparator{
	
		public int compare(Object obj1,Object obj2) {
			String s1=(String)obj1;
			String s2=(String)obj2;
			
	return -(s1.compareTo(s2));
	
		}

}
