package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContant {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("http://leaftaps.com/opentaps/control/login");
	    
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bgmi");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rak");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("akash");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("rak");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("akash");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ece");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("processor");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rakakash@gmail.com");
	    driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("NY");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.className("subMenuButton")).click();
	    driver.findElement(By.id("createLeadForm_description")).clear();
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("bgmi game");
	    driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     
		

	}

}
