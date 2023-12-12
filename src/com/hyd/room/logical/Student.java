package com.hyd.room.logical;

public class Student implements Comparable<Student>{
	private int studentId;
	private String studentName;
	private int age;
	public Student(int i, String string, int j) {
		this.studentId=i;
		this.studentName=string;
		this.age=j;
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		return 0;
		else if(age>o.age)
		{
			return 1;
		}
		else{
			return -1;
		}
	}

}
