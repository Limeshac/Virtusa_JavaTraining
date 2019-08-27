package com.limesha.example1.sorted;

import java.util.Collections;
import java.util.List;

public class SortByEarliestWay {

	public static void main(String[] args) {

		// get student list
		List<Student> students = Student.getStudents();
		
		// sort by Collections.sort() -> student list, instance of comparator implementation 
		Collections.sort(students, new StudentRanker());
		
		// print sorted list
		System.out.println(students);
		
		
	}

}
