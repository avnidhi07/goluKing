package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogInButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		   boolean logo= driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		   if(logo==true) {
			   System.out.println("log in button is enable");
		   }
		   else {
			   System.out.println("login button is disable");
		   }
		   driver.close();
		   

	}

}
