package Org.system;

import org.w3c.dom.Text;

public class Desktop extends Computer {
	
	
	public void desktopSize( ) {
		System.out.println("desktpoSize");
	}
	

	public static void main(String[] args) {
		Desktop king = new Desktop();
		king.desktopSize();
		king.computerModel();
		


		

	}

}
