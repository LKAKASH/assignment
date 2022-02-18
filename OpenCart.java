package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.opencart.com/index.php?route=account/register");

		driver.findElement(By.id("input-username")).sendKeys("akash");
		driver.findElement(By.id("input-firstname")).sendKeys("RAK");
		driver.findElement(By.id("input-lastname")).sendKeys("LK");
		driver.findElement(By.id("input-email")).sendKeys("akashlk123@gmail.com");

		WebElement country_id = driver.findElement(By.name("country_id"));
		Select value = new Select(country_id);
		value.selectByVisibleText("India");

		driver.findElement(By.name("password")).sendKeys("akashlk19");

		driver.findElement(By.xpath("//div[@class='bg-info']")).click();

		driver.close();

	}

}
