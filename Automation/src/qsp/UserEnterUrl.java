package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserEnterUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("Enter the URL");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		int count = allLink.size();
		System.out.println(count);
		for(WebElement text: allLink) {
			System.out.println(text.getText());
		}
		driver.close();

	}


}
