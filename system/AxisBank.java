package Org.system;

public class AxisBank extends BankInfo {
	
	public void deposit() {
	System.out.println("Deposit override method");	
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
		

	}

}
