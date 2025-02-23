package com.demo.beans;

public class Student {
	
	private String studentId;
    private String name;
    private float m1, m2, m3;
    private float gpa;
   
	public Student(int studentId2, String name2, float m12, float m22, float m32) {
		super();
	}

	

	public Student(String studentId, String name, float m1, float m2, float m3, float gpa) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.gpa = gpa;
	}



	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getM1() {
		return m1;
	}



	public void setM1(float m1) {
		this.m1 = m1;
	}



	public float getM2() {
		return m2;
	}



	public void setM2(float m2) {
		this.m2 = m2;
	}



	public float getM3() {
		return m3;
	}



	public void setM3(float m3) {
		this.m3 = m3;
	}



	public float getGpa() {
		return gpa;
	}



	public void setGpa(float gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ ", gpa=" + gpa + "]";
	}

    
}
