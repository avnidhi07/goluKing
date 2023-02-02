package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugge {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("i phone 14 pro max");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'i phone 14 pro max')]"));
		int count = allsugg.size();
		System.out.println(count);
		for(WebElement text: allsugg) {
			System.out.println(text.getText());
		}
		allsugg.get(count-1).click();
        driver.close();
	}

}
