package week3.Assi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQERYULSORTABLE {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/sortable");
		 driver.switchTo().frame(0);
		 WebElement max1 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		 WebElement max6 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6]"));
		 
		 Actions builder = new Actions(driver);
			builder.clickAndHold(max6).moveToElement(max1).click().perform();
			driver.switchTo().defaultContent();
			Thread.sleep(1500);
			driver.close();
		 
		
		
		

	}

}
