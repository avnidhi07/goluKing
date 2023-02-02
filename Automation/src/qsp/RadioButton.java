package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		int x1 = driver.findElement(By.name("sex")).getLocation().getY();
		int x2 = driver.findElement(By.name("sex")).getLocation().getY();
		int x3= driver.findElement(By.name("sex")).getLocation().getY();
		if(x1==x2 && x2==x3)
				 {
			System.out.println("it is proper alignment");
		}
		else {
			System.out.println("it is not proper alignment");
		}
		
		driver.close();
		
		
	}	

}
