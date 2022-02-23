package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.get("http://leaftaps.com/opentaps/control/main");
	    
	     driver.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("demosalesmanager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[@ class='decorativeSubmit']")).click();
	     driver.findElement(By.xpath("//a[@style='color: black;']")).click();
	     
	     

	}

}
