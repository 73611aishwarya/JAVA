package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] students = new Student[2];
		
		  for (int i = 0; i <2; i++) {
	            System.out.println("Enter details for Student " + (i + 1) + ":");
	            
		System.out.println("enter student Id");
		int studId=sc.nextInt();
		
		System.out.println("enter the name of student");
		String sName=sc.next();
		
		System.out.println("enter the m1 marks of student");
		int m1=sc.nextInt();
		
		System.out.println("enter the m2 marks of student");
		int m2=sc.nextInt();
		
		System.out.println("enter the m3 marks of student");
		int m3=sc.nextInt();
		
		 
		Student s1=new Student(studId,sName,m1,m2,m3);
		System.out.println(s1);
		
		  }
	}

}
