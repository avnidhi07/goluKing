package qsp.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver7.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/avnish%20kumar/OneDrive/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		//ArrayList<String> al=new ArrayList<>();
		TreeSet<String> ts=new TreeSet<>();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			ts.add(options.get(i).getText());  
		}
		//Collections.sort(al);
		for(String text:ts) {
			System.out.println(text);
		}
		driver.close();

	}
	

}
