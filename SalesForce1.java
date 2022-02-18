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
		driver.get(" https://login.salesforce.com");

		driver.findElement(By.id("username")).sendKeys("akash");
		driver.findElement(By.id("password")).sendKeys("lusukutty192919");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("rememberUn")).click();

		String text = driver.findElement(By.xpath("//div[@id='error']")).getText();
		String text1 = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		if (text.equals(text1)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case not pass");
		}

	}

}