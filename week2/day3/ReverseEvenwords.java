package week2.day3;

public class ReverseEvenwords {

	public static void main(String[] args) {
		
		String input ="I am software tester";
		//output : I ma software retset
		String[] words = input.split(" ");
		
		for(int i = 0; i< words.length;i++) {
			if(i%2==1) {
				
				
				for (int j=words[i].length()-1;j>=0;j--) {
					System.out.println(words[i].charAt(j));
				}
				System.out.println(" ");
				
			}else {
			
			
			System.out.print(words[i]+" ");
			
		}
		
		

	} 
		}
	}


