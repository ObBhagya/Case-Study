package com.onebill.collection;

import java.util.Comparator;

public class DescId implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
	
		return -(e1.getEmp_id()-e2.getEmp_id());
	}
	
	
	

}
