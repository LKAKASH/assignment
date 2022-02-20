package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("(//div[@data-aura-class='uiTooltip'])[9]")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		
		driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]")).click();
		driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@data-assistive-id='operationId'])[2]")).click();
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Akash");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("8/19/2022");
		driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[1]")).click();
		driver.findElement(By.xpath("//button[@aria-activedescendant='combobox-button-226-3-226']")).click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		
		
		driver.close();
		
		
		
		

		

	}

}
