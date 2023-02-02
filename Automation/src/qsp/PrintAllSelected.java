package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/avnish%20kumar/OneDrive/Desktop/hotel.html");
		WebElement cplistbox = driver.findElement(By.id("cp"));
		Select s=new Select(cplistbox);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		int count = alloptions.size();
		System.out.println(count);
		for(WebElement text:alloptions) {
			System.out.println(text.getText());
		}
        driver.close();
	}

}
