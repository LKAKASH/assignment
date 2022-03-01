package week3.Assi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQERYULRESIZE {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement max1 = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-resizable']"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(max1, 100, 50).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		
		//JQERYULRESIZABLE
		driver.switchTo().frame(0);

	}

}
