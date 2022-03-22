package com.te.learn.Predct;

import java.util.function.Predicate;

public class PredictDemo {

	public static void main(String[] args) {
		
		Predicate<Float> predicate=i -> {
			
					
					if(i %2 == 0 )
				return true;
			return false;
			
			
			
		};
		
		Predicate<Float> predicate2= new Predicate<Float>() {
			
			@Override
			public boolean test(Float t) {
				if(t%2==0)
					return true;
				return false;
			}
		};
		
		Predicate<Float> predicate3 = i->i % 2!=0;
		
		float n=2;
		System.out.println(""+predicate.test(n));
		
		
	}

}
