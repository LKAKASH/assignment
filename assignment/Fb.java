package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("akashlkkutty@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Lkkutty123");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akash");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("akash");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akashlkkutty@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("akashlkkutty@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Lkkutty123");
		
         WebElement day = driver.findElement(By.id("day"));
         Select value =new Select(day);
         value.selectByVisibleText("29");
         WebElement month = driver.findElement(By.id("month"));
         Select key =new Select(month);
         key.selectByVisibleText("Mar");
         WebElement year = driver.findElement(By.id("year"));
         Select king =new Select(year);
         king.selectByVisibleText("2000");
         
         driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
         
         
         
		
		
		
		
		
		
		

	}

}
