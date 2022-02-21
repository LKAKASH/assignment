package Org.student;

import Org.college.College;

public class Student extends College{
	public void studentName() {
		System.out.println("Student Name is: Akash R");
	}
	public void studentDept() {
		System.out.println("Student Department is : ECE");
	}
	public void studentId() {
		System.out.println("Student Id is: B17ec301");
	}
	
	public static void main(String[] args) {
		Student get=new Student();
		get.collegeName();
		get.collegeCode();
		get.collegeRank();
		get.deptName();
		get.studentName();
		get.studentId();
		get.studentDept();
	}
}