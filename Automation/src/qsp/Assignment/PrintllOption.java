package qsp.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintllOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/avnish%20kumar/OneDrive/Desktop/hotel.html");
		WebElement cpListbox = driver.findElement(By.id("cp"));
		Select s = new Select(cpListbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		for(WebElement text:alloptions) {
			System.out.println(text.getText());
		}
		driver.close();
		
		

	}

}
