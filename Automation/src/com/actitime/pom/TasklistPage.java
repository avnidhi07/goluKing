package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TasklistPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement custName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDes;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selCust;
	
	@FindBy(xpath="//div[text()='Our company']")
	private WebElement selOurComp;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement clkCC;
	
	@FindBy(xpath="//div[@title='HDFC_001']")
	private WebElement actualCustomer;
	
	
	public WebElement getActualCustomer() {
		return actualCustomer;
	}


	public TasklistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddNew() {
		return addNew;
	}


	public WebElement getNewCust() {
		return newCust;
	}


	public WebElement getCustName() {
		return custName;
	}


	public WebElement getCustDes() {
		return custDes;
	}


	public WebElement getSelCust() {
		return selCust;
	}


	public WebElement getSelOurComp() {
		return selOurComp;
	}


	public WebElement getClkCC() {
		return clkCC;
	}


		

	
	


}
