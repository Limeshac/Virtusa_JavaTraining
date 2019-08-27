package com.limesha.example1.sorted;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedByLamdaWay {

	public static void main(String[] args) {
		
		// get unsorted student list
		List<Student> students = Student.getStudents();
		
		// call compare() by using lamda
		Comparator<Student> studentComparator = (s1,s2)->(s1.getId()<s2.getId()?-1:(s1.getId()>s2.getId()?1:0));
		
		Collections.sort(students, studentComparator);
		
		//Collections.sort(students, (s1,s2)->(s1.getId()<s2.getId()?-1:(s1.getId()>s2.getId()?1:0)));
		
		// print sorted list
		System.out.println(students);
		
	}
	
}
