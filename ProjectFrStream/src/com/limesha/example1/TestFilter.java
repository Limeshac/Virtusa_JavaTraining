package com.limesha.example1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestFilter {

	
	static void byUsualWay() {
		
		List<Student> students = Student.getStudents();
		
		for (Student student : students) {
			if (student.getName().length()<=5) {
				System.out.println("Dr "+student.getName());
			}
		
		}
		
		
	}
	
	static void byStreamFilter() {
		
		System.out.println("\n\nby Steram Filter");
		System.out.println("by Filter method : "+Student.getStudents().stream().filter(s->s.getName().length()<=6).collect(Collectors.toList()));
		System.out.println("\n\n");
		
	}
	static void byProcess() {
		System.out.println("\n\nBy Process");
		
		Student.getStudents().stream().map(s->new Student("Hi "+s.getName(),s.getId()))
				.collect(Collectors.toList()).forEach(s->System.out.println(s.getName()+" "+s.getId()));
		
	}
	static void sortedStudents() {
		
		
	}
	static void getLastStudent() {
		
		System.out.println("\n Last enterd student  : ");
		
		Comparator<Student> comparator = Comparator.comparing(Student::getId);
		Student student= Student.getStudents().stream().max(comparator).get();
		System.out.println(student);
		
	}
	
	
	public static void main(String[] args) {
		
		byUsualWay();
		byStreamFilter();
		byProcess();
		getLastStudent();
		sortedStudents();
		
	}

}
