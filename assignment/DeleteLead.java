package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("akash");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.findElement(By.name("firstName")).sendKeys("akash");
	    driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("akash");
	    driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).sendKeys("akash");
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    
	   
	    
	    
	    
	    
	    
	    
		

	}

}
