package com.sep11.entity;

public class Example {
	public static void main(String[] args) {
		Student[] studentsdb = logical.getAllStudents();

		for (int i = 0; i < studentsdb.length; i++) {
			System.out.println(studentsdb[i]);
		}
		System.out.println("----------------------");
		System.out.println("Students Above 90");
		for (int i = 0; i < studentsdb.length; i++) {
			if (studentsdb[i].getMarks() > 90) {
				System.out.println(studentsdb[i]);
			}

		}
	}
}
