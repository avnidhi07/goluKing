package qsp.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count = alllink.size();
		System.out.println(count);
		for(WebElement text:alllink) {
			System.out.println(text.getAttribute("href"));
		}
driver.close();


	}

}
