package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		String color = driver.findElement(By.xpath("//a[.='Forgotten password?']")).getCssValue("color");
		System.out.println(color);
		driver.close();
		
				
				
				
				
				
				
			
		
		}

}
