package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="logoutLink")
	private WebElement lgOut;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLgOut() {
		lgOut.click();
	}

	public void setTaskBtn() {
		taskBtn.click();
	}
	

}