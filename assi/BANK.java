package week3.day2.assi;

public class BANK  extends SBI{
	
	public void creditScore() {
		System.out.println("CreditScore = 99");
		
	}

	public void minimumBalance() {
		System.out.println("MinimumBalance = 500");
		
	}

	public void cibilScore() {
		System.out.println("CibilScore = 83");
		
	}

	public void bankBalance() {
		System.out.println("BankBalance = 1000000");
		
	}

	public void maximumLoanAmount() {
		System.out.println("MaximumLoanAmount = 5Lacks");
		
	}

	public static void main(String[] args) {
		
		BANK details = new BANK();
		details.creditScore();
		details.minimumBalance();
		details.bankBalance();
		details.itLoan();
		details.maximumLoanAmount();
		details.cibilScore();
	

	}

}
