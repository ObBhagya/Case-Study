package learn.comprble;

import java.util.Arrays;

public class AppComp {

	public static void main(String[] args) {
		
		Student[] studentsarr= {new Student(1, "aaa", 22, 78),new Student(2, "nn", 21, 78.0),
				new Student(24, "dd", 24, 99.1)};
		
		
		Arrays.sort(studentsarr);
		
		for (Student students:studentsarr)
			System.out.println(students);
		
	}

}
