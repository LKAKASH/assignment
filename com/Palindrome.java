package assignment.com;

public class Palindrome {

	public static void main(String[] args) {
		
		String input ="madam";
		String rev ="";
		for(int i = input.length()-1; i>=0;i--) {
			rev = rev +input.charAt(i);
			}
		if(input.equalsIgnoreCase(rev)) 
		
		System.out.println(rev);
		if(input.equals(rev)) {
			System.out.println("giva string is palindrome");
				
			
			
			
			}else
			
			 System.out.println("give string is not a palindrome");
		}
			

	}

