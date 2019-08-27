package com.limesha.example1.sorted;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStream {

	public static void main(String[] args) {

		byStream_comparator();
		byStream_Decending();
		byStream_Comparing();
	}
	
	static void byStream_comparator() {
		List<Student> students =	Student.getStudents().stream().sorted((s1,s2)->new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());
		System.out.println(students);
		
	}
	static void byStream_Decending() {
		List<Student> students =	Student.getStudents().stream().sorted((s1,s2)->new Integer(-s1.getId()).compareTo(-s2.getId())).collect(Collectors.toList());
		System.out.println(students);
	}
	
	static void byStream_Comparing() {
		// use Comparator.comparing(Stuedent::getId)
		List<Student> students =	Student.getStudents().stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
		System.out.println(students);
	}

}
