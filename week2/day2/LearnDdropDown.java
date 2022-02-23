package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDdropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement Dropdown1= driver.findElement(By.id("dropdown1"));
		Select index=new Select(Dropdown1);
		index.selectByIndex(1);
		
		WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		Select text=new Select(dropdown2);
		text.selectByVisibleText("UFT/QTP");
		
		  WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		  Select id=new Select(dropdown3);
		  id.selectByValue("4");
		
		
		
		
		
		

	}

}
