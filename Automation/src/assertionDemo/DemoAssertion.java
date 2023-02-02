package assertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver7.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "actiTIME -Login";
		String atitle = driver.getTitle();
		
		/*if(etitle.equals(atitle)) {
			Reporter.log("pass",true);
		}
		else {
			Reporter.log("fail",true);
		}*/
		//Assert.assertEquals(etitle, atitle);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(etitle, atitle);
		driver.close();
		s.assertAll();
		
	}

}
