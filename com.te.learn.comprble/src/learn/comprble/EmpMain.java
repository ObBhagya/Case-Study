package learn.comprble;

import java.util.Arrays;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee[] em= {new Employee(1,"aa",30,100000),new Employee(2,"vv",28,20000)};
				
		Arrays.sort(em,new Employee());
		
		for(Employee e1:em)
			System.out.println(em);
	
	}
	
}
