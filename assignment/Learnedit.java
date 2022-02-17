package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnedit {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akashlkkutty@gmail.com");
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]"));
		findElement.clear();
		findElement.sendKeys("Akash"+Keys.TAB);
	    String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
	    System.out.println(attribute);
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
	    System.out.println(enabled);
	    if(enabled==false)
		System.out.println("box is Disabled");
	    else
		System.out.println("box is not enabled");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
