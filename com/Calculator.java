package assignment.com;

public class Calculator {
	public void multipleTwoNumber(double a,double b) {
		double c=a*b;
		System.out.println(c);
	}
	public void dividwTwonumber(float e,float f) {
		float g=e%f;
		System.out.println(g);
	}

	public static void main(String[] args) {
		Calculator val=new Calculator();
		val.multipleTwoNumber(123.123, 123.123);
		val.dividwTwonumber(1234.1234F,12345.12345F);
		
		

	}

}
 