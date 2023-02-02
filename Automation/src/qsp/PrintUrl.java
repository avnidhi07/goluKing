package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver7.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		List<WebElement> allurl = driver.findElements(By.xpath("//a"));
		int count = allurl.size();
		System.out.println(count);
		for(WebElement text: allurl) {
			System.out.println(text.getAttribute("href"));
		}
			
		
		
		

	}

}
