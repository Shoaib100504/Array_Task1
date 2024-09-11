package com.sep11.entity;

import java.util.Scanner;

public class logical {
	public static Student[] getAllStudents() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		Student[] db = new Student[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter details for student " + (i + 1));
			;
			System.out.println("Enter roll no ");
			int r = sc.nextInt();

			System.out.println("Enter Name ");
			String n = sc.next();

			System.out.println("Enter marks ");
			int m = sc.nextInt();

			db[i] = new Student(r, n, m);
		}

		return db;

	}
}
