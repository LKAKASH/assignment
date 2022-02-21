package week3.day1;

public class Pc {
	public class PC extends Laptop {
		public void getSystemInfo() {
			System.out.println("MAC");
		}
		public void main(String[] args) {
			PC get=new PC();
			get.getSystemInfo();
		}
	}

}
