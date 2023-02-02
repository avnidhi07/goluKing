package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/avnish%20kumar/OneDrive/Desktop/qspider.html");
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int count = allLink.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
		    String text =allLink.get(i).getText();
			System.out.println(text);
		}
		allLink.get(0).click();
		
	driver.close();

	}

}
