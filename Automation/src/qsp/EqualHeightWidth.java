package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualHeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		int height1=un.getSize().getHeight();
		int width1=un.getSize().getWidth();
		int height2=pwd.getSize().getHeight();
		int width2=pwd.getSize().getWidth();
		if(height1==height2 && width1==width2) {
			System.out.println("it is pass");
			
		}
		else {
			System.out.println("it is fail");
		}
		
		driver.close();
		
		

	}

}
