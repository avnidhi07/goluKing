package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptiosWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/avnish%20kumar/OneDrive/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		System.out.println(count);
		for(WebElement text: alloption) {
			System.out.println(text.getText());
		}
		LinkedHashSet alloptions = new LinkedHashSet();
		for(WebElement element: alloption) {
			alloptions.add(element.getText());	
		}
		System.out.println(alloptions);
		
		ArrayList alpha = new ArrayList();
		alpha.addAll(alloption);
		Collections.sort(alpha);
		
		
		
		
	}

}
