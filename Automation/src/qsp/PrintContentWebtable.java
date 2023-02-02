package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentWebtable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/avnish%20kumar/OneDrive/Desktop/table.html");
		List<WebElement> content = driver.findElements(By.xpath("//td"));
		int count = content.size();
		System.out.println(count);
		for(WebElement text: content) {
			System.out.println(text.getText());
		}
		driver.close();	
		

	}

}
