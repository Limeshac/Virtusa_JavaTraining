package com.limesha.example1.sorted;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int id;
	
	
	public Student(String name, int id) {
		this.id=id;
		this.name=name;
		
	}
	
	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Limesha", 3));
		students.add(new Student("Sani", 2));
		students.add(new Student("Ashani", 13));
		students.add(new Student("Hashani", 44));
		students.add(new Student("Chee", 15));
		students.add(new Student("Suharsha", 1));
		students.add(new Student("Dasuni", 7));
		
		return students;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
