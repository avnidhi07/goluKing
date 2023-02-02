package qsp.HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver7.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Contact")).click();
		String phno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(phno);
		driver.close();

	}

}
