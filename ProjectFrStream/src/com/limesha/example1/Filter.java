package com.limesha.example1;




import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class Filter {

	static void printWithFilter() {
		
		List<Student> students=Student.getStudents().stream().
				filter(s->s.getName().length()<=5).collect(Collectors.toList());
		System.out.println(students);
	}
	
	static void processByStream() {
		
		Student.getStudents().stream()
		.map(s->new Student("Dr "+s.getName(),s.getId()))
		.collect(Collectors.toList()).forEach(s->System.out.println(s));
	}
	static void getCount() {
		System.out.println("Count is : "+Student.getStudents().stream().count());
		
	}
	static void getLastStudent() {
		System.out.println("Last Studnet is : "+Student.getStudents().stream().max((Student s1,Student s2)->s1.getName().compareTo(s2.getName())));
		
	}
	static void getFirstStudent() {
		System.out.println("Get First Student (by Comparing() ) "+Student.getStudents().stream().min(Comparator.comparing(s->s.getId())));
	}
	static void printStudentAsUsual() {
		
		List<Student> students = Student.getStudents();
		for(Student student : students) {
			if(student.getName().length()<=5) {
				System.out.println(student.getName());
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		printStudentAsUsual();
		printWithFilter();
		processByStream();
		getCount();
		getLastStudent();
		getFirstStudent();
		
	}
}
