package qsp.HandlingPopup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateScenarioHandlingTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wn:allwh) {
			driver.switchTo().window(wn);
			Thread.sleep(2000);
		List<WebElement> allheading = driver.findElements(By.xpath("//h2"));
		Thread.sleep(2000);
		int count = allheading.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(WebElement wh:allheading) {
			driver.switchTo().window(wn);
			System.out.println(wh.getText());	
		}
		}
		driver.quit();

	}

}
