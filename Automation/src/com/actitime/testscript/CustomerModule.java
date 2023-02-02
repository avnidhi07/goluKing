package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasklistPage;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createCustomer",true);
		
		FileLib f=new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 2);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 3);

		
		HomePage h=new HomePage(driver);
		h.setTaskBtn();
		
		TasklistPage t=new TasklistPage(driver);
		t.getAddNew().click();
		t.getNewCust().click();
		t.getCustName().sendKeys(customerName);
		t.getCustDes().sendKeys(customerDescription);
		t.getSelCust().click();
		Thread.sleep(2000);
		t.getSelOurComp().click();
		t.getClkCC().click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), customerName));
		String actualcustomer = t.getActualCustomer().getText();
		Assert.assertEquals(actualcustomer, customerName);
		
	}

}
