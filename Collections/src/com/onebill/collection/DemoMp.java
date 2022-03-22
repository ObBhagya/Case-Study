package com.onebill.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMp {
	public static void main(String [] args)
	{
		Map<Brand,Laptop> map=new HashMap();
		map.put(new Brand("HP"),new Laptop(23000,8,250));
		map.put(new Brand("Dell"),new Laptop(23000,8,250));
		map.put(new Brand("Asus"),new Laptop(23000,8,250));
		map.put(new Brand("MI"),new Laptop(23000,8,250));
		
		
		Set<Brand> KeySet=map.keySet();
		for(Brand brand:KeySet) {
			System.out.println(brand+"-->"+map.get(brand));
			
			
		}
		
		
	}
}
