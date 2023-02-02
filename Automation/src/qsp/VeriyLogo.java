package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		    if(logo==true) {
		    	System.out.println("logo display pass");
		    }
		    	else {
		    		System.out.println("logo display is no pass");
		    	}
		    driver.close();
		    }
		    	

	

}
