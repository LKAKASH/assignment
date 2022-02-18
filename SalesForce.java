package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("akash");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("lk");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("akashlk@123gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Bgmi");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9597752884");

		WebElement UserTitle = driver.findElement(By.name("UserTitle"));
		Select value = new Select(UserTitle);
		value.selectByVisibleText("Sales Manager");

		WebElement CompanyEmployees = driver.findElement(By.name("CompanyEmployees"));
		Select text = new Select(CompanyEmployees);
		text.selectByVisibleText("1 - 15 employees");

		WebElement CompanyCountry = driver.findElement(By.name("CompanyCountry"));
		Select id = new Select(CompanyCountry);
		id.selectByVisibleText("India");

		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();

		driver.close();

	}

}
