package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.get("http://www.leafground.com/pages/Edit.html");
	     WebElement Edit1=driver.findElement(By.id("email"));
			Edit1.sendKeys("test@gmail.com");
			WebElement  mm = driver.findElement(By.xpath("//input[@value='Append ']"));
	      mm.clear();
	      mm.sendKeys(Keys.TAB);

	}

}
