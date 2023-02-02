package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListboxTwitter {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']/../..")).click();
		WebElement monthlist = driver.findElement(By.xpath("//select[@aria-invalid='false']"));
		Select s=new Select(monthlist);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("6");
		Thread.sleep(2000);
		s.selectByVisibleText("July");
		
	}

}
