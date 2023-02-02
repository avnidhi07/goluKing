package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripNavigate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		List<WebElement> text = driver.findElements(By.xpath("//input[@placeholder='Where from?']"));
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[4]")).click();
		List<WebElement> texts = driver.findElements(By.xpath("//input[@placeholder='Where to?']"));
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[4]")).click();
		Thread.sleep(1000);
		List<WebElement> date = driver.findElements(By.xpath("//div[@role='gridcell']/.."));
		for(int i=0; i<date.size(); i++) {
			String select = date.get(i).getText();
			if(select.equals("31")) {
				date.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
