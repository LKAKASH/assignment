package assignment.com;

public class EmployeeDetails {
	public void employeeName(String name) {
		System.out.println(name);
	}

	public void employeeId(int id) {
		System.out.println(id);
	}

	public void employeeAddress(String address) {
		System.out.println(address);
	}

	public void employeeSalary(double salary) {
		System.out.println(salary);
	}

	public void employeeMoblieNumber(long moblienumber) {
		System.out.println(moblienumber);
	}
	public static void main(String[] args) {
		EmployeeDetails detail = new EmployeeDetails();
		detail.employeeName("Akash");
		detail.employeeId(100001);
		detail.employeeAddress("kumbakonam");
		detail.employeeSalary(30000.00F);
		detail.employeeMoblieNumber(9597752884L);
	}
}
 
