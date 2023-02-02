package qsp;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyAlign {
		
			static {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.actitime.com/");
				int x1 = driver.findElement(By.id("username")).getLocation().getX();
				int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
				if(x1==x2) {
					System.out.println("username and pass properly alignment and pass");
				}
				else {
					System.out.println("username and pass not properly alignment and fail");
				}
				driver.close();
				
				
				
				
				
				
				
				
			}			

}
