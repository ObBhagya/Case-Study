package com.onebill.java.adavance;

import java.util.Arrays;

public class Arry {
	Object[] elementData;
	private static final int DEFAULT_SIZE=10;
	private int size;
	
	
	public Arry() {
		this.elementData=new Object[DEFAULT_SIZE];
		
	}
	
	public boolean add(Object obj) {
		ensureCapacity();
		System.out.println(obj+"added at index"+ size);
		elementData[size++]=obj;
		return true;
		
		
	}

	private void ensureCapacity() {
		if (size==elementData.length) {
			grow();
		}
		
	}

	private void grow() {
		int oldCapacity=elementData.length;
		int newCapacity=oldCapacity>>1;//10/2
		elementData=Arrays.copyOf(elementData,newCapacity);
		
		
	}
	

	

}
