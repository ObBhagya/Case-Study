package com.te.learn.Predct;

import java.util.function.Function;

public class Funct {

	public static void main(String[] args) {
		Function<Integer, Integer>ff=i->i*i*i;
	
		System.out.println(""+ff.apply(10));
	}

}
