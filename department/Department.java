package Org.department;

import Org.student.Student;

public class Department extends Student {
	
	public void department() {
		System.out.println("Department");
	}

	public static void main(String[] args) {
		
		Department department = new Department();
		department.department();
		

	}

}
