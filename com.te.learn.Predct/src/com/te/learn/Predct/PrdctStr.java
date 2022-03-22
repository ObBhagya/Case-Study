package com.te.learn.Predct;

import java.util.function.Predicate;

public class PrdctStr {

	public static void main(String[] args) {

		Predicate<String> predicate= s ->
		{
			if(s.equals(5))
				return true;
			return false;
			
		};
		
		String str="abcde";
		
		System.out.println(""+predicate.test(str));
		
		

	}

}
